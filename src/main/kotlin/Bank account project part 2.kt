
 var accountBalance = (0..1000).random()
fun main() {
    println("The accound balance is $accountBalance")
    val money = (0..1000).random()
    println("The money is $money")
//    var output = debitWithdraw(money)
//    var output = deposit(money)
    var output = creditDeposit(money)
//    print("The checking balance is $output dollars")
}
    // Step 3
    // The withdrawal operation for checking and credit bank accounts
fun withdraw(amount:Int): Int{
        print("The withdrawl amount is $amount")
        accountBalance -= amount
        return accountBalance
    }

 fun debitWithdraw(amount:Int): Int {
     if(accountBalance == 0) {
         print("Can't withdraw, no money on this account!")
     }
     else if (amount > accountBalance) {
         print("Not enough money on this account! The checking balance is ${accountBalance} dollars.")
         return 0
     }
     else{
          return withdraw(amount = amount)
     }
     return amount
 }

 fun deposit(amount:Int): Int {
     accountBalance += amount
     print("The amount of money deposited is $$amount and updated" +
             "account balance is $$accountBalance")
     return accountBalance
 }

 fun creditDeposit(amount:Int): Int {
     if (accountBalance == 0) {
         println("This account is completely paid off! Do not deposit money!")
         return accountBalance
     } else if ((accountBalance + amount) > 0) {
             print("Deposit failed, you tried to pay off an amount greater than the " +
                         "credit balance. The checking balance is $accountBalance dollars.")
         return 0
     } else if (amount == -accountBalance) {
         accountBalance = 0
         println("You have paid off this account!")
     } else {
         return deposit(amount)
             }
     return accountBalance
 }

