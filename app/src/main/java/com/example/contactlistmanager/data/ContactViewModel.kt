package com.example.contactlistmanager.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class ContactViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = AppDatabase.getDatabase(application).contactDao()
    val allContacts: Flow<List<Contact>> = dao.getAllContacts()

    fun saveContact(name: String, phone: String, email: String) {
        val initials = name.take(2).uppercase()
        val newContact = Contact(name = name, phone = phone, email = email, initials = initials)
        viewModelScope.launch {
            dao.insertContact(newContact)
        }
    }
}