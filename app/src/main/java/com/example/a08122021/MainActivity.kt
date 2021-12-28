package com.example.a08122021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initNavigation()




    }
    private fun initNavigation(){
        topAppBar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.settings-> {
                   Toast.makeText(this,R.string.srttings,Toast.LENGTH_SHORT).show()
                 true}
                else-> false
            }
        }
        bottom_navigation.setOnNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.favorites -> {
                    Toast.makeText(this, R.string.favorites, Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.watch_later -> {
                    Toast.makeText(this, R.string.Watch_later, Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.selections -> {
                    Toast.makeText(this, R.string.compiletion, Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }
    }
}



