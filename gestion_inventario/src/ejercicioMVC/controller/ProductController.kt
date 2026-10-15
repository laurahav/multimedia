package ejercicioMVC.controller

import ejercicioMVC.bussiness.Product
import ejercicioMVC.model.ProductModel

class ProductController (val productModel: ProductModel) {

    fun listarTodo(): List<Product> {
        return productModel.listarTodos();
    }


}