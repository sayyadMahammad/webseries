package com.example.webseriesapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {

    lateinit var aboutButton: Button
    lateinit var actorsButton : Button
    lateinit var trailer : ImageView
    lateinit var secondSeason : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        trailer = findViewById(R.id.trailerposter)
       secondSeason = findViewById(R.id.seriesName)
        aboutButton= findViewById(R.id.aboutButton)
        //trailer.setImageResource(intent.getIntExtra("seriesName",0))

        val fragmentManager : FragmentManager = supportFragmentManager
        val fragmentTransaction : FragmentTransaction = fragmentManager.beginTransaction()
        val firstFragment = aboutFrag()
        val actorsFrag = ActorsFragment()





        //trailer.setImageResource(R.id.lost)
        val poster = intent.getIntExtra("seriesName",0)
        val name =  intent.getStringExtra("names")
        val desc = intent.getStringExtra("Description")
        secondSeason.text = name
        trailer.setImageResource(poster)

        aboutButton.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("poster",desc)
            firstFragment.arguments=bundle
            fragmentTransaction.add(R.id.secondFrame , firstFragment)
            fragmentTransaction.commit()


        }

//        actorsButton.setOnClickListener {
//            val secondfragmentManager : FragmentManager = supportFragmentManager
//            val sfragmentTransaction : FragmentTransaction = secondfragmentManager.beginTransaction()
//
//            val actorsFrag = ActorsFragment()
//            sfragmentTransaction.add(R.id.secondFrame,actorsFrag)
//            sfragmentTransaction.addToBackStack(null)
//            sfragmentTransaction.commit()
//        }

    }
}