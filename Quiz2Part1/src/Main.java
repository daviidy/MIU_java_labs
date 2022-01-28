public class Main {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];

        accounts[0] = new Checking();
        accounts[1] = new Savings();
        accounts[2] = new Retirement();

        for(Account account: accounts){
            System.out.println(account.toString());
            System.out.println(account.calculateInterest());
            System.out.println("==========================");
        }
    }
}
