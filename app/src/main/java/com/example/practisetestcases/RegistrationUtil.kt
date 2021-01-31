package com.example.practisetestcases

object RegistrationUtil {

    val userList = listOf<String>("Pooja", "Shikha", "Tripti")
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
        if (username.isEmpty() || password.isEmpty()){
            return false
        }

        if (username in userList){
            return true
        }

        if (password != confirmPassword ){
            return false
        }

        if (password.count { it.isDigit() } < 4){
            return false
        }

        return true
    }
}