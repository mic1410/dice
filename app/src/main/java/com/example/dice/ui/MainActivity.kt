package com.example.dice.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.data.RolledNumberRepo
import com.example.dice.R
import com.example.usecases.RequestNewNumber
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Presenter.View {
    private val rolledNumberRepo = RolledNumberRepo()
    private val presenter: Presenter = Presenter(this, RequestNewNumber(rolledNumberRepo))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rollDice.setOnClickListener { presenter.buttonClicked() }
    }

    override fun renderNumbers(numbers: List<UINumber>) {

    }
}