package exemploHeranca
class Dog(nome : String,var raca : String) : Animal(nome) {

    constructor(nome: String) : this(nome, "Huscky")
    override fun eat() {
        println("O cachorro $nome ($raca) está comendo ração!")
    }

}