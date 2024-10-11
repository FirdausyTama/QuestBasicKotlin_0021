package com.example.pertemuansatu

// Data Class
// Data class adalah class yang digunakan untuk menyimpan data.

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    //Fungsi equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) // false

    //fungsi copy
    val data3 = data.copy()
    println(data3)
}