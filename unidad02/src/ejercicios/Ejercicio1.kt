package ejercicios

fun calcularPrecioFinal(precioBase: Double, codigoDescuento: String?="") : Double {
    precioBase?.let {
        if(precioBase <= 0) {
            return 0.0
        }
        val precioFinal = when (codigoDescuento){
            "PROMO10" -> precioBase * 0.9
            "PROMO20" -> precioBase * 0.8
            else -> precioBase
        }
        return precioFinal
    }
    return 0.0
}

fun main() {
    print(calcularPrecioFinal(2.0,null))
}