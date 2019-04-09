package com.muhadif.bagifoto.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isEmpty
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.muhadif.bagifoto.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                selectedFragment(HomeFragment.getInstrance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                selectedFragment(UploadFragment.getInstrance())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                selectedFragment(PersonalFragment.getInstrance())
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        if(savedInstanceState == null) {
            selectedFragment(HomeFragment.getInstrance())
        }
    }

    fun selectedFragment(fragment: Fragment) {
        var transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction?.replace(R.id.frame_fragment, fragment)
        transaction?.commit()
    }
}
