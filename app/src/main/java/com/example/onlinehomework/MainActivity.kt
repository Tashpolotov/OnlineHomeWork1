package com.example.onlinehomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.onlinehomework.data.ShopRepositoryMock
import com.example.onlinehomework.databinding.ActivityMainBinding
import com.example.onlinehomework.presenter.adapter.ShopAdapter
import com.example.onlinehomework.presenter.viewModel.ShopViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter = ShopAdapter()
    private val viewModel = ShopViewModel(ShopRepositoryMock())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rv.adapter = adapter

        GlobalScope.launch {
            viewModel.state.collect {
                adapter.submitList(it)
            }
        }

        viewModel.loadShop()
    }
}