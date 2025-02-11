fun main() {
        println("Digite o raio do círculo: ") //Solicita o raio do circulo
        val raio = readLine()!!.toFloat() //entrada do número de metros
        
        val area = 3.14 * (raio * raio) //calculo
        
        println("A área do circulo é $area") //Saída do resultado
}