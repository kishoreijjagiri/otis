package com.example.otis.listpage.domain

import android.util.Log
import com.example.otis.listpage.data.dto.Response
import com.example.otis.listpage.data.network.RetrofitInterface
import javax.inject.Inject

class RepositoryImpl @Inject constructor(var retrofitInterface: RetrofitInterface): Repository {
    override suspend fun getDetails(): Response {
        var response=retrofitInterface.getDetails()
        //Log.v("response",response.results.get(0).title)
        return response
    }

}