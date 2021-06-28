package retoFinal2

// En el main se loggea y busca un libro
fun main(){

    val resultado1 = login("Anthony","AppReadEras")
    println(resultado1)

    val resultado2 = login("Anthony","AppReadEra")
    println(resultado2)

    println("------------------------------")
    comprarLibro(500.0, 290.0)
    println("------------------------------")
    println(biblioteca())
    println("------------------------------")
    libroAbierto("Ready Player One")
    libroCerrado()
}


//Función de login
fun login(user: String, pass:String): Boolean{

    if(user == "Anthony" && pass == "AppReadEra"){
        println("Inicio de sesión exitoso")
        return true
    } else{
        println("Usuario o contraseña incorrecto")
        return false
    }
}

//Función pagar libro
fun comprarLibro(saldo: Double, precio: Double){
    if(saldo>=precio){
        var res: Double
        res = saldo - precio
        println("Artículo comprado, saldo restante: $$res pesos")
    } else{
        println("Necesitas saldo suficiente para poder comprar este producto")
    }
}

fun biblioteca(){
    val libros = listOf(
        "Ready Player One",
        "El Psicoanalista",
        "Los Corruptores",
        "Los 3 cochinitos",
        "El principito",
        "Milena o el fémur más bello del mundo"
    )

    for(libro in libros){
        println(libro)
    }
}

//Estados del libro
fun libroAbierto(libro: String){
    println("Leyendo libro: $libro")
}

fun libroCerrado(){
    println("Cerrando libro")
}




