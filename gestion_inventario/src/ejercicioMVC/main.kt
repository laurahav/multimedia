package ejercicioMVC

import ejercicioMVC.bussiness.Product
import ejercicioMVC.bussiness.Categoria
import ejercicioMVC.controller.ProductController
import ejercicioMVC.model.ProductModel
import ejercicioMVC.view.ProductView

fun main() {
    val producto : Product = Product(1, "patata", 2.00, 20, Categoria.valueOf("ALIMENTACION"))
    val productModel : ProductModel = ProductModel(mutableListOf())
    productModel.insertar(producto)
    val productController : ProductController = ProductController(productModel)
    val productView : ProductView = ProductView(productController)
}