package com.example.inclasspractical2

import android.R
import android.widget.TextView
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class LikeViewModel : ViewModel() {

    //   var likeCount: Int = 0
    private val _likeCount = MutableLiveData<Int>(0)
    val likeCount: LiveData<Int>
        get() = _likeCount

    fun performLike() {
//        likeCount++
        _likeCount.value = _likeCount.value!! + 1
    }
}