package com.sheetal.productdetailse_commerce.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sheetal.productdetailse_commerce.data.ProductResponse
import com.sheetal.productdetailse_commerce.repository.ProductRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {
    private val repository = ProductRepository()

    private val _productDetails = MutableStateFlow<ProductResponse?>(null)
    val productDetails: StateFlow<ProductResponse?> = _productDetails

    init {
        fetchProductDetails()
    }

    private fun fetchProductDetails() {
        viewModelScope.launch {
            try {
                val response = repository.getProductDetails()
                Log.d("ProductViewModel", "Fetched Product: $response")
                _productDetails.value = response
            } catch (e: Exception) {
                Log.e("ProductViewModel", "Error fetching product details", e)
            }
        }
    }
}
