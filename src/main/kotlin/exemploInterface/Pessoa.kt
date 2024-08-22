package exemploInterface

class Pessoa(var nome: String) : IRuning{

    override fun mover() {
        println("A pessoa $nome está caminhando....")
    }
}