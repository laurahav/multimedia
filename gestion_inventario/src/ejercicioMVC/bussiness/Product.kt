package ejercicioMVC.bussiness

enum class Categoria {
    ELECTRONICA, ROPA, ALIMENTACION, HOGAR;
}
data class Product(
    var id: Int,
    var nombre: String?,
    var precio: Double,
    var stock: Int,
    var categoria: Categoria) {
}