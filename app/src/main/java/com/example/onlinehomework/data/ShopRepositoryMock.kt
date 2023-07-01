package com.example.onlinehomework.data

import com.example.onlinehomework.domain.model.ShopModel
import com.example.onlinehomework.domain.repository.ShopRepository

class ShopRepositoryMock : ShopRepository{
    override fun getLoadShop(): List<ShopModel> {
        return listOf(ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
            ShopModel("Tovary", "500",""),
        )
    }
}