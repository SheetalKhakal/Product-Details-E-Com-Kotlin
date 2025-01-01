package com.sheetal.productdetailse_commerce.data

import com.google.gson.annotations.SerializedName

data class ProductResponse(
    @SerializedName("name") val name: String,
    @SerializedName("price") val price: String,
    @SerializedName("image") val image: String,
    @SerializedName("description") val description: String,
    @SerializedName("sku") val sku: String,
    @SerializedName("brand") val brand: String,
    @SerializedName("type") val type: String,
    @SerializedName("status") val status: String
)

