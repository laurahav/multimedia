package es.ieslapuebla.multimedia.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Pantalla2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pantalla2)
        val mensaje = intent.getStringExtra("MENSAJE")
        val textView: TextView = findViewById<TextView>(R.id.texto2)
        textView.text = mensaje
    }
}
