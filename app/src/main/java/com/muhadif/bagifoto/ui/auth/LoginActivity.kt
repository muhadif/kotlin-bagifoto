package com.muhadif.bagifoto.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.muhadif.bagifoto.R

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar!!.hide()

        selectedFragment(LoginFragment.getInstrance())
    }

    fun selectedFragment(fragment: Fragment) {
        var transaction : FragmentTransaction = supportFragmentManager.beginTransaction()
        transaction?.replace(R.id.frame_fragment, fragment)
        transaction?.commit()
    }
}
