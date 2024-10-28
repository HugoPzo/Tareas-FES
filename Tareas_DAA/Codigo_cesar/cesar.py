import matplotlib.pyplot as plt

def carga_palabras():
    archivo = open('\\words.txt', 'r')
    renglon = archivo.readline()
    palabras = renglon.split()
    print(len(palabras), 'palabras leidas')
    return palabras

def carga_cifrado():
    archivo = open('textoCifrado.txt', 'r')
    renglon = archivo.readline()
    return renglon

def cifra_cesar(cadena, llave):
    if llave < 0:
        llave = 26 - llave
    nuevaCadena = ""
    alfabeto = 'abcdefghijklmnopqrstuvwxyz'
    for l in cadena:
        if l in alfabeto:
            posicionLetra = alfabeto.find(l)
            nuevaCadena = nuevaCadena + alfabeto[((posicionLetra+llave) % 26)]
        else:
            nuevaCadena = nuevaCadena + l
    return nuevaCadena

def descifra_cesar(cadena, llave):
    return cifra_cesar(cadena, 26-llave)

def get_aciertos(listaPalabras, diccionario):
    return numAciertos

palabras = carga_palabras()
cadena = carga_cifrado()
maxAciertos = 0
posibleLlave = 0

for cont in range(26):
    cadenaCifrada = descifra_cesar(cadena, cont)
    listaCifrada = cadenaCifrada.split()
    numAciertos = get_aciertos(listaCifrada, palabras)
    if numAciertos > maxAciertos:
        maxAciertos = numAciertos
        posibleLlave = 26 - cont

print("La llave es", posibleLlave)
print("El texto descifrado es:")
print(cifra_cesar(cadena, posibleLlave))