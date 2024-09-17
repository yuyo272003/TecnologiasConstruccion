public class Account{
    private double balance; 
    private String name;
    private String accountType;


    public Account(double balance, String name, String accountType) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    } 

    public double CalculatedInterest(){

        /*if(accountType == "current"){
            return balance * 0.2; 


        }else {
            return balance * 0.3; 
        } */

        switch (accountType) {
            case "current":
                return balance * 0.2;
                break; 
            case "saving":
                return balance * 0.3;
                break;
            case "otra": 
                return balance * 0.5;
                break; 
            default:
                return 0; 
                break; 
        }
    }
    

}