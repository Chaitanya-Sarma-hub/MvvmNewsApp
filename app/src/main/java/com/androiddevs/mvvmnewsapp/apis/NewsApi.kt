package com.androiddevs.mvvmnewsapp.apis

import com.androiddevs.mvvmnewsapp.models.NewsResponse
import com.androiddevs.mvvmnewsapp.util.Constants.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("/api/v4/top-headlines")
    suspend fun getBreakingNews(
        @Query("country")
        countryCode: String = "in",
        @Query("page")
        pageNo: Int = 1,
        @Query("lang")
        language: String = "en",
        @Query("token")
        apiKey: String = API_KEY
    ): Response<NewsResponse>

    @GET("/api/v4/search")
    suspend fun searchForNews(
        @Query("q")
        searchQuery: String,
        @Query("country")
        countryCode: String = "in",
        @Query("page")
        pageNo: Int = 1,
        @Query("lang")
        language: String = "en",
        @Query("token")
        apiKey: String = API_KEY
    ): Response<NewsResponse>


}