package com.benrostudios.node_notes.utils

import android.content.Context
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.benrostudios.node_notes.R
import com.google.android.material.snackbar.Snackbar

fun Context.shortToaster(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun Context.longToaster(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}

fun EditText.isValidAlphaNumeric(errorDisplay: String): Boolean {
    return if (this.text.isNotEmpty() && this.text.length > 3) {
        true
    } else {
        this.error = "Please enter a valid $errorDisplay"
        false
    }
}


fun View.errorSnackBar(msg: String){
    val snack = Snackbar.make(this, msg, Snackbar.LENGTH_LONG)
    snack.setBackgroundTint(resources.getColor(R.color.error_red))
    snack.show()
}

fun View.successSnackBar(msg: String){
    val snack = Snackbar.make(this, msg, Snackbar.LENGTH_LONG)
    snack.setBackgroundTint(resources.getColor(R.color.success_green))
    snack.show()
}

fun View.hide() {
    this.visibility = View.INVISIBLE
}

fun View.show() {
    this.visibility = View.VISIBLE
}