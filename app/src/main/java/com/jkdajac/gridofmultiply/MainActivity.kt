package com.jkdajac.gridofmultiply

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_third.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btOne.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, FirstFragment.newInstance("ff", "dd"))
                .commit()
        }

        btTwo.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment.newInstance("ff", "dd"))
                .commit()
        }

        btThree.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, ThirdFragment.newInstance("ff", "dd"))
                .commit()
        }

        btFour.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, FourthFragment.newInstance("ff", "dd"))
                .commit()
        }

        btFive.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, FifthFragment.newInstance("ff", "dd"))
                .commit()
        }

        btSix.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, SixthFragment.newInstance("ff", "dd"))
                .commit()
        }

        btSeven.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, SeventhFragment.newInstance("ff", "dd"))
                .commit()
        }

        btEight.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, EighthFragment.newInstance("ff", "dd"))
                .commit()
        }

        btNine.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, NinethFragment.newInstance("ff", "dd"))
                .commit()
        }

        btTen.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainerView, TenthFragment.newInstance("ff", "dd"))
                .commit()
        }


    }
}