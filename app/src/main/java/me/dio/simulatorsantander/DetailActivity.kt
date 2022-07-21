package me.dio.simulatorsantander

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.dio.simulatorsantander.databinding.ActivityDetailBinding
import me.dio.simulatorsantander.databinding.ActivityMainBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_detail)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}