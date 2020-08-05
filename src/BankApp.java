public class BankApp {
    private Command openAccount;
    private Command closeAccount;
    private Command raiseAccount;

    public BankApp(Command openAccount, Command closeAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
    }

    public BankApp(Command openAccount, Command closeAccount, Command raiseAccount) {
        this.openAccount = openAccount;
        this.closeAccount = closeAccount;
        this.raiseAccount = raiseAccount;
    }

    public void clickOpenAccount() {
        System.out.println("User click open an account");
        openAccount.execute();
    }

    public void clickCloseAccount() {
        System.out.println("User click close an account");
        closeAccount.execute();
    }
    public void raiseCloseAccount() {
        System.out.println("User click raise an account");
        raiseAccount.execute();
    }

}
