//constructor
//This -- can be used without creating another integer

class Car{
    int a;
    String name;
    Car(int a,String name){
        this.a=a;
        this.name=name;
        System.out.println("Name: "+name);
        System.out.println("Age: "+a);
    }
 }

 class Main{

    public static void main(String[] args){
        Car s1=new Car(24,"Jain");
        System.out.println("\n");
        Car s2=new Car(26,"singh");
        System.out.println("\n");
        Car s3=new Car(26,"Ali");
        System.out.println("\n");
    }
 }