package com.example.dice.ui

import com.example.domain.RolledNumber
import java.time.LocalDateTime

class UINumber(val number: String, val date: String)

fun RolledNumber.toPresentationModel(): UINumber = UINumber(
    "222", "13-09-2019"
)