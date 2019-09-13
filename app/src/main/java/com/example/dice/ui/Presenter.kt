package com.example.dice.ui

import com.example.domain.RolledNumber
import com.example.usecases.RequestNewNumber
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class Presenter(
    private var view: View,
    private val requestNewNumber: RequestNewNumber
) {
    interface View {
        fun renderNumbers(numbers: List<UINumber>)
    }

    fun buttonClicked() = GlobalScope.launch(Dispatchers.Main) {
        val numbers = withContext(Dispatchers.IO) { requestNewNumber() }
        view.renderNumbers(numbers.map(RolledNumber::toPresentationModel))
    }
}