package com.aybukefirat.navdrawerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_frag) as NavHostFragment
        NavigationUI.setupWithNavController(navigationView,navHostFragment.navController)

        toolbar.title = "title"
        val toggle = ActionBarDrawerToggle(this,drawer,toolbar,0,0)
        // (0,0) açma kapanma sırasındaki kaymaların miktarını ayarlayan offset değerlerdir. Biz varsayılan değeri verdik.
        drawer.addDrawerListener(toggle)
        toggle.syncState()
    }
}
