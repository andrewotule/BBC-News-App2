package com.andrew.bbcnewsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView


class WorklifeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_worklife, container, false)
        // Inflate the layout for this fragment
        val myWeb = view.findViewById<WebView>(R.id.webworklife)
        myWeb.apply {
            loadUrl("https://www.bbc.com/worklife")
            settings.javaScriptEnabled = true
        }
        return view
    }

}