package com.example.projectbp2694

class LoginModel {
    var username = ""
    var password = ""

    fun loginCek(): Boolean {
        if (username.equals("FARREL") && password.equals("7777")) {
            return true
        } else {
            return false
        }
    }
}
