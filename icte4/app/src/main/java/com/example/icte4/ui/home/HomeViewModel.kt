package com.example.icte4.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "EEP 523A : ICTE 4 : Group 15"
    }
    val text: LiveData<String> = _text
}