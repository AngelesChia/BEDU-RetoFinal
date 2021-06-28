package postwork2

//en el main llamamos a login
fun main(){
    val resultado1 = login("kotlin@bedu.org","Kotlindesarrollos")
    println(resultado1)

    val resultado2 = login("kotlin@bedu.org","Kotlindesarrollo")
    println(resultado2)

    println("-------------------")
    println(cartelera())
}


//para hacer login si la aplicación lo requiere
fun login(user: String, pass:String): Boolean{

    if(user=="kotlin@bedu.org" && pass=="Kotlindesarrollo"){
        println("Inicio de sesión exitoso")
        return true
    } else{
        println("Usuario o contraseña incorrecto")
        return false
    }
}

//si tenemos un reproductor de audio, podemos hacer una función para reproducir y otra para pausar
fun reproducirCancion(cancion: String){
    println("Reproduciendo canción: $cancion")
}

fun pausar(){
    println("Canción pausada")
}

fun pagar(saldo: Double, precio: Double){
    if(saldo>=precio){
        var res: Double
        res = saldo - precio
        println("Artículo comprado, saldo restante: $res pesos")
    } else{
        println("Necesitas saldo suficiente para poder comprar este producto")
    }
}


fun elegirPais(country:String){
    when(country){
        "México" ->{
            val idioma = "Español"
            val divisa = "Peso"
            //actualizarPerfil(pais)
            println("Bienvenido a Bedu shop")
        }
        "Francia" -> {
            val idioma = "Francés"
            val divisa = "Euro"
            //val credito = convertirAEuros(saldo)
            println("Soyez Bienvenu à Bedu shop")
        }
        "Estados Unidos" -> {
            val idioma = "Inglés"
            val divisa = "Dolar"
            //val credito = convertirADolares(saldo)
            println("Welcome to Bedu shop")
        }
        else ->{
            println("Lo sentimos, este servicio no está disponible en tu país")
        }

    }
}

val usuarios = mapOf(
    "kotlin@bedu.org" to  "Kotlindesarrollo",
    "daniel@cliente.com" to "Cliente123",
    "Fernando@empresa.mx" to "F3R2472"
)

fun cartelera(){
    for(pelicula in peliculas){
        println(pelicula)
    }
}

val peliculas = setOf(
    "Scary movie",
    "Scary movie 2",
    "Las trillizas de Belleville",
    "Midori",
    "Doce monos",
    "Blade runner",
    "Mulán"
)

