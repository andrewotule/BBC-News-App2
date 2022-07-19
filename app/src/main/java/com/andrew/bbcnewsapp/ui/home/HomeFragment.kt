package com.andrew.bbcnewsapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.andrew.bbcnewsapp.R
import com.andrew.bbcnewsapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_home, container, false)
        // Inflate the layout for this fragment
        val myWeb = view.findViewById<WebView>(R.id.webhome)
        myWeb.apply {
            loadUrl("https://www.bbc.com/")
            settings.javaScriptEnabled = true
        }
        return view
    }

}