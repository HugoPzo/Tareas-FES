# Programa piedra-papel-tijeras septiembre 2024
import random
print("Programa piedra-papel-tijeras")
print("papel = 0")
print("piedra = 1")
print("tijeras = 2")
nombres = ["papel", "piedra", "tijeras"]
usuario = input("escriba su elección (0,1 ó 2):")
compu = random.choice(['0','1','2'])

print("la computadora eligio", nombres[int(compu)])

if usuario == compu:
    print("empate")
elif (int(usuario)-int(compu))%3 == 1:
    print('gana la computadora')
else:
    print('usted gana')