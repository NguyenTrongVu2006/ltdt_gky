package com.ute.testgit

import android.widget.EditText

fun EditText.getIntValueOrShowError(errorMessage: String = "Vui lòng nhập số hợp lệ"): Int? {
    val textValue = this.text.toString().trim()
    if (textValue.isEmpty()) {
        this.error = "Không được để trống"
        this.requestFocus()
        return null
    }

    val number = textValue.toIntOrNull()
    if (number == null) {
        this.error = errorMessage
        this.requestFocus()
        return null
    }

    return number
}