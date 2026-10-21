package ejercicioMVC.controller

import ejercicioMVC.bussiness.Product
import ejercicioMVC.model.ProductModel

class ProductController (val productModel: ProductModel) {

    fun insertarProducto(producto: Product): Boolean {
        return productModel.insertar(producto)
    }

    fun listarTodo(): List<Product> {
        return productModel.listarTodos();
    }


}