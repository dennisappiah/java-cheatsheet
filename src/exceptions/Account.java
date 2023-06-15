package exceptions;

import java.io.IOException;

public class Account {
    private float balance;

    public void deposit(float value) throws IOException {
        if (value <= 0)
            throw new IOException();
    }

    public void show(float value) throws InsuffientBalanceException {
        if (value > balance)
            throw new InsuffientBalanceException();
    }
}
