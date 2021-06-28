package postwork3


class Mobile(
    val sku: Int,
    private val brand: String,
    val color: String,
    private val model: String,
    private val price: Float){

    init {
        println("El celular es un $model de la marca $brand")
    }

}
