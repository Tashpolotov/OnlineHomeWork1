package com.example.onlinehomework.domain.repository

import com.example.onlinehomework.domain.model.ShopModel

interface ShopRepository {
    fun getLoadShop(): List<ShopModel>
}