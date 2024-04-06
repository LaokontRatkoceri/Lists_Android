package com.example.lists

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class ContactListAdapter (val contactList: List<Contact>, val onClick:(Contact) -> Unit):
    RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {
    class ViewHolder(val view: View):RecyclerView.ViewHolder(view){
        val initialTextView = view.findViewById<TextView>(R.id.initialTextView)
        val fullName_TextView = view.findViewById<TextView>(R.id.Fullname_TextView)
        val phonenumber_TextView = view.findViewById<TextView>(R.id.Phonenumber_TextView)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.fullName_TextView.text = contactList[position].fullName
        holder.phonenumber_TextView.text = contactList[position].phoneNumber
        holder.initialTextView.text = contactList[position].getInitials()
        holder.view.setOnClickListener{
            onClick(contactList[position])
        }
    }

    override fun getItemCount(): Int = contactList.size


}