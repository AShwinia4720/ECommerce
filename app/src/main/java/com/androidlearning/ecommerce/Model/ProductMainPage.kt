package Model

import java.io.Serializable

data class ProductMainPage (
    val productid:Int,
    val nameOfProduct:String,
    val priceOfProduct:Double,
    val description: String,
    val productDetails : String,
    val productImage : Int
):Serializable