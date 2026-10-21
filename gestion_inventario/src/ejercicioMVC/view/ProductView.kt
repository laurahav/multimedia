package ejercicioMVC.view

import ejercicioMVC.bussiness.Categoria
import ejercicioMVC.bussiness.Product
import ejercicioMVC.controller.ProductController

class ProductView(val controller: ProductController) {

    fun insertarUsuario() {
        println("Inserta nombre: ")
        val nombre = readln()

        println("Inserta el precio: ")
        val precio: Double = readln().toDouble()

        println("Inserta el stock disponible: ")
        val stock: Int = readln().toInt()

        controller.insertarProducto(Product(0,nombre, precio, stock, Categoria.ALIMENTACION))
    }

    fun mostrarLista() {
        print(controller.listarTodo())
    }
}