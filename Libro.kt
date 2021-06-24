package retoFinal

class Libro (){
    var titulo: String = ""
    var autor: String = ""
    var formato: String = ""
    var tamano: Float = 0.0f
    var paginas: Int = 0
    var paginaActual: Int = 0
    var estatus: String = "Pendiente"
    var serie: String = ""
    var favorito: Boolean = false
    var eliminado: Boolean = false
    var coleccion: String = ""
    var carpeta: String = ""
    var resena: String = ""

    fun agregar(titulo: String, autor: String, formato: String, tamano: Float, paginas: Int, resena: String = ""){
        this.titulo = titulo
        this.autor = autor
        this.formato = formato
        this.tamano = tamano
        this.paginas = paginas
        this.resena = resena
    }

    fun descripcion(){
        println("Titulo : $titulo \n" +
                "Autor : $autor \n" +
                "Formato : $formato \n" +
                "Tamano : $tamano \n" +
                "Paginas : $paginas \n" +
                "Resena : $resena \n" +
                "Estatus : $estatus \n" +
                "Serie : $serie \n"
        )
    }
}