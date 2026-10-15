package ejercicioMVC.view

import ejercicioMVC.controller.ProductController

class ProductView(val controller: ProductController) {

    fun mostrarLista() {
        print(controller.listarTodo())
    }
}