package com.andrew.bbcnewsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView

class ReelFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_reel, container, false)
        // Inflate the layout for this fragment
        val myWeb = view.findViewById<WebView>(R.id.webreel)
        myWeb.apply {
            loadUrl("https://www.bbc.com/reel")
            settings.javaScriptEnabled = true
        }
        return view
    }

}