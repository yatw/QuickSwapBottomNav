package com.example.quickswapbottomnav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.quickswapbottomnav.databinding.FragmentGenericBinding
import com.google.android.material.tabs.TabLayoutMediator

class Fragment3 : Fragment() {

    private lateinit var binding: FragmentGenericBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentGenericBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager2 = binding.viewPager2
        val tabLayout = binding.tabLayout

        val adapter = ViewPagerAdapter(this)
        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            tab.text = adapter.tabTitles[position]
        }.attach()
        viewPager2.isUserInputEnabled = false // disable tab swipe to not affect google map swipe
    }


    //inner = Non Static Nested classes
    inner class ViewPagerAdapter(fp: Fragment) : FragmentStateAdapter(fp){

        val tabTitles = arrayOf("tab 1", "tab 2")

        override fun getItemCount(): Int {
            return tabTitles.size
        }
        override fun createFragment(slideIndex: Int): Fragment {
            return Fragment3Content()
        }
    }

}