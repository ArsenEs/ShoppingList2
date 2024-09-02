package com.rsn.shoppinglist2.domain

interface ShopListRepository {

    fun addItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem : ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getShopItem(shopItem : ShopItem) : ShopItem
    fun getShopList(): List<ShopItem>
}