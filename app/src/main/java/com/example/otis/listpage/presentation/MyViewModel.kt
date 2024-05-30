package com.example.otis.listpage.presentation

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.otis.listpage.data.dto.Response
import com.example.otis.listpage.domain.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor( val repository : Repository) :ViewModel() {

    var apiresult=MutableLiveData<Response>()

     fun getDetails(){
        viewModelScope.launch {
            var result=repository.getDetails()
            Log.v("kishore",result.toString())
            apiresult.value=result
        }

    }

}