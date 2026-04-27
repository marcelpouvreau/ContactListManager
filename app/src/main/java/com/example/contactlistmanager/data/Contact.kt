package com.example.contactlistmanager.data

data class Contact(
    val id: Int,
    val name: String,
    val phone: String,
    val email: String,
    val initials: String
)

val sampleContacts = listOf(
    Contact(1, "Anderson Silva", "(11) 99999-8888", "anderson@email.com", "AS"),
    Contact(2, "Beatriz Oliveira", "(21) 98888-7777", "beatriz@email.com", "BO"),
    Contact(3, "Carlos Mendes", "(31) 97777-6666", "carlos@email.com", "CM")
)