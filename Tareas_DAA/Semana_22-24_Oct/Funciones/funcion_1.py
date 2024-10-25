def es_par(num):
    return (num % 2) == 0

def es_palindromo(palabra):
    return palabra[::-1].strip() == palabra.strip()


# def factorial(num):
#     resultado = 1
#     for n in range(num):
#         resultado = resultado * (n+1)
#     return resultado


# Recursividad - Se llama a los anteriores factoriales
def factorial(num):
    print(f"Sacando el factorial de {num}")
    if num == 0:
        return 1
    else:
        return num * factorial(num-1)



print(es_par(43245))

print(es_palindromo("acurruca"))
print(es_palindromo("aragon"))

print(factorial(5))