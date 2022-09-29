package com.exercicio4.todoandroid.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.exercicio4.todoandroid.databinding.CardLoyoutBinding
import com.exercicio4.todoandroid.model.Tarefa

class TarefaAdapter : RecyclerView.Adapter<TarefaAdapter.TarefaViewHolder>(){


   private var listTarefa = emptyList<Tarefa>()

    class TarefaViewHolder (val binding: CardLoyoutBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        return TarefaViewHolder(CardLoyoutBinding.inflate(
            LayoutInflater.from(parent.context),parent,false
        ))
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        val tarefa = listTarefa[position]
        holder.binding.textNome.text= tarefa.nome
        holder.binding.textDescriO.text= tarefa.descricao
        holder.binding.textResponsavel.text= tarefa.responsavel
        holder.binding.textData.text= tarefa.data
        holder.binding.switchAtivo.isChecked = tarefa.status
        holder.binding.textCategoria.text= tarefa.categoria.descricao

    }

    override fun getItemCount(): Int {
       return listTarefa.size

    }
    fun setList(list: List<Tarefa>){
        listTarefa=list
        notifyDataSetChanged()
    }
}