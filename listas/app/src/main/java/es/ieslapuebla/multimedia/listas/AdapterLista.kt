package es.ieslapuebla.multimedia.listas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterLista(val lista: List<String>): RecyclerView.Adapter<AdapterLista.MyViewHolder>() {

    class MyViewHolder(item: View): RecyclerView.ViewHolder(item){
        val textView: TextView = item.findViewById<TextView>(R.id.texto)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.elemento,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: MyViewHolder,
        position: Int
    ) {
        holder.textView.text = lista[position]
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}