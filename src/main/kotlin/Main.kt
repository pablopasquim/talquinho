import exemploHeranca.*
import exemploInterface.*

fun main() {
    exInterface()
}
fun exHeranca(){
    var animal1 = Animal()
    var animal2 = Animal("Joca")
    var cachorro = Dog("Caramelo")
    var cachorro1 = Dog("Chico Coins", "Lhasa")

    // Chamando a função comer

    animal1.eat()
    animal2.eat()
    cachorro.eat()
    cachorro1.eat()
}
fun exInterface(){

    // Criando instâncias

    var pessoa = Pessoa("Pablo")
    var carro = Carro("Nivus")
    var cavalo = Horse("Apolo")

    pessoa.mover()
    carro.mover()
    cavalo.mover()
}
