package com.sheetal.productdetailse_commerce.repository

import android.util.Log
import com.sheetal.productdetailse_commerce.data.ProductResponse
import com.sheetal.productdetailse_commerce.data.RetrofitInstance

class ProductRepository {
    suspend fun getProductDetails(): ProductResponse {
        val response = RetrofitInstance.api.getProductDetails()
        Log.d("ProductRepository", "API Response: $response")
        return response
    }
}