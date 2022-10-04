package com.example.fragments22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    val mainPinkFragment = PinkFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun addPinkFragmanrt(view: View){

        val pinkFragment = PinkFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, pinkFragment, "pinkFragment")
        transaction.commit()
    }

    fun addGreenFragmanrt(view: View){

        val greenFragment = GreenFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, greenFragment, "greenFragment")
        transaction.commit()
    }

    fun addYellowFragmanrt(view: View){

        val yellowFragment = YellowFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.container, yellowFragment, "yellowFragment")
        transaction.commit()
    }

    fun removePinkFragment(view: View){
        val pinkFragment = supportFragmentManager.findFragmentByTag("pinkFragment")
        if (pinkFragment!= null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.remove(pinkFragment)
            transaction.commit()
        }else{
            Toast.makeText(this, "Pink finns ej", Toast.LENGTH_SHORT).show()}
    }

    fun replacePinkFragment(view: View){

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, mainPinkFragment, "pinkFragment")
        transaction.commit()


    }

    fun changeTextPinkFragment(view: View){
        val fragment = supportFragmentManager.findFragmentByTag("pinkFragment") as? PinkFragment
        fragment?.setText("Hello PINK")

    }


}