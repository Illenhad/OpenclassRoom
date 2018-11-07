import os

reset = True

while reset:
        annee =input(" Quelle année ? ")
        annee = int(annee)
        resetChoix = str()

        if annee % 400 == 0 or (annee % 100 != 0  and annee % 4 == 0):
                print (" Bissextile")
        else:
                print(" Pas bissextile")
    
        # Nouvelle partie ?
        while resetChoix.lower() != "o" and resetChoix.lower() != "n":
                print(" Voulez-vous tester une nouvelle année ? O/N")
                resetChoix = input(" Choix: ")

        # Arrêt du jeu
        if resetChoix.lower() == "n":
                print (" Merci d'avoir joué et à bientôt !")
                reset = False

os.system("pause")
