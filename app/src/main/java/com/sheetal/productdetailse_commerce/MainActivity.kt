package com.sheetal.productdetailse_commerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sheetal.productdetailse_commerce.view.ProductDetailsScreen
import com.sheetal.productdetailse_commerce.viewmodel.ProductViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: ProductViewModel = viewModel()
            ProductDetailsScreen(viewModel = viewModel)
        }
    }
}


