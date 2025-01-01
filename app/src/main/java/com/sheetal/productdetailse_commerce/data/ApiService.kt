package com.sheetal.productdetailse_commerce.data

import retrofit2.http.GET

interface ApiService {
    @GET("rest/V1/productdetails/6701/253620?lang=en&store=KWD")
    suspend fun getProductDetails(): ProductResponse
}