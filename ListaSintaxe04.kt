fun main() {
        println("Informe a primeira nota: ") //Solicita o primeiro número
        val nota1 = readLine()!!.toFloat() //entrada da primeira nota
        
        println("Informe a segunda nota: ") //Solicita o segundo número
        val nota2 = readLine()!!.toFloat() //entrada da segunda nota
        
        println("Informe a terceira nota: ") //Solicita o primeiro número
        val nota3 = readLine()!!.toFloat() //entrada da primeira nota
        
        println("Informe a quarta nota: ") //Solicita o segundo número
        val nota4 = readLine()!!.toFloat() //entrada da segunda nota
        
        val media = (nota1 + nota2 + nota3 + nota4) / 4 //soma dos números
        
        println("A média bimestral foi $media") //Saída do resultado
}