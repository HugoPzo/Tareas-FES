# Ejercicio Resuelto en menor cantidad de lineas

texto_ganador = "Tu Ganas!"
texto_perdedor = "Compu Gana :("

import random
print("Programa piedra-papel-tijeras-lagarto-spock")
print("papel = 0")
print("spock = 1")
print("piedra = 2")
print("tijeras = 3")
print("lagarto = 4")

nombres = ["papel", "spock", "piedra", "tijeras", "lagarto"]

usuario = int(input("Escriba su elección (0, 1, 2, 3 o 4): "))
compu = random.choice(['0', '1', '2', '3', '4'])
compu_choice = int(compu)
print("La computadora eligió", nombres[int(compu)])
print(f"Escogiste: {nombres[usuario]}")


if ((usuario-compu_choice)%5) == 3 or ((usuario-compu_choice)%5) == 4:
    print("Ganasteee!!")
elif ((usuario-compu_choice)%5) == 1 or ((usuario-compu_choice)%5) == 2:
    print("Gano la Compu :(")
else:
    print("Empate")
