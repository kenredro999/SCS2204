object quest3 extends App {
    class Account(initialBalance: Double) {
        private var balance: Double = initialBalance
        
        def deposit(amount: Double): Unit = {
            if (amount > 0) {
            balance += amount
            println(s"Deposited $amount. New balance: $balance")
            } else {
            println("Invalid deposit amount")
            }
        }
        
        def withdraw(amount: Double): Unit = {
            if (amount > 0 && amount <= balance) {
            balance -= amount
            println(s"Withdrew $amount. New balance: $balance")
            } else {
            println("Invalid withdrawal amount")
            }
        }
        
        def transfer(amount: Double, targetAccount: Account): Unit = {
            if (amount > 0 && amount <= balance) {
            balance -= amount
            targetAccount.deposit(amount)
            println(s"Transferred $amount to target account")
            } else {
            println("Invalid transfer amount")
            }
        }
        
        def getBalance: Double = balance
    }

    val account1 = new Account(1000.0)
    val account2 = new Account(500.0)

    account1.deposit(200.0)
    account1.withdraw(150.0)
    account1.transfer(100.0, account2)

    println(s"Account 1 balance: ${account1.getBalance}")
    println(s"Account 2 balance: ${account2.getBalance}")

}