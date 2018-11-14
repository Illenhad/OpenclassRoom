var nb1 = Number(prompt("Entrez le premier nombre: "));
var nb2 = Number(prompt("Entrez le second nombre: "));

if (nb1 > nb2) {
    console.log(nb1 + " est supérieur à " + nb2);
} else if (nb2 > nb1) {
    console.log(nb1 + " est inférieur à " + nb2);
} else {
    console.log("Les deux nombres sont égaux.");
}
