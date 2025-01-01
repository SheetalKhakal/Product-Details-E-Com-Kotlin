package com.sheetal.productdetailse_commerce.view

 import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.sheetal.productdetailse_commerce.viewmodel.ProductViewModel

@Composable
fun ProductDetailsScreen(viewModel: ProductViewModel) {
    val product by viewModel.productDetails.collectAsState()

    if (product == null) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            contentAlignment = androidx.compose.ui.Alignment.Center
        ) {
            Text(
                text = "Loading product details...",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    } else {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Image(
                painter = rememberAsyncImagePainter(product?.image ?: ""),
                contentDescription = product?.name ?: "Product Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop
            )

            Text(
                text = product?.name ?: "Unknown Product",
                style = MaterialTheme.typography.headlineMedium
            )

            Text(
                text = "Price: ${product?.price ?: "N/A"}",
                style = MaterialTheme.typography.bodyLarge
            )

            Text(
                text = "SKU: ${product?.sku ?: "N/A"}",
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                text = "Brand: ${product?.brand ?: "N/A"}",
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                text = "Type: ${product?.type ?: "N/A"}",
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                text = "Status: ${product?.status ?: "N/A"}",
                style = MaterialTheme.typography.bodySmall
            )

            Text(
                text = product?.description ?: "No description available.",
                style = MaterialTheme.typography.bodySmall
            )
        }
    }
}
