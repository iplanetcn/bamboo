package com.cherrystudios.bamboo

import android.os.Bundle
import com.cherrystudios.bamboo.base.BaseActivity
import com.cherrystudios.bamboo.databinding.ActivityMainBinding
import com.cherrystudios.bamboo.ui.main.MainFragment

class MainActivity : BaseActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}