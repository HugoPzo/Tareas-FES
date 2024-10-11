import string
import matplotlib.pyplot as plt


def cifra_sustitucion(cad, llave):
    cifrado = ""
    for c in cad:
        if c in alphabet:
            pos = alphabet.index(c)
            cifrado += llave[pos]
        else:
            cifrado += c
    return cifrado


alphabet = string.ascii_lowercase
alpha_dic = {}
llave = "mansbdvfcgxhzjkploqwietyru"

print(alphabet)

num = 0
for letter in alphabet:
    alpha_dic[letter] = num
    num += 1

cad = "Esta es una prueba de texto para probar algunas estructuras de datos con unos alumnos que ya no se han de acordar de lo ultimo que vieron porque ya tienen un monton de tiempo sin clases"

texto = cifra_sustitucion(cad, llave)
print(texto)

for letter in texto:
    if letter in alphabet:
        alpha_dic[letter] += 1
    

datos = []
for d in alpha_dic.values():
    datos.append(d)

plt.plot(alpha_dic.values())
plt.show()

print(alpha_dic)


