import string

texto = "ajwqqmfmj"
cont = 0

alphabet =  string.ascii_lowercase
print(alphabet)
dict = {}

for letter in alphabet:
    dict[letter] = 0


for l in texto:
    for key,values in dict.items():
        if l == key:
            dict[l] += 1
            break

print(dict)