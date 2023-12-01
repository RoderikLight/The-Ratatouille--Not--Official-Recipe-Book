package com.roderiklight.ratatouillerecipebook

data class Recipe(
    val id: Int,
    val image: String,
    var isfav: Int,
    val name: String,
    val desc: String,
    val prep: String
)
