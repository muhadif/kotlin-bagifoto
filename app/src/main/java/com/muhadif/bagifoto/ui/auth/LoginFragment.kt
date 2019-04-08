package com.muhadif.bagifoto.ui.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.muhadif.bagifoto.R
import com.muhadif.bagifoto.ui.main.HomeFragment

class LoginFragment : Fragment() {

    companion object {
        fun getInstrance() : LoginFragment = LoginFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


}
