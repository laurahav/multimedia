package ejercicios

fun formatearUsuario(nombre: String, apellido: String, titulo: String? = "", mayusculas: Boolean = false): String {
    var cadena = "$nombre $apellido"

    titulo?.let {
        cadena = "$titulo" + cadena
    }

    if(mayusculas){
        cadena = cadena.uppercase()
    }

    return cadena
}

fun main(args: Array<String>) {
    print(formatearUsuario(nombre ="Laura", apellido = "Havadtai", titulo = null))
}