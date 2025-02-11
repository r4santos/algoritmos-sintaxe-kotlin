fun main() {
        println("Informe os metros para conversão: ") //Solicita a quantidade de metros para a conversão
        val m = readLine()!!.toFloat() //entrada do número de metros
        
        val cm = m * 100 //conversão
        
        println("$m metros em centímetros é $cm") //Saída do resultado
}