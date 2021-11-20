package com.example.quickswapbottomnav

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.navGraphViewModels
import com.example.quickswapbottomnav.databinding.FragmentTabBinding

class Fragment4Content : Fragment() {

    private val viewModel: MyViewModel by navGraphViewModels(R.id.fragment4NestGraph){
        MyViewModel.Factory(requireActivity().application,
            findNavController().getBackStackEntry(R.id.fragment4NestGraph))
    }

    private lateinit var binding: FragmentTabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTabBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rootView.setBackgroundColor(Color.parseColor("#0000FF")) // blue
        binding.titleText.text = "Fragment Four"

        viewModel.doSomething()
    }

}