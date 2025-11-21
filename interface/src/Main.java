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
// }

class Youtube {
private String ChannelName;
private int SubscriberCount;

public Youtube(String ChannelName, int SubscriberCount) {
    this.ChannelName = ChannelName;
    this.SubscriberCount = SubscriberCount;
}

public void getChannelName() {
    System.out.println("Channel Name: " + ChannelName);
}

public void getSubscriberCount() {
    System.out.println("Subscriber Count: " + SubscriberCount);
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
        Youtube y1 = new Youtube("Code with Rupesh", 0);
        y1.getChannelName();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.decreaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.decreaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
        y1.increaseSubscriberCount();
        y1.getSubscriberCount();
    }
}