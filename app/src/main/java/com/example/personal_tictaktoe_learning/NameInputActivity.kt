package com.example.personal_tictaktoe_learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name_input.*

class NameInputActivity : AppCompatActivity() {

    var playerOneName: String = ""
    var playerTwoName: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input)
    }

    fun withNameAction(view: View) {
        if(playerOneNameET.text.toString() != "" && playerTwoNameET.text.toString() != ""){
            playerOneName=playerOneNameET.text.toString()
            playerTwoName=playerTwoNameET.text.toString()
            toGameActivity()
        }
        else{
            Toast.makeText(this, "Enter Players names or continue without names", Toast.LENGTH_SHORT).show()
        }
    }
    fun withoutNameAction(view: View) {
        playerOneName="Player 01"
        playerTwoName="Player 02"
        toGameActivity()
    }

    fun toGameActivity() {
        //creating intent object for main activity (an object connect 2 activities)
        val intent = Intent(applicationContext, MainActivity::class.java)

        //using put extra method to in key value pair (key and value) to send data to next activity
        intent.putExtra("playerOneNameIntent", playerOneName)
        intent.putExtra("playerTwoNameIntent", playerTwoName)

        //starting next activity
        startActivity(intent)
    }
}