public class Account {
    private String name;

    public Account(String name) {
        this.name = name;
    }

    public void open() {
        System.out.println("Account [" + name + "] Opened\n");
    }

    public void close() {
        System.out.println("Account [" + name + "] Closed\n");
    }

    public void raise(){
        System.out.println("Account [" + name + "] Raise\n");
    }

}
