public class Client {
    public static void main(String[] args) {
        Account account = new Account("kieu anh");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        Command raise = new RaisingAccount(account);
        BankApp bankApp = new BankApp(open, close, raise);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
        bankApp.raiseCloseAccount();
    }
}
