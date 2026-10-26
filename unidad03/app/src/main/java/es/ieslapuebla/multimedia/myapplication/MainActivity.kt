package es.ieslapuebla.multimedia.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.layout)

        val button : Button = findViewById<Button>(R.id.boton)
        val editText : EditText = findViewById<EditText>(R.id.input_text)
        button.setOnClickListener {
            val nombre = editText.text
            val mensaje = "¡Hola $nombre!"
            val intent = Intent(this@MainActivity, Pantalla2Activity::class.java)
            intent.putExtra("MENSAJE", mensaje)
            startActivity(intent)
        }
    }
}