annee =input("Quelle année ?")
annee = int(annee)

if annee % 400 == 0 or (annee % 100 != 0  and annee % 4 == 0):
    print ("Bissextile")
else:
    print("Pas bissextile")