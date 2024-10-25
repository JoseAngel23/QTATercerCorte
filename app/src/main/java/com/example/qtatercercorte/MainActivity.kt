package com.example.qtatercercorte

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.FragmentContainerView

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_main)

            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add(R.id.nav_host_fragment, LogIn())
            }
        }
    }
}