/**
 * Example One Card Class 
 */
public class OneCard {
    /** store card owners name */
    private String owner;
    /** store card balance of owner */
    private double balance;

/** 
 * Constructor Summary 
*/
public OneCard(String person, double money){
    this.owner = person;
    this.balance = money;
}

public void deposit(double amount){
    this.balance += amount;
}

public boolean canAfford(double amount){
    return this.balance > amount;
}

public void spend(double amount){
    if(!this.canAfford(amount)){ 
        System.out.println("you can not afford this");
    }
    else{ 
        this.balance -= amount; 
    }
    
}

public static void main(String[] args){
    OneCard myOneCard = new OneCard("alex", 472.35);
    //System.out.println(myOneCard);
    OneCard myFriendCard = new OneCard("Emily", 10.02);
    System.out.println(myFriendCard.balance);
    System.out.println(myOneCard.canAfford(50));
    System.out.println(myFriendCard.canAfford(50));
}

}



/**
 * checks balance available on this card
 * @param 
 * 
 */