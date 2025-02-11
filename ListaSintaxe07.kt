fun main() {
        println("Digite a largura do quadrado: ") //Solicita a largura do quadrado
        val largura = readLine()!!.toFloat() //entrada do número de metros
        
        val area = largura * largura //calculo
        val dobroa = area * 2
        
        println("A área do quadrado é $area") //Saída do resultado
        println("O dobro da área é $dobroa")
}