package com.example.mailpost.ui.letterbox

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.mailpost.R
import com.example.mailpost.databinding.FragmentLetterBoxBinding
import com.example.mailpost.ui.adapter.LetterBoxRvAdapter
import com.example.mailpost.ui.utils.DividerDecoration
import com.example.mailpost.ui.utils.MarginDecoration
import com.example.mailpost.ui.utils.providePrivateLetters


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
        val marginDecoration = MarginDecoration()
        val dividerDecoration = DividerDecoration(
            50f,
            10f,
            ContextCompat.getColor(requireContext(), R.color.itemDividerColor)
        )

        with(binding) {
            letterRvAdapter = LetterBoxRvAdapter(requireContext(), providePrivateLetters())
            letterBoxRv.addItemDecoration(marginDecoration)
            letterBoxRv.addItemDecoration(dividerDecoration)
            letterBoxRv.adapter = letterRvAdapter
        }
    }
}