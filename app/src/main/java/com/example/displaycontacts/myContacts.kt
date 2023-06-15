package com.example.displaycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.displaycontacts.databinding.ActivityMyContactsBinding

class myContacts : AppCompatActivity() {
    lateinit var binding: ActivityMyContactsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyContactsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_my_contacts)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.btNewContact.setOnClickListener {
            validateAddContact()
        }

    }

    fun validateAddContact(){
        val name = binding.etName.text.toString()
        val email = binding.etEmail.text.toString()
        val phone = binding.etPhone.text.toString()
        var error = false

        if (name.isBlank()){
            binding.tilName.error = "Name field cannot be empty"
            error = true
        }

        if (phone.isBlank()){
            binding.tilPhone.error = "Phone number field cannot be empty"
            error = true
        }

        if (!error){
            Toast.makeText(this, "Contact Successfully added", Toast.LENGTH_LONG).show()
        }
    }
}

