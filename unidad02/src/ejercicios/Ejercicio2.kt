package ejercicios

fun obtenerEstadoEnvio(pesoPaquete : Double, distancia : Int) : String {
    if(distancia > 0){
        var tarifa= when {
            distancia > 200 -> 30
            distancia in 51..200 -> 15
            else -> 5
        }
        if(pesoPaquete > 10.0) tarifa += 10
        return "El precio estimado de su envio es $tarifa$."
    }
    return "Distancia no válida"
}

fun main(args: Array<String>) {
    print(obtenerEstadoEnvio(15.0,50))
}