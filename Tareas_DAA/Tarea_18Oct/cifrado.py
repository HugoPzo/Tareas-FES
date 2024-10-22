from string import ascii_lowercase

def carga_palabras():

    archivo = open("words.txt", "r")
    renglon = archivo.readline()
    palabras = renglon.split()

    return palabras

def carga_palabras_cifrado():

    archivo = open('PerezOrtizHugo.txt', 'r')
    renglon = archivo.readline()
    # palabras_cifrado = renglon.split()

    # return palabras_cifrado
    return renglon

def carga_diccionario(text):
    alphabet = carga_alfabeto()
    dic_alp = {}

    for letter in alphabet:
        dic_alp[letter] = 0

    for c in text:
        if c in dic_alp:
            dic_alp[c] += 1

    return dic_alp

def carga_alfabeto():
    # abcdefghijklmnopqrstuvwxyz
    alphabet = ascii_lowercase
    print(alphabet)
    return alphabet
    
def carga_alfabeto_cifrado():
    #                    abcdefghijklmnopqrstuvwxyz
    encrypt_alphabet  = "fnebxpzgmqjkwdvcslhutraiyo"
    print(encrypt_alphabet)
    return encrypt_alphabet 

def decrypt_message(texto, alphabet, crypt_alphabet):
    decrypted_message = ""
    for i in texto:
        if i in crypt_alphabet:
            pos = crypt_alphabet.index(i)
            decrypted_message += alphabet[pos]
        else:
            decrypted_message += i
        
    return decrypted_message



    gmrzavkstfexpjdcyhqbuownil
    abcdefghijklmnopqrstuvwxyz

def main ():
    PALABRAS = carga_palabras()
    PALABRAS_CIFRADAS = carga_palabras_cifrado()

    alphabet = carga_alfabeto()
    crypted_alphabet = carga_alfabeto_cifrado()

    print(decrypt_message(PALABRAS_CIFRADAS, alphabet, crypted_alphabet))

    print(carga_diccionario("fnebxpzgmqjkwdvcslhutraiyo"))

if __name__ == "__main__":
    main()