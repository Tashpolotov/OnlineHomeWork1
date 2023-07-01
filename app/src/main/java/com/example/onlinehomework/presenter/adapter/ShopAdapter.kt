package com.example.onlinehomework.presenter.adapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.onlinehomework.databinding.ItemBinding
import com.example.onlinehomework.domain.model.ShopModel



class ShopAdapter: ListAdapter<ShopModel, ShopAdapter.ViewHolder>(DiffutilShop()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(private val binding: ItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ShopModel) {
            binding.tvName.text = model.name
            binding.tvPrice.text = model.price

        }
    }
}

  private class DiffutilShop: DiffUtil.ItemCallback<ShopModel>() {
      override fun areItemsTheSame(oldItem: ShopModel, newItem: ShopModel): Boolean {
            return oldItem == newItem
      }

      override fun areContentsTheSame(oldItem: ShopModel, newItem: ShopModel): Boolean {
            return oldItem == newItem
      }

  }
