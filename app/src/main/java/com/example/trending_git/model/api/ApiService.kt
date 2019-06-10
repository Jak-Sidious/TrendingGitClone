package com.example.trending_git.model.api

import com.example.trending_git.model.GitResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search/repositories")
    fun getRepo(@Query("q") search: String= "trending", @Query("sort") sort: String ="starts"): Call<GitResponse>
}