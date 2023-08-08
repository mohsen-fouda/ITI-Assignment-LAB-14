package com.mohsin.iti.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mohsin.iti.adapters.PostAdapter
import com.mohsin.iti.databinding.ActivityMainBinding
import com.mohsin.iti.models.PostModel
import com.mohsin.iti.utils.Const

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private val adapter = PostAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(_binding?.root)


        showingData()
    }

    private fun showingData() {
        val users =
            arrayListOf<PostModel>(
                PostModel("Antonius", "1-1-1-1", Const.POST, "https://img.icons8.com/plasticine/100/cat.png"),
                PostModel("ANT", "1-1-1-1", Const.POST, "https://img.icons8.com/3d-fluency/94/cat.png"),
            )
        adapter.list = users
        binding.rv.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}