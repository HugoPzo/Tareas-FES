package mx.unam.aragon

import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Locale

class MainActivity : AppCompatActivity() {
    var texto:TextToSpeech? = null;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        texto= TextToSpeech(this,this)
        findViewById<Button>(R.id.btnEjecutar).setOnClickListener{
            hablar()
        }
    }

    fun onInit(p0: Int) {
    //verificamos si puede hablar
        if(p0==TextToSpeech.SUCCESS){
            findViewById<TextView>(R.id.textView_1).text="Si puede hablar"
            val localSpanish = Locale("spa", "MEX")
            texto!!.setLanguage(localSpanish)
        }else{
            findViewById<TextView>(R.id.textView_1).text="No puede hablar"
        }
    }
    private fun hablar(){
        var mensaje:String=findViewById<TextView>(R.id.textView_1).text.toString();
        texto!!.speak(mensaje,TextToSpeech.QUEUE_FLUSH,null,"")
    }
}
