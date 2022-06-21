package com.example.menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.menus.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var b: ActivityMainBinding
    private var cont = 0

    companion object {
        private val ID_MENU_SETTINGS = Menu.FIRST
        private val ID_GROUP_BR = Menu.FIRST
        private val ID_ELEMENTO_CHECKBOX = Menu.FIRST
        private val ID_BOTONRADIO_1 = Menu.FIRST + 1
        private val ID_BOTONRADIO_2 = Menu.FIRST + 2
        private val ID_BOTONRADIO_3 = Menu.FIRST + 3

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        super.onCreateOptionsMenu(menu)

        menu.add(Menu.NONE, ID_ELEMENTO_CHECKBOX, Menu.NONE, "CheckBox").setCheckable(true)
        menu.add(ID_GROUP_BR, ID_BOTONRADIO_1, Menu.NONE, "Opcion 1")
        menu.add(ID_GROUP_BR, ID_BOTONRADIO_2, Menu.NONE, "Opcion 2")
        menu.add(ID_GROUP_BR, ID_BOTONRADIO_3, Menu.NONE, "Opcion 3").setChecked(true)
        menu.setGroupCheckable(ID_GROUP_BR, true, true)
        return true

    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
        cont++
        b.tvTotal.text = cont.toString()


        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.itemId) {
            ID_MENU_SETTINGS -> { Snackbar.make(b.root, "asda", Snackbar.LENGTH_LONG).show()
                return true
            }



        }
        return false
    }

//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
//         super.onCreateOptionsMenu(menu)
//        menuInflater.inflate(R.menu.menu1, menu)
//        return true // para meter mi menu, que he creado, en este caso menu1
//    }

}