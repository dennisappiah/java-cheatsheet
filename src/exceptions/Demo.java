package exceptions;

public class Demo {

    public static void main(String[] args) {
        var account = new Account();
        try {
            account.show(0);
        } catch (InsuffientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }

}
