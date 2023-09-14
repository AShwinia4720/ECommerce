package com.androidlearning.ecommerce

import Model.ProductMainPage
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidlearning.ecommerce.Adapter.ProductMainPageAdapter
import com.androidlearning.ecommerce.databinding.ProductDetailsBinding



class ProductDetailsActivity: AppCompatActivity() {
    private lateinit var binding:ProductDetailsBinding
    private lateinit var product:ProductMainPage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        product=(intent.getSerializableExtra("proDet") as? ProductMainPage)!!

        if(product != null){
            binding.proDetailsImg.setImageResource(product.productImage)
            binding.proDetailsName.text="Name= ${product.nameOfProduct}"
            binding.proDetailsPrice.text = "Price= ${product.priceOfProduct}"
            binding.proDetailsDescription.text=product.description
            binding.proDetailsDetail.text=product.productDetails

        }
    }
}
