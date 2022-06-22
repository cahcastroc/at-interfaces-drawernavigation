package me.camila.at_interfaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import me.camila.at_interfaces.databinding.ActivityNavDrawerBinding

class NavDrawerActivity : AppCompatActivity() {

    private lateinit var _binding: ActivityNavDrawerBinding


override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    _binding = ActivityNavDrawerBinding.inflate(layoutInflater)
    setContentView(_binding.root)

    val navHostFragment = (supportFragmentManager.findFragmentById(_binding.fragmentContainerView.id)) as NavHostFragment
    val navController = navHostFragment.navController

    //Tool Bar
    val appBarConfiguration = AppBarConfiguration(navController.graph,_binding.drawerLayout)

    _binding.toolbar.setupWithNavController(navController,appBarConfiguration)

    //NavView
    _binding.navView.setupWithNavController(navController)



}
}