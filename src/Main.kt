//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val eclairage = AmpouleIncandescente();
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    var nbCycles = 0;
    do{
        eclairage.allumer();
        while(eclairage.etat() > 0 ){
            eclairage.diminuer();
        }
        println(eclairage.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairage.etat() != -1);
    println("nombre de cycles incandescente "+nbCycles);

    /** Ampoule Tube  */


    val eclairagetube = AmpouleTube()
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    nbCycles = 0
    do{
        eclairagetube.allumer();
        while(eclairagetube.etat() > 0 ){
            eclairagetube.diminuer();
        }
        println(eclairagetube.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairagetube.etat() != -1);
    println("nombre de cycles tube "+nbCycles);

    /** Ampouleled  */

    val eclairageled = AmpouleLed()
    /**
     * Cycles d'éclairage et d'extinction d'une ampoule
     */
    nbCycles = 0
    do{
        eclairageled.allumer();
        while(eclairageled.etat() > 0 ){
            eclairageled.diminuer();
        }
        println(eclairageled.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && eclairageled.etat() != -1);
    println("nombre de cycles led "+nbCycles);
/** Luminaire  */
    var ampoule1 = Luminaire()
    nbCycles = 0
    do{
        ampoule1.allumer();
        while(ampoule1.etat() > 0 ){
            ampoule1.diminuer();
        }
        println(ampoule1.toString());
        nbCycles ++;
    }while (nbCycles < 1000 && ampoule1.etat() != -1);
    println("nombre de cycles  "+nbCycles);
}