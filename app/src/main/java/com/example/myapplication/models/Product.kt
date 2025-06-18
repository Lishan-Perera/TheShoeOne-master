package com.example.myapplication.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

//product item my app and each product has:
data class Product(
    @DrawableRes val imagesResourceId: Int,
    @StringRes val stringResourceId: Int,
    @StringRes val categoryRes: Int,
    val priceRes: Int,
    val sizes: List<String> = emptyList(),
    @DrawableRes val thumbnails: List<Int> = emptyList()
)
