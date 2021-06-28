package postwork3

    const val PHONE_LENGTH = 10

//los atributos declarados en el constructor son obligatorios desde el principio
//mientras que en los del cuerpo, son opcionales y se acceden al actualizar el perfil.
//No queremos que nadie modifique ningún atributo directamente, por eso todos serán privados
class User(
    private val name: String,
    private var age: Int,
    private val userToken: String,
    private val email: String ){

    private var phoneNumber: Long = 0
        set(value){  //Utilizamos un setter para guardar un valor sólo cuando cumpla con los 10 dígitos de un número telefónico
            if(value.toString().length == PHONE_LENGTH){
                field = value
            } else{
                println("El número que ingresaste es incorrecto")
            }
        }

    //Esta función nos permite actualizar los datos modificables de nuestro perfil
    fun updateProfile(phoneNumber: Long, age:Int){
        this.phoneNumber = phoneNumber
        this.age =  age
    }

}
