package com.example.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val stand=standard()
    val firstfrag=time_converter()
    val secfrag=currency_converter()
    val thirdfrag=area_cal()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        



    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater=menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if(item.itemId==R.id.item1)
        {
            Toast.makeText(this,"Standard is selected",Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                getSupportFragmentManager().beginTransaction().remove(secfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(thirdfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(firstfrag).commit();
                replace(R.id.flstand,stand)
                commit()
            }
        }
        if(item.itemId==R.id.item2)
        {


            Toast.makeText(this,"Time is selected",Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                getSupportFragmentManager().beginTransaction().remove(secfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(stand).commit();

                getSupportFragmentManager().beginTransaction().remove(thirdfrag).commit();
                               replace(R.id.fltime,firstfrag)
                commit()
            }
        }
        if(item.itemId==R.id.item3)
        {

            Toast.makeText(this,"Currency is selected",Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                getSupportFragmentManager().beginTransaction().remove(firstfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(stand).commit();
                getSupportFragmentManager().beginTransaction().remove(thirdfrag).commit();
                replace(R.id.flconv,secfrag)
                commit()
            }
        }
        if(item.itemId==R.id.item4)
        {

            Toast.makeText(this,"Area is selected",Toast.LENGTH_SHORT).show()
            supportFragmentManager.beginTransaction().apply {
                getSupportFragmentManager().beginTransaction().remove(secfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(firstfrag).commit();
                getSupportFragmentManager().beginTransaction().remove(stand).commit();
                replace(R.id.flarea,thirdfrag)
                commit()
            }
        }

        return true

    }
}