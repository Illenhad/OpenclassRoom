var prixHT = Number(prompt("Veullez entrer le prix Hors Taxe :"));
var taxe = prixHT * 0.196;
var prixTTC = prixHT + taxe;
alert("Le prix TTC est de " + prixTTC +"\nLa taxe est de " + taxe);