package com.okumu.dropdownapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.okumu.dropdownapp.databinding.FragmentFirstBinding

class FirstFragment: Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onResume() {
        super.onResume()
        val languages = resources.getStringArray(R.array.languages)
        val arrayAdapter = ArrayAdapter(requireContext(), R.layout.dropdown_item, languages)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Infalte layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)



        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}


