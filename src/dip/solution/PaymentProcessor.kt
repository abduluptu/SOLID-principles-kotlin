package dip.solution

// Dependency Inversion Principle Correct Usage
// In the correct usage example, we did not have to implement hard code about our payment methods in our Service class,
// because we set up an abstract structure with the interface that we created.

interface PaymentProcessor {
    fun processPayment(amount: Double): Boolean
}

class PaypalPaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Paypal API
        return true
    }
}

class StripePaymentProcessor : PaymentProcessor {
    override fun processPayment(amount: Double): Boolean {
        // Process payment via Stripe API
        return true
    }
}

class PaymentService(private val paymentProcessor: PaymentProcessor) {
    fun processPayment(amount: Double): Boolean {
        return paymentProcessor.processPayment(amount)
    }
}

fun main() {
    val paymentProcessor = PaypalPaymentProcessor()
    val paymentService = PaymentService(paymentProcessor)
    println(paymentService.processPayment(50.0)) // Process payment via Paypal API

    val stripePaymentProcessor = StripePaymentProcessor()
    val stripePaymentService = PaymentService(stripePaymentProcessor)
    println(stripePaymentService.processPayment(50.0)) // Process payment via Stripe API

}