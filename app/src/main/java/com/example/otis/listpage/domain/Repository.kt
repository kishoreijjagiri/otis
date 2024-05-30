package com.example.otis.listpage.domain

import com.example.otis.listpage.data.dto.Response

interface Repository {

    suspend fun getDetails(): Response
}