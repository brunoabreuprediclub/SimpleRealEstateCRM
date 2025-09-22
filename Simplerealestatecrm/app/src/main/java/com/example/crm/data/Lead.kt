package com.example.crm.data
import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName="leads")
data class Lead(@PrimaryKey(autoGenerate=true) val id:Int=0, val name:String, val contact:String, val notes:String, val category:String)
