package com.example.webseriesapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), onItemClicked {
    lateinit var recyclerview : RecyclerView
    var posterList = ArrayList<Int>()
    var seasonsList = ArrayList<String>()
    var names = ArrayList<String>()
    var about = ArrayList<String>()
    var episodes = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerview= findViewById(R.id.recyclerview)
        recyclerview.layoutManager=LinearLayoutManager(this@MainActivity)

        posterList.add(R.drawable.friends)
        posterList.add(R.drawable.breakingbad)
        posterList.add(R.drawable.lost)
        posterList.add(R.drawable.suits)
        posterList.add(R.drawable.bbt)
        posterList.add(R.drawable.familyguy)
        posterList.add(R.drawable.squid)
        posterList.add(R.drawable.dark)
        posterList.add(R.drawable.morning)
        posterList.add(R.drawable.billions)
        posterList.add(R.drawable.vampires)
        posterList.add(R.drawable.bates)
        names.add("Friends")
        names.add("Breaking Bad")
        names.add("Lost")
        names.add("Suits")
        names.add("The Big Bang Theory")
        names.add("Family Guy")
        names.add("Squid Game")
        names.add("Dark")
        names.add("The Morning Show")
        names.add("Billions")
        names.add("The Vampire Diaries")
        names.add("Bates Motel")

       /* episodes.add("|E01 - The One After Joey and Rachel Kiss")
        episodes.add("|E01 - Live Free or Die")
        episodes.add("|E01 - The Beginning of the End")
        episodes.add("|E02 - I Want You to Want Me")
        episodes.add("|E06 - The Romance Resonance")
        episodes.add("|E01 - Oscars Guy")
        episodes.add("|E01 - Red Light, Green Light")*/

        seasonsList.add("S10|E01 - The One After Joey and Rachel Kiss")
        seasonsList.add("S05|E01 - Live Free or Die")
        seasonsList.add("S04|E01 - The Beginning of the End")
        seasonsList.add("S03|E02 - I Want You to Want Me")
        seasonsList.add("S07|E06 - The Romance Resonance")
        seasonsList.add("S21|E01 - Oscars Guy")
        seasonsList.add("S01|E01 - Red Light, Green Light")
        seasonsList.add("S02|E06  - An Endless Cycle")
        seasonsList.add("S02|E06  -  A Private Person")
        seasonsList.add("S05|E04   -  Opportunity Zone")

        seasonsList.add("S04E06   -  We All Go a Little Mad Sometimes")
        seasonsList.add("S03E10   -  Unconscious")



        about.add("Over the course of ten years, six twenty-somethings living in New York — girl's girl Rachel Green, her " +
                "on-again off-again flame Ross Geller, type-A Monica Geller, actor and ladies man Joey Tribbiani, sarcastic Chandler Bing and free spirit " +
                "Phoebe Buffay — experience romance, fights, laughs, tears, and surprises as they learn what it really means to be a friend.")
        about.add("this is about Breaking bad")
        about.add("this is about Lost")
        about.add("this is about suits")
        about.add("this is about bit bang theory")
        about.add("this is about family guy ")
        about.add("this is about squid game")
        about.add("this is about dark")
        about.add("this is about the morning show")
        about.add("this is about Billions")
        about.add("this is about the vampires diary")
        about.add("Bates Motel")






        var myAdapter = seriesAdapter(about,posterList,seasonsList,names,this@MainActivity,this@MainActivity)
        recyclerview.adapter=myAdapter



    }



    override fun itemClicked(poster: Int, posterTitle: String, posterDesc: String) {
        var intent = Intent(this@MainActivity,SecondActivity::class.java)
        intent.putExtra("seriesName",poster)
        intent.putExtra("names",posterTitle)
        intent.putExtra("Description",posterDesc)

        startActivity(intent)
    }
}