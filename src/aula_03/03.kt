fun main() {
    println("trabalhando com funcoes e suas chamas\n")
    inicio(1, 10, 5)  // Começa na página 1, com 10 dados por página e 5 páginas no total
}

fun inicio(pagina: Int, porpagina: Int, totalPaginas: Int) {
    println("virifica as paginas")
    verificaPagina(pagina, porpagina, totalPaginas)
}

fun verificaPagina(pagina: Int, porpagina: Int, totalPaginas: Int) {
    val dadosPorPagina = porpagina
    var totalDadosGravados = 0.0;

  // cria-se a variavel de iteração 'paginaAtual' e percorre o intercvalo entre 'pagina' e 'totalPaginas'
    for (paginaAtual in pagina..totalPaginas) {
        println("Pagina: $paginaAtual")
        gravaDados(dadosPorPagina)
        totalDadosGravados += dadosPorPagina
        println("totalDadosGravados: $totalDadosGravados")
    }

    finaliza()
}

fun gravaDados(dadosPorPagina: Int) {
    println("Dados gravados: $dadosPorPagina")
}

fun finaliza() {
    println("\nFinalizando a operação: todas as páginas foram processadas.")
}