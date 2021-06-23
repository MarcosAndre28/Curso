package CrontroleDeFluxo

fun calculaBonus2(cargo: String, salario: Float): Float {
    // Gerente Junior, Gerente Senior, coordenador
    val bonus: Float
    if (cargo == "Coordenador") {
        bonus = salario * 0.2f
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 0.5f
    } else {
        bonus = salario * 2
    }
    return bonus
}

//if - else
fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
}

/*fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Não e maior de idade")
    }
}*/
// ctrl+alt+l  comando para organizar
fun main() {

    val valor = 10
    // String str = valor ==10 ? "Sim" : "Não"

    val str = if (valor == 10) "Sim" else "Não"


    maiorDeIdade(10)
    maiorDeIdade(78)
    maiorDeIdade(21)

    println(calculaBonus2("Coordenador", 1000f))
    println(calculaBonus2("Gerente Junior", 1000f))
    println(calculaBonus2("Gerente Senior", 1000f))
}