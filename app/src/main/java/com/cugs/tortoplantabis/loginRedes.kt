package com.cugs.tortoplantabis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cugs.tortoplantabis.ui.main.LoginRedesFragment

class loginRedes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_redes_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginRedesFragment.newInstance())
                .commitNow()
        }
    }
}