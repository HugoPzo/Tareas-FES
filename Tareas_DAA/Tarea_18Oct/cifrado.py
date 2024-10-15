def carga_palabras():
    archivo = open("Tarea_18Oct\\words.txt", "r")
    renglon = archivo.readline()
    palabras = renglon.split()
    print(len(palabras), 'palabras leidas')
    return palabras

def carga_cifrado():
    archivo = open('\\Tarea_18Oct\\PerezOrtizHugo.txt', 'r')
    renglon = archivo.readline()
    return renglon


def main ():
    palabras = carga_palabras()
    print(palabras)

if __name__ == "__main__":
    main()