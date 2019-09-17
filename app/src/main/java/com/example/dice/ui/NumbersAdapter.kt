package com.example.dice.ui

import android.util.Log
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dice.R
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.view_number_item.view.*
import kotlin.properties.Delegates

class NumbersAdapter : RecyclerView.Adapter<NumbersAdapter.ViewHolder>() {

    var items: List<UINumber> by Delegates.observable(emptyList()) { _, _, _ -> notifyDataSetChanged() }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(parent.inflate(R.layout.view_number_item))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
        Log.d("NumbersAdapter", "onBindViewHolder")
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView),
        LayoutContainer {
        fun bind(uiNumber: UINumber) {
            with(uiNumber) {
                containerView.numberTextView.text = number
                containerView.dateTextView.text = date
            }
        }
    }

}