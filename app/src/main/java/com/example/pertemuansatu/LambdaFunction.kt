package com.example.pertemuansatu

// Lambda Functions
// Lambda fungctions adalah fungsi yang tidak memiliki nama
// biasanya digunakan untuk membuat fungsi yang sederhana
// menggunakan tanda panah (->) untuk nenisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()
}

//Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
    //HELLO
}