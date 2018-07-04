package com.example.enpit_p12.mysize

import android.os.Bundle
import android.preference.PreferenceManager
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        pref.apply{
            val editNeck = getString("NECK", "")
            val editSleeve = getString("SLEEVE", "")
            val editWaist = getString("WAIST", "")
            val editInseam = getString("INSEAM", "")

            neck.setText(editNeck)
            sleeve.setText(editSleeve)
            waist.setText(editWaist)
            inseam.setText(editInseam)
        }

        save.setOnClickListener { onSaveTapped() }
    }

    private fun onSaveTapped(){
        val pref = PreferenceManager.getDefaultSharedPreferences(this)
        val editor = pref.edit()
        editor.putString("NECK", neck.text.toString())
                .putString("SLEEVE", sleeve.text.toString())

    }
}
