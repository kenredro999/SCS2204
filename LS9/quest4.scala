object quest4 extends App {
    class Account(initialBalance: Double) {
        private var balance: Double = initialBalance
        
        def deposit(amount: Double): Unit = {
            if (amount > 0) {
            balance += amount
            }
        }
        
        def withdraw(amount: Double): Unit = {
            if (amount > 0 && amount <= balance) {
            balance -= amount
            }
        }
        
        def applyInterest(): Unit = {
            if (balance > 0) {
            balance += balance * 0.05
            } else {
            balance += balance * 0.1
            }
        }
        
        def getBalance: Double = balance
        }

        object Bank {
        def negativeBalances(accounts: List[Account]): List[Account] = {
            accounts.filter(_.getBalance < 0)
        }
        
        def totalBalance(accounts: List[Account]): Double = {
            accounts.map(_.getBalance).sum
        }
        
        def applyInterest(accounts: List[Account]): Unit = {
            accounts.foreach(_.applyInterest())
        }
    }

    val account1 = new Account(1000.0)
    val account2 = new Account(-500.0)
    val account3 = new Account(200.0)

    val bankAccounts = List(account1, account2, account3)

    println("Accounts with negative balances:")
    Bank.negativeBalances(bankAccounts).foreach(account => println(s"Account balance: ${account.getBalance}"))

    println(s"Total balance of all accounts: ${Bank.totalBalance(bankAccounts)}")

    Bank.applyInterest(bankAccounts)
    println("Final balances after applying interest:")
    bankAccounts.foreach(account => println(s"Account balance: ${account.getBalance}"))

}