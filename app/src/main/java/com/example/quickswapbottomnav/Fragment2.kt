package com.example.quickswapbottomnav

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.quickswapbottomnav.databinding.FragmentGenericBinding

class Fragment2 : Fragment() {

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

        binding.rootView.setBackgroundColor(Color.parseColor("#FFC0CB")) // pink
        binding.titleText.text = "Fragment Two"

    }

}