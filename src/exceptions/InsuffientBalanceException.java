package exceptions;

public class InsuffientBalanceException extends Exception{
    public InsuffientBalanceException(){
        System.out.println("Insufficient funds in your account");
    }
    public InsuffientBalanceException(String message) {
        super(message);
    }
}
