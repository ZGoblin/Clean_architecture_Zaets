package com.example.cleanzaets.utils

import com.example.cleanzaets.data.Post
import retrofit2.Call
import retrofit2.http.GET

interface PostService {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}