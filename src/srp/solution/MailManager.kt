package srp.second_solution

import srp.first_violation.User

// Single Responsibility Principle Correct Usage:
// As seen in this example, we divided our System class into specific parts
// And placed the functions in their respective classes.

class MailManager {
    fun sendEmail(user: User, email: String) {}
}

class NotificationManager {
    fun sendNotification(notification: String) {}
}

class UserManager {
    fun addUser(user: User) {}
    fun deleteUser(user: User) {}
}