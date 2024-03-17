package myapp;

final class App {
    private App() {
        // Utility class, no instantiation required
    }

    public static void main(final String[] args) {

        BankAccount ba = new BankAccount("1234");
        try {
            ba.withdraw(-1);
        } catch (Exception e) {
            System.out.println(e);
        }

        ba.deposit(500);

        try {
            ba.withdraw(501);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        }

    }
}

/*
 * 
3. Test Your Implementation:
    - In a separate `Main` class, create a `main` method to test your 
    `BankAccount` class.
    - Try to deposit a negative amount and catch the corresponding exception, 
    printing an error message to the console.
    - Attempt to withdraw an amount greater than the current balance and catch 
    the custom `InsufficientFundsException`, again printing an error message.
    - Include a finally block after each transaction attempt to print the current 
    balance, regardless of whether the transaction was successful or caught an
     exception.

 */
