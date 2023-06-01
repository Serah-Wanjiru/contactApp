package com.example.displaycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.displaycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        showContacts()
    }
    fun showContacts(){
        var contact1=ContactsData("","Liz ","072898493","liz@gmail.com")
        var contact2=ContactsData("","Serah ","079998493","serah@gmail.com")
        var contact3=ContactsData("","Caro ","071298493","caro@gmail.com")
        var contact4=ContactsData("","Camilla ","075698493","camilla@gmail.com")
        var contact5=ContactsData("","Yna ","072398493","yna@gmail.com")
        var contact6=ContactsData("","Maria ","079098493","maria@gmail.com")
        var contact7=ContactsData("","Amore ","077898493","amore@gmail.com")
        var contact8=ContactsData("","Sarah ","073498493","sarah@gmail.com")

        var contactList= listOf<ContactsData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactsAdapter=ContactshowRvAdapter(contactList)
        binding.rvContacts.adapter=contactsAdapter
    }
}