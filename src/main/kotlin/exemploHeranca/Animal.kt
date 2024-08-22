package exemploHeranca

open class Animal(var nome: String) {

    constructor() : this("Sei lá")

    open fun eat(){

        println("O animal $nome esta comendo")
    }

}