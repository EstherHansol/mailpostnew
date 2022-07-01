package com.example.mailpost.ui.letterbox

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mailpost.databinding.FragmentLetterBoxBinding
import com.example.mailpost.ui.adapter.LetterBoxRvAdapter
import com.example.mailpost.ui.utils.LetterBoxItemDecoration


class LetterBoxFragment : Fragment() {

    private lateinit var binding: FragmentLetterBoxBinding
    private lateinit var letterRvAdapter: LetterBoxRvAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLetterBoxBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val decoration = LetterBoxItemDecoration()

        with(binding) {
            letterRvAdapter = LetterBoxRvAdapter(requireContext(), ArrayList())
            letterBoxRv.addItemDecoration(decoration)
            letterBoxRv.adapter = letterRvAdapter
        }
    }
}