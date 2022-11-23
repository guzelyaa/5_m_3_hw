package com.example.a5m3hw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.a5m3hw.databinding.ItemImageBinding

class ImageAdapter(private val list: MutableList<ImageModel>) :
    RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

        fun getNewElements(list: MutableList<ImageModel>) {
            this.list.addAll(list)
            notifyDataSetChanged()
        }


    inner class ViewHolder(private val binding: ItemImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: ImageModel) {
            binding.imageView.load(item.largeImageURL)
        }
    }
}
