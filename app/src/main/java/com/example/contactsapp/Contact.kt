package com.example.contactsapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact(
    @PrimaryKey(autoGenerate = true)val id: Int,
    val name: String,
    val image: String,
    val phoneNumber: String,
    val email: String
)
