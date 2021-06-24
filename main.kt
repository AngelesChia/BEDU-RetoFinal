package retoFinal

fun main(){
    println("Bienvenido!\n" +
            "Leer libros, revistas, reportes y documentos de varios formatos \n" +
            "es simple con *nombre del proyecto*, ya que el lector podra administrar \n" +
            "la organizacion de su biblioteca.\n\n")

    println("¿Desea continuar? \n" +
            "1)Sí \n" +
            "2)No")

    var opc=readLine()!!.toInt()

    when(opc){
        1->{
            val ingreso:Interfaz=Interfaz()
            println("¿Quiere encontrar todos los libros y documentos disponibles en el dispositivo? \n" +
                    "1)Encontrar \n" +
                    "2)Cancelar")

            opc= readLine()!!.toInt()

            ingreso.agregar(opc)
        }
        2->println("No es posible continuar")
        else->println("Ingreso no válido")
    }
}