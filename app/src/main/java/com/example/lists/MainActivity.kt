package com.example.lists

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val constactsRecycler = findViewById<RecyclerView>(R.id.RecycleB)
        
        val adapter = ContactListAdapter(getContacts(), this::onContactClick)
        
        constactsRecycler.layoutManager = LinearLayoutManager(this)
        constactsRecycler.adapter = adapter
    }
    
    private fun onContactClick(contact: Contact){
        val intent = Intent(this, DetailsActivity::class.java)
        intent.putExtra(KEY_NAME, contact.fullName)
        intent.putExtra(KEY_PHONE, contact.phoneNumber)
        startActivity(intent)
    }
    
    private fun getContacts(): List<Contact>{
        return listOf(
            Contact(fullName = "Sabit Rrahimi", phoneNumber = "0443434213"),
            Contact(fullName = "Salih Rrahimi", phoneNumber = "0443434214"),
            Contact(fullName = "Rrhaim Rrahimi", phoneNumber = "0443434215"),
            Contact(fullName = "Burdush Rrahimi", phoneNumber = "0443434216"),
            Contact(fullName = "Gani Rrahimi", phoneNumber = "0443434217"),
            Contact(fullName = "Xharrah Rrahimi", phoneNumber = "0443434218")
        )
    }
}