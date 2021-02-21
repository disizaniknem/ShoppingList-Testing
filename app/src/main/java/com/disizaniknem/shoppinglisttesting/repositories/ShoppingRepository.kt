package com.disizaniknem.shoppinglisttesting.repositories

import androidx.lifecycle.LiveData
import com.disizaniknem.shoppinglisttesting.data.local.ShoppingItem
import com.disizaniknem.shoppinglisttesting.data.remote.responses.ImageResponse
import com.disizaniknem.shoppinglisttesting.others.Resource
import retrofit2.Response

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}