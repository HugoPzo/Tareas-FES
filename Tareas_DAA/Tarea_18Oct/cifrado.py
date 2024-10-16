from string import ascii_lowercase

def carga_alfabeto():
    alfabeto = ascii_lowercase
    return alfabeto

def carga_palabras():
    archivo = open("/home/hugo_pzz/Documentos/Tareas-FES/Tareas_DAA/Tarea_18Oct/words.txt", "r")
    renglon = archivo.readline()
    palabras = renglon.split()
    print(len(palabras), 'palabras leidas')
    return palabras

def carga_cifrado():
    archivo = open('/home/hugo_pzz/Documentos/Tareas-FES/Tareas_DAA/Tarea_18Oct/PerezOrtizHugo.txt', 'r')
    renglon = archivo.readline()
    palabras = renglon.split()
    return palabras


def main ():
    alfabeto = carga_alfabeto()
    palabras = carga_palabras()
    palabras_textoPersonal = carga_cifrado()

    word = "clvhcxl"

    # print(palabras)

    for i in palabras:
        if len(i) == len(word):
            if i[0] == i[4] and i[1] == i[-1]:
                print(i)
            
        
        
                

    


if __name__ == "__main__":
    main()