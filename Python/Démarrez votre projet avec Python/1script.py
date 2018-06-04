# -*- coding: utf-8 -*-
import random
import json

#Importer fichier json et convertir en python
def read_value_from_json(file, key):
    values = []
    with open(file) as f:
        data = json.load(f)
        for entry in data:
            values.append(entry[key])
    return values

#Message
def message(character, quote):
    n_character = character.capitalize()
    n_quote = quote.capitalize()
    return "{} a dit : {}".format(n_character, n_quote)

#Nombre au hasard   
def get_random_item_in(my_list):
    rand_numb = random.randint(0, len(my_list) - 1)
    item = my_list[rand_numb]
    return item

#renvoi un personnage au hasard
def get_random_character():
    all_values = read_value_from_json('characters.json', 'character')
    return get_random_item_in(all_values)

#renvoi une citation au hasard
def get_random_quote():
    all_values = read_value_from_json('quote.json', 'quote')
    return get_random_item_in(all_values)

#programme
user_answer = input('Tapez Entrer pour une citation ou B pour quitter\n')

while user_answer != "B":
    print( message(get_random_character(), get_random_quote() ) )
    user_answer = input('Tapez Entrer pour une citation ou B pour quitter\n')
