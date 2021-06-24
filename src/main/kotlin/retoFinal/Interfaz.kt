package retoFinal

class Interfaz{

    fun agregar(opc:Int){
        when(opc){
            1->{//busqueda en todo el dispositivo
                println("\n\n")
                println("Búsqueda en todo el dispositivo completada")
                //crear libros de ejemplo
                println("\n")
                val libro1:Libro=Libro()
                libro1.agregar("Tokyo Blues","Haruki Murakami","PDF",1.05f,300)
                libro1.descripcion()
                println("\n")
                val libro2:Libro=Libro()
                libro2.agregar("Muerte en el nilo","Agatha Christie","PDF",1.10f,230)
                libro2.descripcion()
                println("\n")
                val libro3:Libro=Libro()
                libro3.agregar("Ocho casos de poirot","Agatha Christie","PDF",0.60f,153,"El cuerpo sin vida de una heredera yace en el vagón de un tren. Un joven popular es acuchillado en un...")
                libro3.descripcion()
                println("\n\n")
            }
            2->println("No se ha buscado el contenido")
            else->println("Entrada no autorizada")
        }
    }
}