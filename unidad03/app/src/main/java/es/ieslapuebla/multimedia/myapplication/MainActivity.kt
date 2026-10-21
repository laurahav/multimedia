package es.ieslapuebla.multimedia.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout)

        val textview : TextView = findViewById<TextView>(R.id.texto)
        textview.text = "Hellouuuuuuuuuuuu"

        val button : Button = findViewById<Button>(R.id.boton)
        button.setOnClickListener {textview.text = "Bye bye"}

    }
}