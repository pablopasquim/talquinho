package exemploInterface

class Carro(var marcaModelo: String) : IRuning {

    override fun mover() {
        println("O carro $marcaModelo está acelerando...")
    }
}