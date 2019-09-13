package com.example.usecases

import com.example.data.RolledNumberRepo
import com.example.domain.RolledNumber

class RequestNewNumber(private val rolledNumber: RolledNumberRepo) {
    operator fun invoke(): List<RolledNumber> = rolledNumber.requestNewNumber()
}