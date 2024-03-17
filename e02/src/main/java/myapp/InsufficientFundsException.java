package myapp;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException() {
        System.out.println("Not enough money for the withdrawal.");
    }
}
