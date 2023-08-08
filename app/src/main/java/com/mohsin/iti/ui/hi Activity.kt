package com.mohsin.iti.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mohsin.iti.databinding.ActivityReadBinding
import com.mohsin.iti.utils.Const

class HiActivity : AppCompatActivity() {
    private var _binding: ActivityReadBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityReadBinding.inflate(layoutInflater)
        setContentView(_binding?.root)

        passData()
    }

    private fun passData() {
        val userName=intent.getStringExtra(Const.UNAME_KEY)
        val post=intent.getStringExtra(Const.POSTKEY)
        binding.txtUsername.text="User Name :\n $userName"
        binding.txtPost.text="Post :\n $post"

    }

}