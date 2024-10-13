fun main() {
    var cargo:String = "marido"

    when(cargo){
        "Assistente" -> println("salario: " + 2000f)
        "Junior" -> println("salario: " + 3000f)
        "Pleno" -> println("salario: " + 5000f)
        "Senior" -> println("salario: " + 10000f)
        "Arquiteto" -> println("salario: " + 15000f)
        else -> println("cargo nao encontrado para: $cargo")
    }
}