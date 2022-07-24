package com.example.personal_tictaktoe_learning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var p1Chance: Boolean = true
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

    fun a1Action(view: View) {
        if(a1Click){
            if (p1Chance) {
                btnA1.text = "X"
                p1Chance = false
            } else {
                btnA1.text = "O"
                p1Chance = true
            }
            a1Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun a2Action(view: View) {
        if(a2Click){
            if (p1Chance) {
                btnA2.text = "X"
                p1Chance = false
            } else {
                btnA2.text = "O"
                p1Chance = true
            }
            a2Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun a3Action(view: View) {
        if(a3Click){
            if (p1Chance) {
                btnA3.text = "X"
                p1Chance = false
            } else {
                btnA3.text = "O"
                p1Chance = true
            }
            a3Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun b1Action(view: View) {
        if(b1Click){
            if (p1Chance) {
                btnB1.text = "X"
                p1Chance = false
            } else {
                btnB1.text = "O"
                p1Chance = true
            }
            b1Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun b2Action(view: View) {
        if(b2Click){
            if (p1Chance) {
                btnB2.text = "X"
                p1Chance = false
            } else {
                btnB2.text = "O"
                p1Chance = true
            }
            b2Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun b3Action(view: View) {
        if(b3Click){
            if (p1Chance) {
                btnB3.text = "X"
                p1Chance = false
            } else {
                btnB3.text = "O"
                p1Chance = true
            }
            b3Click=false
            drawCount++
            winLoseCheck()
        }
    }
    fun c1Action(view: View) {
        if(c1Click){
            if (p1Chance) {
                btnC1.text = "X"
                p1Chance = false
            } else {
                btnC1.text = "O"
                p1Chance = true
            }
        }
        c1Click=false
        drawCount++
        winLoseCheck()
    }
    fun c2Action(view: View) {
        if(c2Click){
            if (p1Chance) {
                btnC2.text = "X"
                p1Chance = false
            } else {
                btnC2.text = "O"
                p1Chance = true
            }
        }
        c2Click=false
        drawCount++
        winLoseCheck()
    }
    fun c3Action(view: View) {
        if(c3Click){
            if (p1Chance) {
                btnC3.text = "X"
                p1Chance = false
            } else {
                btnC3.text = "O"
                p1Chance = true
            }
        }
        c3Click=false
        drawCount++
        winLoseCheck()
    }

    private fun winLoseCheck() {
        if(drawCount>=9){
            winLoseTV.text = "Draw"
        }
    }
}