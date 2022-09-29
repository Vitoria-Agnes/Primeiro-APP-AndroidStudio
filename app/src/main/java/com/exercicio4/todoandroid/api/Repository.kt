package com.exercicio4.todoandroid.api

import com.exercicio4.todoandroid.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}