package com.example.webseriesapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridLayout
import android.widget.GridView


class ActorsFragment : Fragment() {
    lateinit var grid : GridLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val view : View=inflater.inflate(R.layout.fragment_actors, container, false)


        return view
    }



}