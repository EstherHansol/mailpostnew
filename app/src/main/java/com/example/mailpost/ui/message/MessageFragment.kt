package com.example.mailpost.ui.message

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.example.mailpost.R
import com.example.mailpost.databinding.FragmentLetterBoxBinding
import com.example.mailpost.databinding.FragmentMessageBinding
import com.example.mailpost.ui.adapter.LetterBoxRvAdapter
import com.example.mailpost.ui.utils.DividerDecoration
import com.example.mailpost.ui.utils.MarginDecoration
import com.example.mailpost.ui.utils.providePrivateLetters


class MessageFragment : Fragment() {

    private lateinit var binding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMessageBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {

        }
    }
}