package srp.violation

// Single Responsibility Principle Violation
// In this example the System class is trying to handle many different situation at the same time.
// This approach can cause major problems in the future.

class SystemManager {
    fun addUser(user: User) {}

    fun deleteUser(user: User) {}

    fun sendNotification(notification: String) {}

    fun sendEmail(user: User, email: String) {}
}