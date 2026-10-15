package ejercicioMVC.model

import ejercicioMVC.bussiness.Categoria
import ejercicioMVC.bussiness.Product

class ProductModel (val lista: MutableList<Product>) {
    fun insertar(product: Product): Boolean {
        lista.add(product)
        return true;
    }

    fun actualizar(id: Int, nombre: String?, precio: Double, stock: Int, categoria: Categoria): Boolean {
        val p: Product = buscarPorId(id) ?: return false

        p.nombre = nombre
        p.precio = precio
        p.stock = stock
        p.categoria = categoria

        val index = lista.indexOf(p)
        lista.add(index, p)
        return true
    }

    fun borrar(id: Int): Boolean {
        val p: Product = buscarPorId(id) ?: return false

        val index = lista.indexOf(p)
        lista.removeAt(index)
        return true
    }

    fun buscarPorId(id: Int) : Product? {
        val p = lista.filter { p -> p.id == id }
        if(p.isEmpty()) {
            return null
        }
        return p[0]
    }

    fun buscarPorNombre(nombre: String) : List<Product> {
        return lista.filter{ p -> p.nombre.equals(nombre) }
    }

    fun listarTodos() : List<Product> {
        return lista
    }
}