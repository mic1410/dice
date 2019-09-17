package com.example.dice.ui

import com.example.domain.RolledNumber
import java.text.SimpleDateFormat

data class UINumber(val number: String, val date: String)

fun RolledNumber.toPresentationModel(): UINumber {
    val sdf = SimpleDateFormat("HH:mm:ss, yyyy MMM dd")
    val format = sdf.format(date.time)

    return UINumber("$number ", format)
}