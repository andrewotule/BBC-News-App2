package com.andrew.bbcnewsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class CultureFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_culture, container, false)
        // Inflate the layout for this fragment
        val myWeb = view.findViewById<WebView>(R.id.webculture)
        myWeb.apply {
            loadUrl("https://www.bbc.com/culture")
            settings.javaScriptEnabled = true
        }
        return view
    }

}