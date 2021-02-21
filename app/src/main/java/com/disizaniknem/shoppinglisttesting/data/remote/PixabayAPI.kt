package com.disizaniknem.shoppinglisttesting.data.remote

import com.disizaniknem.shoppinglisttesting.data.remote.responses.ImageResponse
import com.disizaniknem.shoppinglisttesting.others.Secret.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayAPI {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery: String,
        @Query("key") apiKey: String = API_KEY
    ): Response<ImageResponse>
}