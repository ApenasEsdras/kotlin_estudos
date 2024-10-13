fun main() {
    println("ULong maximo: ${ULong.MAX_VALUE}  ULong minimo: ${ULong.MIN_VALUE}")
    println("")
    println("UInt maximo: ${UInt.MAX_VALUE}  UInt minimo: ${UInt.MIN_VALUE}")
    println("")
    println("UShort maximo: ${UShort.MAX_VALUE}  UShort minimo: ${UShort.MIN_VALUE}")
    println("")
    println("o Long possui o maximo iguao ao minimo porem um positivo e outro negativo")
    println("Long maximo: ${Long.MAX_VALUE}  Long minimo: ${Long.MIN_VALUE}")


    println("")

    println("tipos usado val var e bool\n")

    println("val === const\n")
    val constante:Int = 4;
    println("  val constante:Int = 4;\n")
    println("constante: $constante\n")

    println("var === var\n")
    println( "var variavel:Int = 4\n")
    var variavel:Int = 4;
    variavel++
    println(" variavel++")
    println("Variavel: $variavel\n")


    println("bool === bool")

    var booleano:Boolean = true
    println("var bool:Boolean = true\n")
    println("boll: $booleano")


}
