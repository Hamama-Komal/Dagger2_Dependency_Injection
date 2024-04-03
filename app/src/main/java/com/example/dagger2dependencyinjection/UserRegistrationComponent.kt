package com.example.dagger2dependencyinjection

import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService() : UserRegistrationService

    fun getEmailService() : EmailService
}