package com.androidlearning.ecommerce.Adapter

import Model.ProductMainPage
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.androidlearning.ecommerce.R
import com.androidlearning.ecommerce.databinding.ActivityMainBinding
import com.androidlearning.ecommerce.databinding.ProductListBinding

class ProductMainPageAdapter(private val products: ArrayList<ProductMainPage>):RecyclerView.Adapter<ProductMainPageAdapter.ProductViewHolder>() {
    interface OnProductClickListener {
        fun onProductClick(position: Int)
    }

    var onProductClickListener: OnProductClickListener? = null

    inner class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding: ProductListBinding

        init {
            binding = ProductListBinding.bind(view)
            binding.root.setOnClickListener {
                onProductClickListener?.onProductClick(
                    adapterPosition
                )

            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        return ProductViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.product_list,null))
    }

    override fun getItemCount()=products.size

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val products=products[position]
        holder.binding.productName.text=products.nameOfProduct.toString()
        holder.binding.price.text=products.priceOfProduct.toString()
        holder.binding.producImg.setImageResource(products.productImage)
    }
}


