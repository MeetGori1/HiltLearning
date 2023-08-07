package com.example.hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.databinding.ActivityMainBinding
import dagger.Binds
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    @Inject
    lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository.saveUser("MainActivity:Water@gmail.com","15654")
    }
}