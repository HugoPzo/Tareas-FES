texto_ganador = "Tu Ganas!"
texto_perdedor = "Compu Gana :("

import random
print("Programa piedra-papel-tijeras-lagarto-spock")
print("papel = 0")
print("piedra = 1")
print("tijeras = 2")
print("lagarto = 3")
print("spock = 4")

nombres = ["papel", "piedra", "tijeras", "lagarto", "spock"]

usuario = int(input("Escriba su elección (0, 1, 2, 3 ó 4): "))
compu = random.choice(['0', '1', '2', '3', '4'])
compu_choice = int(compu)
print("La computadora eligió", nombres[int(compu)])
print(f"Escogiste: {nombres[usuario]}")

if ((usuario-compu_choice) % 5) == 0:
    print("Empate")
elif ((usuario-compu_choice) % 5) == 4:
    if usuario == 4 and compu_choice == 0:
        print(texto_perdedor)
    else:
        print(texto_ganador)
elif ((usuario-compu_choice) % 5) == 1:
    if usuario == 0 and compu_choice == 4:
        print(texto_ganador)
    else:
        print(texto_perdedor)
elif ((usuario-compu_choice) % 5) == 3:
    if usuario == 0 and compu_choice == 2:
        print(texto_perdedor)
    elif usuario == 2 and compu_choice == 4:
        print(texto_perdedor)
    else:
        print(texto_ganador)
else:
    if usuario == 2 and compu_choice == 0:
        print(texto_ganador)
    elif usuario == 4 and compu_choice == 2:
        print(texto_ganador)
    else:
        print(texto_perdedor)