package com.example.product_recycleview.data

import com.example.product_recycleview.R
import com.example.product_recycleview.model.Product

class DataSource {
    fun loadProducts(): List<Product> {
        return listOf(
            Product(R.string.productName1, R.string.productPrice1, true, 5, R.drawable.iphone12)
            ,Product(R.string.productName2, R.string.productPrice2, false, 5, R.drawable.samsung_galaxy_uitra)
            ,Product(R.string.productName3, R.string.productPrice3, true, 0, R.drawable.xiaomi_pro)
            ,Product(R.string.productName4, R.string.productPrice4, false, 0, R.drawable.huawei_yp)
            ,Product(R.string.productName5, R.string.productPrice5, true, 70, R.drawable.samsung_galaxy_z_flip)
            ,Product(R.string.productName6, R.string.productPrice6, true, 36, R.drawable.iphone13)
        )
    }
}