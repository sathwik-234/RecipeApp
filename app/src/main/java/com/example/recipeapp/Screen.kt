package com.example.recipeapp

import android.os.Parcelable

sealed class Screen (val route :String)  {
    object RecipeScreen:Screen("recipescreen")
    object DetailScreen:Screen("detailscreen")
}