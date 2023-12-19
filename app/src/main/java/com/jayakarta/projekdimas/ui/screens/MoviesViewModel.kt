package com.jayakarta.projekdimas.ui.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jayakarta.projekdimas.Network.Movies.Movies
import com.jayakarta.projekdimas.Network.Movies.MoviesNetwork
import kotlinx.coroutines.launch

class MoviesViewModel : ViewModel() {
    val myResponseList: MutableLiveData<List<Movies>> = MutableLiveData()
    fun getMovies() {
        viewModelScope.launch {
            myResponseList.value  = MoviesNetwork.retrofit.getMovies().data
        }
    }
}