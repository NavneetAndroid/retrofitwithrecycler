package com.example.retrofitinkotlinwithrecyclerview

import retrofit2.http.GET
import io.reactivex.Observable

interface INetworkAPI {

    @GET("users?page=1")
    fun getAllPosts(): Observable<List<Post>>
}