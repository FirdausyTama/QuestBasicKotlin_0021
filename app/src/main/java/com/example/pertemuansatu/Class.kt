package com.example.pertemuansatu

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "marry@gmail.com")

    //print the value of the property: email
    println(contact.email)
}