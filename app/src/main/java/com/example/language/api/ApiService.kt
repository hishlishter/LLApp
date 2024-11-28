package com.example.myandroidapp.api

import retrofit2.http.GET

interface ApiService {
    @GET("users") // Укажите ваш эндпоинт
    suspend fun getUsers(): List<com.example.myandroidapp.models.User>
}
