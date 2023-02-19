package com.example.inclasspractical2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.example.inclasspractical2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val viewModel: LikeViewModel by viewModels()
    val disLikeViewModel: DisLikeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)

//        val likeCountText: TextView = findViewById(R.id.textView4LikeCount)
//        val likeButton: Button = findViewById(R.id.buttonLike)
//
//        likeButton.setOnClickListener {
//            viewModel.performLike()
//            likeCountText.text = viewModel.likeCount.toString()
//        }


        // --Data Binding --
        binding.likeVM = viewModel
        binding.lifecycleOwner = this
        binding.buttonLike.setOnClickListener {
            viewModel.performLike()
            binding.textView4LikeCount.text = viewModel.likeCount.toString()
        }

        binding.disLikeVM = disLikeViewModel
        binding.lifecycleOwner = this
        binding.button2Dislike.setOnClickListener {
            disLikeViewModel.disLikeBtnClick()
//            dataBinding.tvDisLikeCounter.text = disLikeViewModel.disLikeCount.toString()
        }

        // --Observer--
//        val likeObserver = Observer<Int> { newValue ->
//            binding.textView4LikeCount.text = viewModel.likeCount.toString()
//        }
//        viewModel.likeCount.observe(this, likeObserver)
    }

}