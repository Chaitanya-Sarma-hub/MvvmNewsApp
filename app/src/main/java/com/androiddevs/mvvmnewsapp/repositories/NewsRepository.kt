package com.androiddevs.mvvmnewsapp.repositories

import com.androiddevs.mvvmnewsapp.apis.RetrofitInstance
import com.androiddevs.mvvmnewsapp.db.ArticleDatabase

class NewsRepository(val db: ArticleDatabase) {

    suspend fun getBreakingNews(countryCode: String, pageNo: Int) = RetrofitInstance.api.getBreakingNews(countryCode, pageNo)

}