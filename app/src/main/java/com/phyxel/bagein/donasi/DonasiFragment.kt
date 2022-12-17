package com.phyxel.bagein.data

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.phyxel.bagein.adapter.DonasiTopAdapter
import com.phyxel.bagein.adapter.DonasiRekomendasiAdapter
import com.phyxel.bagein.databinding.FragmentDonasiBinding

class DonasiFragment : Fragment(), DonasiRekomendasiAdapter.OnItemClickListener, DonasiTopAdapter.OnItemClickListener{

    private var _binding: FragmentDonasiBinding? = null
    private val binding get() = _binding!!

    private lateinit var donasiAdapter: DonasiTopAdapter
    private lateinit var donasiRekomendasiAdapter: DonasiRekomendasiAdapter
    private lateinit var rvRekomendasi: RecyclerView
    private lateinit var rvDonasi: RecyclerView
    private lateinit var linearLayoutManager: LinearLayoutManager

    private var rekomendasiList : MutableList<rekomendasi> = ArrayList()
    private var homeList : MutableList<TopDonasi> = ArrayList()

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
        rvRekomendasi = binding.rvRekomendasi
        rvDonasi = binding.rvDonasi

        initListDonasiRecyclerView()
        initListDonasiRekomendasiRecyclerView()

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

        val home1 = TopDonasi(1)
        val home2 = TopDonasi(2)
        homeList.add(home1)
        homeList.add(home2)
        donasiAdapter.setData(homeList)
    }

    private fun initListDonasiRekomendasiRecyclerView() {
        donasiAdapter = DonasiTopAdapter(requireActivity(), this)
        linearLayoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        rvDonasi.layoutManager = linearLayoutManager
        rvDonasi.adapter = donasiAdapter
    }

    private fun initListDonasiRecyclerView() {
        donasiRekomendasiAdapter = DonasiRekomendasiAdapter(requireActivity(), this)
        linearLayoutManager = LinearLayoutManager(requireActivity(), LinearLayoutManager.HORIZONTAL, false)
        rvRekomendasi.layoutManager = linearLayoutManager
        rvRekomendasi.adapter = donasiRekomendasiAdapter
    }

    override fun onItemClicked(v: View, position: Int) {

    }

    override fun onItemHomeClicked(v: View, position: Int) {

    }
}