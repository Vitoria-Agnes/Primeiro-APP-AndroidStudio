package com.exercicio4.todoandroid.api

import com.exercicio4.todoandroid.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("categoria")
    suspend fun listCategoria(): Response<List<Categoria>>
}