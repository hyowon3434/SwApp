package com.example.swapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactActivity : ComponentActivity() {

    private lateinit var db: DatabaseHelper
    private lateinit var recyclerView: RecyclerView
    private lateinit var contactAdapter: ContactAdapter

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        db = DatabaseHelper(application as MyApplication).database
        recyclerView = findViewById(R.id.recycler_view_contacts)

        recyclerView.layoutManager = LinearLayoutManager(this)
        loadContacts()
    }

    private fun loadContacts() {
        val contacts = db.getAllContacts()
        contactAdapter = ContactAdapter(contacts)
        recyclerView.adapter = contactAdapter
    }
}