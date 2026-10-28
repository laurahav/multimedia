package es.ieslapuebla.multimedia.listas

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lista)
        val reciclerView: RecyclerView = findViewById<RecyclerView>(R.id.lista_elementos)
        val miLista = listOf<String>("Hola", "Adios", "aaaa")
        reciclerView.adapter = AdapterLista(miLista)
        reciclerView.layoutManager = LayoutInflater.from(this) as RecyclerView.LayoutManager?
    }

}