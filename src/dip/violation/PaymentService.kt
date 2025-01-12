package dip.violation

// Dependency Inversion Principle Violation
// As we can see in this example, each of our payment methods is processed separately in our Service class in a hard code way.
// Instead of a hard code implementation, the system needed to be DEPEND to an abstract structure.

class PaymentService {
    private val paymentProcessorPaypal = PaypalPaymentProcessor()
    private val paymentProcessorStripe = StripePaymentProcessor()

    fun processPaymentWithPaypal(amount: Double): Boolean {
        return paymentProcessorPaypal.processPayment(amount)
    }

    fun processPaymentWithStripe(amount: Double): Boolean {
        return paymentProcessorStripe.processPayment(amount)
    }
}

class PaypalPaymentProcessor {
    fun processPayment(amount: Double): Boolean {
        // Process payment via Paypal API
        return true
    }
}

class StripePaymentProcessor {
    fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}


fun main() {
    val paymentService = PaymentService()
    println(paymentService.processPaymentWithPaypal(50.0)) // Process payment via Paypal API
    println(paymentService.processPaymentWithStripe(50.0)) // Process payment via Stripe API
}