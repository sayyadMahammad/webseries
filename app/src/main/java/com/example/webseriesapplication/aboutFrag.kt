package com.example.webseriesapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class aboutFrag : Fragment() {
         lateinit var name : TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


      var view : View =   inflater.inflate(R.layout.fragment_about, container, false)


        name= view.findViewById(R.id.title)
        name.text = arguments?.getString("poster","could not load")
        return view
    }


}