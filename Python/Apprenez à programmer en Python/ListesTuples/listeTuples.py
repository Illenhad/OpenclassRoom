# coding: utf-8
import os

# Création d'une liste vide
maListe = list()
# Autre création de liste vide 
maListe2 = []

# Création d'une liste
maListe3 = [1, 2.5, "Liste non vide", maListe2]
#Ajout d'un élément dans la liste
maListe3[2] = "Z"

# Affiche la liste au complet
print (maListe3)
# Affiche le 2e élément de la liste
print(maListe3[1])

# Insérer un élément dans la liste
maListe3.append("Ajout via append")



os.system("pause")