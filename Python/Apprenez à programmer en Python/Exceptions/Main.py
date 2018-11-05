try:
    resultat = numerateur / denominateur
except NameError:
    print ("Numérateur ou dénominateur non défini")
except TypeError:
    print ("Le numérateur ou le dénominateur ne sont pas du bon type")
except ZeroDivisionError as i:
    print ("Division par 0 impossible, erreur capturée dans la variable i")
else:
    print ("Tout est ok", resultat)
finally:
    print("Code exécuté quelque soit le résultat !")


# ASSERT : Vérifier qu'une condition est respecter, sinon renvoyer une erreur
annee = input("Entrer une année supprérieure à 0 :")
try:
    annee = int(annee)
    assert annee > 0
except ValueError:
    print("Vous n'avez pas saisi un nombre")
except AssertionError:
    print("L'année est inférieure ou égale à 0")

# RAISE : Lever une exception
try:
    annee = int(annee)
    if annee  <= 0:
        raise ValueError("L'année saisie est négative ou nulle")
except ValueError:
    print("Valeur invalide")
