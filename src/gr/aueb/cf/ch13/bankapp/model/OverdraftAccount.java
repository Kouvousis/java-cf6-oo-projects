package gr.aueb.cf.ch13.bankapp.model;

public class OverdraftAccount {
    private double initialBalance;

    public OverdraftAccount() {

    }

    public OverdraftAccount(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }


    // Public API

    /**
     * Allows the withdrawal of money beyond the remaining balance.
     * from {@link JointAccount}.
     * @param amount
     *      The amount tha is going to be withdrawn.
     * @return
     *      The balance after withdrawal.
     */
    public double withdraw(int amount) {
        double currentBalance = initialBalance;
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Withdrawal amount must be positive.");
            }
            currentBalance = initialBalance - amount;

            if (currentBalance < 0) {
                System.out.println("Warning: Your account is overdrawn. Current balance: " + currentBalance);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return currentBalance;
    }
}
