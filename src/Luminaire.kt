class Luminaire: Eclairage {
    val ampoule1 = AmpouleLed()
    val ampoule2 = AmpouleIncandescente()
    val ampoule3 = AmpouleTube()
    val ampoule4 = AmpouleIncandescente()
    var etat1: Int  = 0
    var etat2: Int = 0
    var etat3: Int  = 0
    var etat4: Int  = 0
    fun ampoule1() {
        this.etat1 = 0
    }
    fun ampoule2() {
        this.etat2 = 0
    }
    fun ampoule3() {
        this.etat3 = 0
    }
    fun ampoule4() {
        this.etat4 = 0
    }
    private fun probaPanne(): Int {
        val alea = (0..100).random() // generated random from 0 to 100 included
        return if (alea < 10) {
            -1
        } else 0
    }

    override fun allumer() {
    ampoule1.allumer()
    ampoule2.allumer()
    ampoule3.allumer()
    ampoule4.allumer()
    }


    override fun eteindre() {
        ampoule1.eteindre()
        ampoule2.eteindre()
        ampoule3.eteindre()
        ampoule4.eteindre()
    }

    override fun intensifier() {
    ampoule1.intensifier()
    ampoule2.intensifier()
    ampoule3.intensifier()
    ampoule4.intensifier()
    }

    override   fun diminuer() {
        ampoule1.diminuer()
        ampoule2.diminuer()
        ampoule3.diminuer()
        ampoule4.diminuer()
    }

    override fun etat(): Int {
    return  ampoule1.etat() and ampoule2.etat() and ampoule3.etat() and ampoule4.etat()



    }
    override fun toString(): String {
        return this.javaClass.name + " : " + ampoule1.etat() +" "+ ampoule2.etat() +" " +ampoule3.etat() +" "+ ampoule4.etat()
}
}