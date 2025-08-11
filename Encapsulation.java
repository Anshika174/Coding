public class Encapsulation {
    public static void main(String args[]){
    Bank_account bankacc1= new Bank_account();
    bankacc1.setAHN("Alice");
    bankacc1.setAN(12345567);
    bankacc1.setBalance(-999);
    System.out.println("Account Holder Name :"+
    bankacc1.getAHN());
    System.out.println("Account Number :"+
    bankacc1.getAN());
    System.out.println("Balance :"+
    bankacc1.getBalance());
    }
}
class Bank_account{
    private long accountNumber;
    private long balance;
    private String accountHolderName;

    public String getAHN(){
        return accountHolderName;
    }
    public void setAHN(String ahn){
    this.accountHolderName=ahn;
    }
    public long getAN(){
        return accountNumber;
    }
    public void setAN(long an){
        this.accountNumber=an;
    }
    public long getBalance(){
        return balance;
    }
    public void setBalance(long bal){
        if(bal>=0){
        this.balance=bal;
        }
        else {
            System.out.println("insufficient amount");
        }
    }

    
}
