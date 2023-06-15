package com.example.displaycontacts

import android.content.Intent
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

        binding.ftAdd.setOnClickListener {
            val intent = Intent(this, myContacts::class.java)
            startActivity(intent)
        }
    }
    fun showContacts(){
        var contact1=ContactsData("https://media.istockphoto.com/id/508182206/photo/closeup-of-a-smiling-young-black-woman.jpg?s=612x612&w=0&k=20&c=q43lp302lfagHDolsgqKXx8xBKBqPII3-CuYoTDW8wQ=","Liz ","072898493","liz@gmail.com")
        var contact2=ContactsData(" https://i.pinimg.com/originals/37/d7/6f/37d76f2b6d3f3abd2771f983f3a4c603.jpg","Serah ","079998493","serah@gmail.com")
        var contact3=ContactsData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyYr_-IaPmzIaBDPxOuhuSpE334JGFtfH12Q&usqp=CAU","Caro ","071298493","caro@gmail.com")
        var contact4=ContactsData("https://images.thestarimages.com/CtE56tPmkjfn0lCUzXOw1dFS0E8=/1086x842/smart/filters:cb(1591360136680):format(webp)/https://www.thestar.com/content/dam/thestar/opinion/contributors/2020/06/02/for-black-people-calling-the-police-can-be-dangerous-its-time-we-had-another-option/angelyn_francis_2.jpg","Camilla ","075698493","camilla@gmail.com")
        var contact5=ContactsData("https://media.istockphoto.com/id/1280113805/photo/smiling-young-woman-beauty-close-up-portrait.jpg?s=612x612&w=0&k=20&c=11GhfzV2ZdNaikNwncxvGQARw4MoT22DDfzqs4UpqL0=","Yna ","072398493","yna@gmail.com")
        var contact6=ContactsData("https://i.insider.com/62ed35fee00f40001826ccf8?width=700","Maria ","079098493","maria@gmail.com")
        var contact7=ContactsData("https://i.pinimg.com/736x/23/68/f5/2368f55b062f4edd60d8f04d6214c276.jpg","Amore ","077898493","amore@gmail.com")
        var contact8=ContactsData("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTLOdWHr9E1D7u2GuhehCKC6bxUI4ga-akacw&usqp=CAU","Sarah ","073498493","sarah@gmail.com")

        var contactList= listOf<ContactsData>(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        var contactsAdapter=ContactshowRvAdapter(contactList)
        binding.rvContacts.adapter=contactsAdapter
    }
}