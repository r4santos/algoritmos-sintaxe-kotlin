fun main() {
        println("Temperatura em celsius: ") //Solicita temperatura em celsius
        val c = readLine()!!.toFloat() //entrada do celsius
        
        val f = c * 1.8 + 32 //calculo
        
        println("$c celsius em fahrenheit é $f") //Saída do resultado
}