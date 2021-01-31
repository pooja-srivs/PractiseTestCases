package com.example.practisetestcases

object RegistrationUtil {

    /**
    * the input is not valid if...
    * .....the username/password is empty
    * .....the username is already taken
    * .....the confirmPassword != real password
    * .....the password contains less than 2 digits
    */
    fun validateRegistrationInput(
        username : String,
        password : String,
        confirmPassword : String
    ): Boolean{
        return true
    }
}