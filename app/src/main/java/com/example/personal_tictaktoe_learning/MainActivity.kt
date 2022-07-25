package com.example.personal_tictaktoe_learning

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var p1Chance: Boolean = true
    var gamePlayable: Boolean = true
    var drawCount : Int = 0

    var a1Click: Boolean = true
    var a2Click: Boolean = true
    var a3Click: Boolean = true

    var b1Click: Boolean = true
    var b2Click: Boolean = true
    var b3Click: Boolean = true

    var c1Click: Boolean = true
    var c2Click: Boolean = true
    var c3Click: Boolean = true

    var pOneName = "Player 01"
    var pTwoName = "Player 02"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initializing buttons
    }

    fun a1Action(view: View) {
        if(a1Click && gamePlayable){
            if (p1Chance) {
                btnA1.text = "X"
                p1Chance = false
            } else {
                btnA1.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        a1Click=false
    }
    fun a2Action(view: View) {
        if(a2Click && gamePlayable){
            if (p1Chance) {
                btnA2.text = "X"
                p1Chance = false
            } else {
                btnA2.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        a2Click=false
    }
    fun a3Action(view: View) {
        if(a3Click && gamePlayable){
            if (p1Chance) {
                btnA3.text = "X"
                p1Chance = false
            } else {
                btnA3.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        a3Click=false
    }
    fun b1Action(view: View) {
        if(b1Click && gamePlayable){
            if (p1Chance) {
                btnB1.text = "X"
                p1Chance = false
            } else {
                btnB1.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        b1Click=false
    }
    fun b2Action(view: View) {
        if(b2Click && gamePlayable){
            if (p1Chance) {
                btnB2.text = "X"
                p1Chance = false
            } else {
                btnB2.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        b2Click=false
    }
    fun b3Action(view: View) {
        if(b3Click && gamePlayable){
            if (p1Chance) {
                btnB3.text = "X"
                p1Chance = false
            } else {
                btnB3.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        b3Click=false
    }
    fun c1Action(view: View) {
        if(c1Click && gamePlayable){
            if (p1Chance) {
                btnC1.text = "X"
                p1Chance = false
            } else {
                btnC1.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        c1Click=false
    }
    fun c2Action(view: View) {
        if(c2Click && gamePlayable){
            if (p1Chance) {
                btnC2.text = "X"
                p1Chance = false
            } else {
                btnC2.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        c2Click=false
    }
    fun c3Action(view: View) {
        if(c3Click && gamePlayable){
            if (p1Chance) {
                btnC3.text = "X"
                p1Chance = false
            } else {
                btnC3.text = "O"
                p1Chance = true
            }
            drawCount++
            winLoseCheck()
        }
        c3Click=false
    }

    private fun winLoseCheck() {
        var a1 = btnA1.text
        var a2 = btnA2.text
        var a3 = btnA3.text

        var b1 = btnB1.text
        var b2 = btnB2.text
        var b3 = btnB3.text

        var c1 = btnC1.text
        var c2 = btnC2.text
        var c3 = btnC3.text

        var sList: List<String> = listOf()


        if(drawCount>9){
            winLoseTV.text = "Draw"
        }
        else{ //vertical 3 rows
            if(a1==a2 && a2==a3 && a1!="") {
                sList = listOf("a1","a2","a3")
                if(a1=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(b1==b2 && b2==b3 && b1!="") {
                sList = listOf("b1","b2","b3")
                if(b1=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(c1==c2 && c2==c3 && c1!="") {
                sList = listOf("c1","c2","c3")
                if(c1=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }  //horizontal 3 rows
            else if(a1==b1 && c1==b1 && a1!="") {
                sList = listOf("a1","b1","c1")
                if(a1=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(a2==b2 && b2==c2 && a2!="") {
                sList = listOf("a2","b2","c2")
                if(a2=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(a3==b3 && b3==c3 && a3!="") {
                sList = listOf("a3","b3","c3")
                if(a3=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            } //cross winnings
            else if(a1==b2 && b2==c3 && a1!="") {
                sList = listOf("a1","b2","c3")
                if(a1=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(a3==b2 && b2==c1 && a3!="") {
                sList = listOf("a3","b2","c1")
                if(a3=="X")
                    playerOneWin()
                else
                    playerTwoWin()
                gamePlayable = false
            }
            else if(drawCount>=9){
                winLoseTV.text = "Draw"
            }
        }
        colorButton(sList)
    }

    private fun playerOneWin() {
        winLoseTV.text = "$pOneName Won"
    }

    private fun playerTwoWin() {
        winLoseTV.text = "$pTwoName Won"
    }

    private fun colorButton(btnArray: List<String>) {
        if(btnArray.contains("a1")){
            btnA1.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("a2")){
            btnA2.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("a3")){
            btnA3.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }

        if(btnArray.contains("b1")){
            btnB1.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("b2")){
            btnB2.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("b3")){
            btnB3.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }

        if(btnArray.contains("c1")){
            btnC1.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("c2")){
            btnC2.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
        if(btnArray.contains("c3")){
            btnC3.setBackgroundColor(ContextCompat.getColor(this, R.color.winBoxColor))
        }
    }
}