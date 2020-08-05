public class RaisingAccount implements Command {
    private Account account;

    public RaisingAccount(Account account) {
        this.account = account;
    }

    @Override
    public void execute() {
        account.raise();
    }
}
