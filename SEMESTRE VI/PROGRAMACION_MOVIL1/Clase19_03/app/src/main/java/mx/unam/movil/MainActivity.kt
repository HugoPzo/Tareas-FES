package mx.unam.movil

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import mx.unam.movil.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        inicioToolsBar()
    }

    private fun inicioToolsBar() {
        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)
        drawer = findViewById(R.id.drawer_layout)
        val toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.abrir, R.string.cerrar)
        drawer.addDrawerListener(toggle)
        toggle.syncState()
        toolbar.setNavigationIcon(R.drawable.logo_unam)
        iniciarNavegacionView()

    }

    private fun iniciarNavegacionView() {
        val navegacionView: NavigationView = findViewById(R.id.nav_view)
        navegacionView.setNavigationItemSelectedListener(this)
        val headerView: View = LayoutInflater.from(this).inflate(
            R.layout.header_main,
            navegacionView, false
        )
        navegacionView.addHeaderView(headerView)

    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.linear_layout->{
                startActivity(Intent(this,LinearLayout::class.java))
            }
            R.id.contraint_layout->{
                startActivity(Intent(this,ConstraintActivity::class.java))
            }
            R.id.nestedscrollview->{
                startActivity(Intent(this,NestedScrollViewActivity::class.java))
            }
            R.id.collapsing->{
                startActivity(Intent(this,CollapsingToolbarLayout::class.java))
            }
            R.id.nestedscrollview->{
                startActivity(Intent(this,NestedScrollViewActivity::class.java))
            }
            R.id.framelayout->{
                startActivity(Intent(this,FrameLayout::class.java))
            }
        }
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

}

