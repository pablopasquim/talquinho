package exemploHeranca

class Cat(nome : String, var cor : String) : Animal(nome) {

    constructor(nome: String) : this(nome, "Cinza")

    override fun eat(){
        println("O gato $cor $nome está comendo sachê!")
    }
}