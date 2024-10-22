from string import ascii_lowercase

def carga_palabras():

    archivo = open("words.txt", "r")
    renglon = archivo.readline()
    palabras = renglon.split()

    return palabras

def carga_palabras_cifrado():

    archivo = open('PerezOrtizHugo.txt', 'r')
    renglon = archivo.readline()
    palabras_cifrado = renglon.split()

    return palabras_cifrado

def carga_diccionario(text):
    alphabet = ascii_lowercase
    dic_alp = {}

    for letter in alphabet:
        dic_alp[letter] = 0

    for c in text:
        if c in dic_alp:
            dic_alp[c] += 1

    return dic_alp
    

def main ():
    PALABRAS = carga_palabras()
    PALABRAS_CIFRADAS = carga_palabras_cifrado()

    word_dict = []
    # word = "ouo"
    # word = "vllurdo"
    # word = "clvhcxl"
    # word = "jddh"
    # word = "vpp"
    # word = "sxppxndo"
    # word = "fd"
    word = "fve"

    for i in PALABRAS:
        if len(i) == len(word):
            if i[0] != i[-1]:
                if i[0] == "a":
                    if i[1] == "o":
                        word_dict.append(i)



            # if i[0] == i[4]:
            #     if i[1] == i[-1]:
            #         if i[-1] != i[-2]:
            #             if i[1] != i[2]:
            #                 if i[3] != i[4]:
            #                     if i[-2] != i[-3]:
            #                         if i[1] != i[3]:
                                
                                        

    print(word_dict)

    word_di = ""
    resultado = word_di.join(word_dict)
    print(carga_diccionario(resultado))
    print(f"{len(word_dict)} posiblidades...")
    


if __name__ == "__main__":
    main()
