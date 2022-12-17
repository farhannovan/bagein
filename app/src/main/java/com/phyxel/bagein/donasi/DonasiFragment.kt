package com.phyxel.bagein.donasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.phyxel.bagein.adapter.DonasiTopAdapter
import com.phyxel.bagein.adapter.DonasiRekomendasiAdapter
import com.phyxel.bagein.data.TopDonasi
import com.phyxel.bagein.data.rekomendasi
import com.phyxel.bagein.databinding.FragmentDonasiBinding

class DonasiFragment : Fragment(), DonasiRekomendasiAdapter.OnItemClickListener, DonasiTopAdapter.OnItemClickListener{

    private var _binding: FragmentDonasiBinding? = null
    private val binding get() = _binding!!

    private lateinit var donasiAdapter: DonasiTopAdapter
    private lateinit var donasiRekomendasiAdapter: DonasiRekomendasiAdapter
    private lateinit var rvDonasiRekomendasi: RecyclerView
    private lateinit var rvDonasiTop: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    private var rekomendasiList : MutableList<rekomendasi> = ArrayList()
    private var topDonasi : MutableList<TopDonasi> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDonasiBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvDonasiRekomendasi = binding.rvDonasiRekomendasi
        rvDonasiTop = binding.rvDonasiTop

        initListDonasiRekomendasiRecyclerView()
        initListDonasiTopRecyclerView()

        val rekomendasi1 = rekomendasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        val rekomendasi2 = rekomendasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        val rekomendasi3 = rekomendasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        val rekomendasi4 = rekomendasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        val rekomendasi5 = rekomendasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        rekomendasiList.add(rekomendasi1)
        rekomendasiList.add(rekomendasi2)
        rekomendasiList.add(rekomendasi3)
        rekomendasiList.add(rekomendasi4)
        rekomendasiList.add(rekomendasi5)

        donasiRekomendasiAdapter.setData(rekomendasiList)

        val topDonasi1 = TopDonasi(1, "Sedekah Subuh", "XYZ", "Sosial", 30000, 15)
        val topDonasi2 = TopDonasi(2, "Sedekah Subuh")
        topDonasi.add(topDonasi1)
        topDonasi.add(topDonasi2)
        donasiAdapter.setData(topDonasi)
    }

    private fun initListDonasiTopRecyclerView() {
        donasiAdapter = DonasiTopAdapter(requireActivity(), this)
        linearLayoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        rvDonasiTop.layoutManager = linearLayoutManager
        rvDonasiTop.adapter = donasiAdapter
    }

    private fun initListDonasiRekomendasiRecyclerView() {
        donasiRekomendasiAdapter = DonasiRekomendasiAdapter(requireActivity(), this)
        linearLayoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.VERTICAL, false)
        rvDonasiRekomendasi.layoutManager = linearLayoutManager
        rvDonasiRekomendasi.adapter = donasiRekomendasiAdapter
    }

    override fun onItemClicked(v: View, position: Int) {

    }

    override fun onItemHomeClicked(v: View, position: Int) {

    }
}