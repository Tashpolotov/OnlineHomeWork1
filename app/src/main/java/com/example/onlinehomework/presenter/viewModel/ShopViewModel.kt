package com.example.onlinehomework.presenter.viewModel

import androidx.lifecycle.ViewModel
import com.example.onlinehomework.domain.model.ShopModel
import com.example.onlinehomework.domain.repository.ShopRepository
import kotlinx.coroutines.flow.MutableStateFlow

class ShopViewModel(val repository: ShopRepository) : ViewModel() {

    val state = MutableStateFlow<List<ShopModel>>(emptyList())

    fun loadShop() {
        val shopList = repository.getLoadShop()
        state.value = shopList
    }
}