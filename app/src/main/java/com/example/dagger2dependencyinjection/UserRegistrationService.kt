package com.example.dagger2dependencyinjection

// Constructor Injection
class UserRegistrationService(private val userRepository :UserRepository, private val emailService : EmailService) {

    /*  Hard coded
    private val userRepository = UserRepository()
    private val emailService = EmailService()
    */

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email,password)
        emailService.sentEmail(email, "non-reply@example.com", "You are Registered Successfully!")
    }

}