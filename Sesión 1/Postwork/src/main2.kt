package postwork1

fun main(){

    val titulo = "Ready Player One"
    val paginas = 464
    val autor = "Ernest Cline"
    val isnb = "978-607-529-386-8"
    val editorial = "Ediciones B"
    val precio = 250
    val descargar = false
    val disponibilidad = 44

    println("El número de páginas del libro $titulo es: $paginas")

    val iva = 1.16f //El porcentaje con impuestos
    val precioPieza = precio*iva // Precio de un producto

    println("El precio del libro sin IVA: $$precio")
    println("El precio del libro con IVA: $$precioPieza")


    val total = precioPieza*disponibilidad; //Valor total de lote
    println("El valor total del lote es de $total pesos")


    val enStock = disponibilidad>=0
    println("¿Hay disponibilidad de libros? $enStock")

}