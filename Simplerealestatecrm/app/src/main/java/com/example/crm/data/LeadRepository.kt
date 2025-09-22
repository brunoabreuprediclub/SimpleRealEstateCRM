package com.example.crm.data
class LeadRepository(private val dao:LeadDao){ fun getLeadsByCategory(category:String)=dao.getLeadsByCategory(category); suspend fun insert(lead:Lead)=dao.insert(lead) }
