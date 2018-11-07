#Import
import random
import math
import os

#Variable
total = 10
compteur = 0
continu = True


while continu :

    numChoisi = 0
    mise = 0
    compteur += 1

    # Définition d'un nombre aléatoire
    numObtenu = (random.randrange(50)+1)

    # Vérification des variables
    print(" ——————————————————————————————————————")
    while numChoisi < 1 or numChoisi > 50:
        numChoisi = int(input(" Entrez le numéro de votre choix entre 1 et 50: "))

    while mise > total or mise < 1:
        print(" Vous possedez :",total)
        mise = int(input(" Entrez votre mise: "))
        
        if mise > total:    
            print(" Vous n'avez pas autant d'argent !")
        elif mise < 1:
            print(" On ne joue pas gratis !")
    print(" ——————————————————————————————————————")

    # Lancement de la partie
    print(" Partie numéro :", compteur)
    print(" Lancement de la roulette......")
    print(" Le résultat est: ", numObtenu)
    if numChoisi == numObtenu:
        total = total + (mise * 3)
        print (" Jackpot ! Vous gagnez :", (mise *3))
    elif (numChoisi % 2 == 0 and numObtenu % 2 == 0) or (numChoisi % 2 != 0 and numObtenu % 2 != 0):
        total = total + math.ceil(mise * 0.5)
        print(" Couleur ! vous récupérez: ", (mise * 0.5))
    else:
        total = total - mise
        print(" Dommage, vous perdez votre mise.")
    

    # Vérification du total
    if total <=0:
        print (" Vous êtes ruiné !")
        continu = False
    else:
        print(" Il vous reste :", total)

    # Continue
    if continu:
        reponse = str()
        while reponse.lower() != "o" and reponse.lower() != "n":
            print(" Voulez-vous continuer ? O/N ")
            reponse = input()

        if reponse.lower() == "n":
            continu = False



print(" La partie est finie, votre total est de", total, "après", compteur, "parties.")

os.system("pause")