package com.davidmaiques.priva2recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.davidmaiques.priva2recycler.databinding.ItemTareaBinding

class TareaAdapter(val lista: List<Tarea>) : RecyclerView.Adapter<TareaAdapter.TareaHoldView>() {

    inner class TareaHoldView(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemTareaBinding.bind(view)
        fun render(tarea: Tarea) {
            binding.tvNombre.text = tarea.nombre
            binding.tvTiempo.text = tarea.tiempo.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TareaHoldView {
        return TareaHoldView(
            LayoutInflater.from(parent.context).inflate(R.layout.item_tarea, parent, false)
        )
    }

    override fun getItemCount(): Int = lista.size

    override fun onBindViewHolder(holder: TareaHoldView, position: Int) {
        return holder.render(lista[position])
    }


}