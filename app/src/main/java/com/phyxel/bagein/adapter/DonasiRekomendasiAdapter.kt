package com.phyxel.bagein.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.phyxel.bagein.R
import com.phyxel.bagein.data.rekomendasi
import java.text.NumberFormat
import java.util.*

class DonasiRekomendasiAdapter(

    private var context: Context,
    private val itemClickListener: OnItemClickListener


) : RecyclerView.Adapter<DonasiRekomendasiAdapter.ViewHolder>() {

    private val data: MutableList<rekomendasi> = mutableListOf()

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvNamaDonasi: TextView = itemView.findViewById(R.id.tvNamaRekomDonasi)
        val tvNamaPengaju: TextView = itemView.findViewById(R.id.tvNamaRekomPengaju)
        val tvKategoriDonasi: TextView = itemView.findViewById(R.id.tvKategoriRekomDonasi)
        val tvJumlahDonasi: TextView = itemView.findViewById(R.id.tvJumlahRekomDonasi)
        val tvDurasiDonasi: TextView = itemView.findViewById(R.id.tvDurasiRekomDonasi)
        val clRekomendasi: ConstraintLayout = itemView.findViewById(R.id.clRekomendasiDonasi)


        fun bind(donasiRekomendasi: rekomendasi, itemClickListener: OnItemClickListener)
        {
            val myIndonesianLocale = Locale("in", "ID")
            val numberFormat = NumberFormat.getCurrencyInstance(myIndonesianLocale)
            numberFormat.maximumFractionDigits = 0

//            if(!paketRekomendasi.images.isNullOrEmpty()){
//                val bitmap = ImageUtils.decodeBase46ToBitmap(paketRekomendasi.images[0].image)
//
//                if(bitmap != null){
//                    picture_katalog.setImageBitmap(bitmap)
//                }
//            }

            clRekomendasi.setOnClickListener {
                itemClickListener.onItemClicked(itemView, absoluteAdapterPosition)
            }

            tvNamaDonasi.text = donasiRekomendasi.namaDonasi
            tvNamaPengaju.text = donasiRekomendasi.namaPengaju
            tvKategoriDonasi.text = donasiRekomendasi.kategoriDonasi
            tvJumlahDonasi.text = "${numberFormat.format(donasiRekomendasi.jumlahDonasi)}"
            tvDurasiDonasi.text = "${donasiRekomendasi.durasiDonasi} Hari"
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DonasiRekomendasiAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_donasi_rekomendasi, parent, false)
        return ViewHolder(view)
    }

    fun setData(newListData: List<rekomendasi>?) {
        if (newListData == null) return
        data.clear()
        data.addAll(newListData)
        notifyDataSetChanged()
    }

    fun getId(position: Int) : Int{
        return data[position].id
    }

    fun getNamaProduk(position: Int) : String{
        return data[position].namaDonasi
    }

    fun getHargaJual(position: Int) : Int{
        return data[position].jumlahDonasi
    }

    fun removeData(){
        data.clear()
        notifyDataSetChanged()
    }


    override fun onBindViewHolder(holder: DonasiRekomendasiAdapter.ViewHolder, position: Int) {
        val topRekomendasi = data.get(position)
        holder.bind(topRekomendasi,itemClickListener)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    interface OnItemClickListener{
        fun onItemClicked(v: View, position: Int)
    }
}