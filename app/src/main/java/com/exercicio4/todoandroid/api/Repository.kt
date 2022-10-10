package com.exercicio4.todoandroid.api

import com.exercicio4.todoandroid.model.Categoria
import com.exercicio4.todoandroid.model.Tarefa
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

    suspend fun addTarefa(tarefa: Tarefa): Response<Tarefa>{
        return RetrofitInstance.api.addTarefa(tarefa)
    }
    suspend fun listTarefa(): Response<List<Tarefa>>{
        return RetrofitInstance.api.listTarefa()
    }
    suspend fun updateTarefa( tarefa: Tarefa): Response<Tarefa> {
        return RetrofitInstance.api.updateTarefa(tarefa)
    }



}
