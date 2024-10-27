from string import ascii_lowercase

def carga_palabras():
    file = open("words.txt", "r")
    lines = file.readline().split()
    print(f"{len(lines)} Palabras leidas...")
    return lines


def probar_palabra():
    #dkc. fxn fvo fd fdvlo xs uc; nfvc ndld cx jd fue oqcude; nfvc edkldc uheclqkcuxhe fvo fd ldkdurdo; nfvc nve uc vpp vjxqc? fd vhendldo cfvc fd ouo hxc thxn. fd fvo hx edkldc uheclqkcuxhe. fd nve v ekfxpvl vho v mvcfdmvcukuvh. fd fvo hx uhcdldec uh axpucuke. vho suhvppb cfd zdhcpd uhyqueucxl vetdo, "nfdh nupp clvhcxl jd odeclxbdo?" zvvp svpcdldo, "u kxqpo hxc evb xs mb xnh thxnpdozd." "kxqpo bxq evb xs vhbxhd'e?" "fxn kxqpo u eadvt sxl vhxcfdl?" fd sdpc nvlm; xrdlnvlm. cfd uhyqueucxl evuo, "fve vhbxhd cxpo bxq xs eqkf odeclqkcuxh; edc v ovcd?" vho, ve cfd bxqhz mvh fdeucvcdo, fd ndhc xh, "bxq fvrd jddh sxppxndo, oxkcxl. nd ndld vc cfd vulaxlc nfdh bxq vllurdo; xh cfd xjedlrvcuxh cxndl nfdh bxq

    words = carga_palabras()
    word_dict = []
    word = "uc"
    #       ut

    for w in words:
        if len(word) == len(w):
            if w[0] != w[-1]:
                if w[1] == "t":
                    word_dict.append(w)
    
    return print(word_dict), print(f"{len(word_dict)} posibilidades.")


def carga_cifrado():
    file = open("PerezOrtizHugo.txt", "r")
    lines = file.readline()
    return lines

def carga_diccionario():
    
    # Palabra clave = "clvhcxl" -> trantor
    # "clvhcxl" = ['athwart', 'eschews', 'granger', 'marimba', 'prosper', 'remorse', 'tractor', *'traitor']    
    
    dictionary_alphabet = {'a': 'p', 'b': "y", 'c': "t", 'd': "e", 'e': "s", 'f': "h", 'g': "g", 'h': 'n', 'i': "i", 'j': "b", 'k': "c", 'l': "r", 'm': "m", 'n': "w", 'o': "d", 'p': "l", 'q': "u", 'r': 'v', 's': "f", 't': 'k', 'u': "i", 'v': "a", 'w': 'w', 'x': "o", 'y': "q", 'z': "g"}


    return dictionary_alphabet


def cifrar_mensaje(texto_cifrado, diccionario):
    alphabet = ascii_lowercase
    texto_descifrado = ""
    
    for palabra in texto_cifrado:
        if palabra in alphabet:
            if diccionario[palabra] == "0":
                texto_descifrado += palabra
            else:
                texto_descifrado += diccionario[palabra]
        else:
            texto_descifrado += palabra

    return texto_descifrado


def main():
    crypted_text = carga_cifrado()
    words_dictionary = carga_diccionario()
    probar_palabra()

    texto_descrifrado = cifrar_mensaje(crypted_text, words_dictionary)
    print(texto_descrifrado)


if __name__ == "__main__":
    main()