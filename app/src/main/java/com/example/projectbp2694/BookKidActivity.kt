package com.example.projectbp2694

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookKidBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // fairy
        binding.buttonFairy.setOnClickListener {
            replaceFragment(FairyFragment())
        }

        // fable
        binding.buttonFable.setOnClickListener {
            replaceFragment(FableFragment())
        }

        // science
        binding.buttonScience.setOnClickListener {
            replaceFragment(ScienceFragment())
        }

        setContentView(R.layout.activity_book_kid)
    }
    private fun replaceFragment(frg:Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook,frg)
        fragmentTrx.commit()
    }
}