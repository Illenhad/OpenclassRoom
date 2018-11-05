# -*-coding:Latin-1  -*
import os
def table(nb, max=10):
    """
    Définition de la fonction table
    nb = multiplicateur
    max = max de la table de multiplication (10 par défaut)
    """
    i = 0
    while i < max:
        print(i+1, "*", nb, "=", (i+1)*nb)
        i += 1

a = input("Table de mutliplication:")
a = int(a)
b = input("Max:")
b = int(b)

table(a,b)

print("---------------------------------------")

"""Fonction retournant le carré de l'argument"""
x = lambda c: c * c
d = input("Mise au carré\nEntrer une valeur: ")
d = int(d)
print (d, "*", d, "= ", x(d))

os.system("pause")