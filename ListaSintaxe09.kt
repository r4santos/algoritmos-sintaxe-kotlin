fun main() {
        println("Temperatura em fahrenheit: ") //Solicita temperatura em fahrenheit
        val f = readLine()!!.toFloat() //entrada do fahrenheit
        
        val c = 5 * ((f-32) / 9) //calculo
        
        println("$f fahrenheir em Celsius é $c") //Saída do resultado
}