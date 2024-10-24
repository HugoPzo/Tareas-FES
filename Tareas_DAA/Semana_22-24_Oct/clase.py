class Cosa:

    def __init__(self, nombre, peso, costo):
        self.nombre = nombre
        self.peso = peso 
        self.costo = costo


def evalua(lista, comb, limite):
    ganancia = 0
    peso_total = 0

    n = len(lista)
    for i in range(n):
        if comb[i] == "1":
            ganancia += lista[i].costo
            peso_total += lista[i].peso

    if peso_total > limite:
        return -1
    else:
        return ganancia

lista = []

lista.append(Cosa("laptop", 3, 7000))
lista.append(Cosa("libro", 1, 200))
lista.append(Cosa("lampara", 3, 500))
lista.append(Cosa("licuadora", 5, 700))

n = len(lista)
#       Convertimos en binario -> Rellenamos con 0
mejor_combinacion = 0
mejor_ganancia = 0
for i in range(n**2):
    comb = bin(i)[2:].zfill(4)
    g = evalua(lista, comb, 10)
    print(f"{i} - {comb} - ${g}")

    if g > mejor_ganancia:
        mejor_ganancia = g
        mejor_combinacion = comb

print(f"La mejor combinacion es: {mejor_combinacion}")
print(f"La ganancia es: {mejor_ganancia}")