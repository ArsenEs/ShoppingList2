package com.rsn.shoppinglist2.domain

class DeleteShopitemUsecase(private val shopListRepository: ShopListRepository) {
    fun deleteShopItem(shopItem : ShopItem){
        shopListRepository.deleteShopItem(shopItem)

    }
}