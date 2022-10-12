package com.androiddevs.mvvmnewsapp.models

import com.androiddevs.mvvmnewsapp.models.Article

data class NewsResponse(
    val articles: List<Article>,
    val totalArticles: Int
)