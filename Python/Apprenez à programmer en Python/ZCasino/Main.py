#Import
import random
import math

#Variable
total = 10
compteur = 1
continu = True


while continu :
    # Définition d'un nombre aléatoire
    numObtenu = random.randrange(50)

    numChoisi = input("Entrez le numéro de votre choix entre 0 et 49: ")
    mise = input("Entrez votre mise: ")

    numChoisi = int(numChoisi)
    mise = int(mise)

    # Vérification des variables
    while numChoisi < 0 or numChoisi > 49:
        numChoisi = input("Entrez le numéro de votre choix entre 0 et 49: ")

    while mise > total:
        print("Vous n'avez pas autant d'argent !")
        mise = input("Entrez votre mise: ")

    # Lancement de la partie
    print("Partie numéro :", compteur)
    print("Lancement de la roulette......")
    print("Le résultat est: ", numObtenu)
    if numChoisi == numObtenu:
        total = total + (mise * 3)
        print ("Jackpot ! Vous gagnez :", (mise *3))
    elif (numChoisi % 2 == 0 and numObtenu % 2 == 0) or (numChoisi % 2 != 0 and numObtenu % 2 != 0):
        total = total + math.ceil(mise * 0.5)
        print("Couleur ! vous récupérez: ", (mise * 0.5))
    else:
        total = total - mise
        print("Dommage, vous perdez votre mise.")
    compteur += 1

    # Vérification du total
    if total <=0:
        print ("Vous êtes ruiné !")
        continu = False
    else:
        print("Il vous reste :", total)

    # Continue
    if continu:
        a = input("Voulez-vous continuer ? O/N ")
        if a == "N" or a == "n":
            continu = False


print("La partie est finie, votre total est de", total, "après", compteur, "parties.")
