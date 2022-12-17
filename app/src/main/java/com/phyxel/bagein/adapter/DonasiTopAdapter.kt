package com.phyxel.bagein.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.phyxel.bagein.R
import com.phyxel.bagein.data.TopDonasi
import java.text.NumberFormat
import java.util.*

class DonasiTopAdapter(

    private var mcontext: Context,
    private val itemClickListener: OnItemClickListener


) : RecyclerView.Adapter<DonasiTopAdapter.ViewHolder>() {

    private val data: MutableList<TopDonasi> = mutableListOf()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val ivBanner: ImageView = itemView.findViewById(R.id.ivBannerTopDonasi)
        val tvNamaDonasi: TextView = itemView.findViewById(R.id.tvNamaTopDonasi)
        val tvNamaPengaju: TextView = itemView.findViewById(R.id.tvNamaTopPengaju)
        val tvKategoriDonasi: TextView = itemView.findViewById(R.id.tvKategoriTopDonasi)
        val tvJumlahDonasi: TextView = itemView.findViewById(R.id.tvJumlahTopDonasi)
        val tvDurasiDonasi: TextView = itemView.findViewById(R.id.tvDurasiTopDonasi)
        val clTop: ConstraintLayout = itemView.findViewById(R.id.clTopDonasi)


        fun bind(mcontext: Context, homeList: TopDonasi, itemClickListener: OnItemClickListener)
        {
            val myIndonesianLocale = Locale("in", "ID")
            val numberFormat = NumberFormat.getCurrencyInstance(myIndonesianLocale)
            numberFormat.maximumFractionDigits = 0

//            if(!homeList.images.isNullOrEmpty()){
//                val bitmap = ImageUtils.decodeBase46ToBitmap(homeList.images[0].image)
//
//                if(bitmap != null){
//                    picture_katalog.setImageBitmap(bitmap)
//                }
//            }

            clTop.setOnClickListener {
                itemClickListener.onItemHomeClicked(itemView, absoluteAdapterPosition)
            }

            Glide.with(mcontext)
                .load(R.drawable.donasi1)
                .into(ivBanner)

            tvNamaDonasi.text = homeList.namaDonasi

        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DonasiTopAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_donasi_top, parent, false)
        return ViewHolder(view)
    }

    fun setData(newListData: List<TopDonasi>?) {
        if (newListData == null) return
        data.clear()
        data.addAll(newListData)
        notifyDataSetChanged()
    }

    fun getNamaProduk(position: Int) : String{
        return data[position].namaDonasi
    }


    fun removeData(){
        data.clear()
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: DonasiTopAdapter.ViewHolder, position: Int) {
        val home = data.get(position)
        holder.bind(mcontext,home,itemClickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface OnItemClickListener{
        fun onItemHomeClicked(v: View, position: Int)
    }
}