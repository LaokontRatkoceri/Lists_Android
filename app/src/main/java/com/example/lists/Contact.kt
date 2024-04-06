package com.example.lists

data class Contact(
    val fullName: String,
    val phoneNumber: String,
){
    public fun getInitials():String{
        var initials = " "
        fullName.split(" ").forEach{
            initials += it.substring(0,1)
        }
        return initials
    }
}