package com.example.dice.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.data.RolledNumberRepo
import com.example.dice.R
import com.example.dice.framework.SamplePersistenceLib
import com.example.usecases.RequestNewNumber
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), Presenter.View {

    private val numbersAdapter = NumbersAdapter()

    private val rolledNumberRepo = RolledNumberRepo(SamplePersistenceLib())
    private val presenter: Presenter = Presenter(this, RequestNewNumber(rolledNumberRepo))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler.adapter = numbersAdapter

        rollDice.setOnClickListener { presenter.buttonClicked() }
    }

    override fun renderNumbers(numbers: List<UINumber>) {
        numbersAdapter.items = numbers
    }

    override fun onDestroy() {
        presenter.onDestroy()
        super.onDestroy()
    }
}