package com.example.crm.ui
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crm.data.Lead
class LeadAdapter(private var leads:List<Lead>):RecyclerView.Adapter<LeadAdapter.VH>(){
    class VH(parent:ViewGroup):RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_2,parent,false))
    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int)=VH(parent)
    override fun getItemCount()=leads.size
    override fun onBindViewHolder(holder:VH, position:Int){}
}
