package exemploInterface

class Horse(var name: String) : IRuning {
    override fun mover() {
        println("O cavalo $name está galopando...")
    }


}