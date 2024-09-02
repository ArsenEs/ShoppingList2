package com.rsn.shoppinglist2.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun addItem(shopItem: ShopItem){
        shopListRepository.addItem(shopItem)
    }
}
//dfdааа