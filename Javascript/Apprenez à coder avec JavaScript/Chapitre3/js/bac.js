var moyenne = Number(prompt("Entrez votre moyenne: "));


if (moyenne >= 12 && moyenne <= 20){
    console.log("Vous êtes reçu avec mention !");
} else if (moyenne <12 && moyenne >= 10){
    console.log ("Vous êtes reçu !");
}else if (moyenne < 10 && moyenne >=0 ){
    console.log("Vous êtes recalé !");
} else {
    console.log("Votre moyenne doit être compris entre 0 et 20 !");
}