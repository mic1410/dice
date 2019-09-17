package com.example.dice.framework

import com.example.data.RolledNumberRepo
import com.example.domain.RolledNumber
import java.util.*

class SamplePersistenceLib : RolledNumberRepo.SomePersistenceLib {
    private var numbersList: List<RolledNumber> = emptyList()

    override fun getPersistedNumbers(): List<RolledNumber> {
        numbersList += RolledNumber((1..6).random(), Calendar.getInstance())
        return numbersList
    }
}