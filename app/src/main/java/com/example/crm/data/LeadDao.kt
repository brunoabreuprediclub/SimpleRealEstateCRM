package com.example.crm.data
import androidx.lifecycle.LiveData
import androidx.room.*
@Dao interface LeadDao {
    @Insert suspend fun insert(lead:Lead)
    @Query("SELECT * FROM leads WHERE category=:category ORDER BY id DESC") fun getLeadsByCategory(category:String): LiveData<List<Lead>>
}
