// class Atm{
//    private int TotalBalance=100000;
//    public void getb(){
//        System.out.println(TotalBalance);
//    }
//    public void setBalance(int amount){
//        if(amount>0){
//            TotalBalance=amount;
//        }
//    }
// }
// class Main{
//    public  static void main(String[] args){
//        Atm s1=new Atm();
//        s1.getb();
//        s1.setBalance(500);
//    }
// }import java.util.Scanner;
//
//import java.util.Scanner;
import java.util.Scanner;

class Youtube {
    private String ChannelName;
    private int SubscriberCount;
    private int pin;   // PIN for security

    public Youtube(String ChannelName, int SubscriberCount, int pin) {
        this.ChannelName = ChannelName;
        this.SubscriberCount = SubscriberCount;
        this.pin = pin;
    }

    // Method to verify PIN before showing subscriber count
    public void getSubscriberCount(int enteredPin) {
        if (enteredPin == pin) {
            System.out.println("Subscriber Count: " + SubscriberCount);
        } else {
            System.out.println("Incorrect PIN! Access Denied ❌");
        }
    }

    public void getChannelName() {
        System.out.println("Channel Name: " + ChannelName);
    }

    public void increaseSubscriberCount() {
        SubscriberCount++;
    }

    public void decreaseSubscriberCount() {
        if (SubscriberCount > 0) {
            SubscriberCount--;
        } else {
            System.out.println("Error: No subscribers to remove!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create object with PIN = 1234
        Youtube y1 = new Youtube("Code with Rupesh", 5, 1234);

        y1.getChannelName();

        // Ask user to enter PIN
        System.out.print("Enter PIN to view subscriber count: ");
        int userPin = sc.nextInt();

        // Check PIN
        y1.getSubscriberCount(userPin);

        sc.close();
    }
}
