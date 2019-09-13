package com.example.data

import com.example.domain.RolledNumber
import java.time.LocalDateTime

class RolledNumberRepo {
    fun requestNewNumber(): List<RolledNumber> {
        var numbersList: List<RolledNumber> = emptyList()
        numbersList += RolledNumber(111, LocalDateTime.now())
        return numbersList
    }
}