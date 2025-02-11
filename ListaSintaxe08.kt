fun main() {
        println("Quanto você ganha por hora: ") //Solicita quanto ganha em hora
        val ganho = readLine()!!.toFloat() //entrada do ganho por hora
        
        println("Número de horas trabalhadas no mês: ")
        val hora = readLine()!!.toInt() //entrada do número de horas
        
        val salario = ganho * hora //calculo
        
        println("O salário no mês referido é R$$salario") //Saída do resultado
}