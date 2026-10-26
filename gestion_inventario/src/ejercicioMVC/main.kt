package ejercicioMVC

import ejercicioMVC.bussiness.Product
import ejercicioMVC.bussiness.Categoria
import ejercicioMVC.controller.ProductController
import ejercicioMVC.model.ProductModel
import ejercicioMVC.view.ProductView

fun main() {
    val productModel : ProductModel = ProductModel(mutableListOf())
    val productController : ProductController = ProductController(productModel)
    val productView : ProductView = ProductView(productController)

    val producto1 : Product = Product(1, "patata1", 2.00, 20, Categoria.valueOf("ALIMENTACION"))
    val producto2 : Product = Product(1, "patata2", 2.00, 20, Categoria.valueOf("ALIMENTACION"))
    val producto3 : Product = Product(1, "patata3", 2.00, 20, Categoria.valueOf("ALIMENTACION"))

    productModel.insertar(producto1)
    productModel.insertar(producto2)
    productModel.insertar(producto3)

    productView.insertarUsuario()
    productView.mostrarLista()
}