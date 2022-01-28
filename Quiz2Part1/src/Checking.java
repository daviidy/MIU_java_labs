public class Checking extends Account{
    private String interestType;

    public Checking(){
        super(2, "Shwinn", 35.5);
        this.interestType = "Yearly";
    }

    public Checking(int accountNumber, String name, double balance, String interestType){
        super(accountNumber, name, balance);
        this.interestType = interestType;
    }

    public String getInterestType() {
        return interestType;
    }

    public void setInterestType(String interestType) {
        this.interestType = interestType;
    }

    @Override
    public String toString() {
        return super.toString() +  "Checking{" +
                "interestType='" + interestType + '\'' +
                '}';
    }
}
