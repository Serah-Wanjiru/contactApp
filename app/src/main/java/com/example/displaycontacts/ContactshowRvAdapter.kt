package com.example.displaycontacts

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.displaycontacts.databinding.ContactListItemsBinding
import com.squareup.picasso.Picasso

class ContactshowRvAdapter(val contactList: List<ContactsData>):RecyclerView.Adapter<ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding=ContactListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contactss=contactList[position]
        holder.binding.apply {
            tvName.text=contactss.names
            tvEmail.text=contactss.email
            tvTelNo.text=contactss.phoneNo
            Picasso
                .get()
                .load(contactss.avatar)
                .resize(80,80)
                .centerCrop()
                .into(holder.binding .tvAvatar)





        }

    }

    override fun getItemCount(): Int {
        return  contactList.size
    }
}
class ContactViewHolder(var binding: ContactListItemsBinding):RecyclerView.ViewHolder(binding.root){

}