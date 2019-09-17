package com.example.data

import com.example.domain.RolledNumber

class RolledNumberRepo(private val persistenceLib: SomePersistenceLib) {
    fun requestNewNumber(): List<RolledNumber> {
        return persistenceLib.getPersistedNumbers()
    }

    interface SomePersistenceLib {
        fun getPersistedNumbers(): List<RolledNumber>
    }
}