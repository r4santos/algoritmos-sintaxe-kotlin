fun main() {
  println("Informe o primeiro número: ") //Solicita o primeiro número
        val num1 = readLine()!!.toInt() //entrada do primeiro número
        println("Informe o segundo número: ") //Solicita o segundo número
        val num2 = readLine()!!.toInt() //entrada do segundo número
        
        val soma = num1 + num2 //soma dos números
        
        println("O número informado foi $soma") //Saída do resultado
}