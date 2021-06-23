package ConceitosIniciais

fun calculaBonus2(a: Int , b: Int , c: Int) {
    println("O bônus é: ${a + b * c * 2}")
}

fun hello1(nome: String) = "Óla, $nome"

fun soma (a: Int, b: Int) = a + b

fun main() {
    val a  = 10
    val b  = 20
    val c  = 30

    calculaBonus2(a, b, c)
    println(hello1("Marcos"))
    println(soma(2, 2))






}

