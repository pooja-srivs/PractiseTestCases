package com.example.practisetestcases

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )

       assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pooja",
            "123",
            "123"
        )

       assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pooja",
            "123",
            "123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `password empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Pooja",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password repeated returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Shivam",
            "123huhu",
            "12345hujk"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password size less than 2 returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Neeru",
            "13d",
            "13d"
        )

        assertThat(result).isFalse()
    }
}