 // Variables of java
 //function inside class is called methods
 //variable under method is called local variable
 //static variable-- static int
 // variables without static and outside main is called instant variables

// class Main{
//       static int data=20;
//static  void Sum(){
//    System.out.println("hello");
//}
//    public static void main(String[] args){
//
//        int a=5;
//        System.out.println(a);
//
//        maikng object
//    Main obj=new Main();
//    int b=10;
//    System.out.println(a);
//System.out.println(obj.data);


//        Main obj=new Main();
//        Sum();


//    }
// }

// class Car{
//     String name="Anshul";
// static void Sum(){
//
//        System.out.println(name);
//    }
// }
//
// class Main{
//    public static void main(String[] args){
//        Car obj =new Car();
//        obj.Sum();
//    }
// }

 // Q-1) Create a class Student with fields name, rollNumber, and marks. Write a method to display
 // student details. Create 3 student objects and display their data.


// class Student{
//  static   String name="Om Dhar";
//   static String rollnumber="23";
//  static   String marks="88";
//
//static   String name1="Krishna";
//   static String rollnumber1="21";
//  static   String marks1="8";
//
//static   String name2="Anshul";
//   static String rollnumber2="13";
//  static   String marks2="80";
//
//
//
//    static  void Student_details(){
//        System.out.println("Name of 1st student:" +name);
//        System.out.println("Roll number:" +rollnumber);
//        System.out.println("Marks:" +marks);
//        System.out.println("\n");
//
//        System.out.println("Name of 2nd student:" +name1);
//        System.out.println("Roll number:" +rollnumber1);
//        System.out.println("Marks:" +marks1);
//        System.out.println("\n");
//
//        System.out.println("Name of 3rd student:" +name2);
//        System.out.println("Roll number:" +rollnumber2);
//        System.out.println("Marks:" +marks2);
//        System.out.println("\n");
//    }
// }
// class  Main{
//    public static void main(String[] args){
//        Student obj=new Student();
//        obj.Student_details();
//    }
// }

// Q-1) Create a class Rectangle with length and breadth as fields. Add methods to calculate area and
// perimeter. Create objects with different values and call those methods

// class  Rectangle{
//         int length=10;
//         int breadth=20;
//         int area=length*breadth;
//         static void a(){
//             Rectangle r1=new Rectangle();
//             System.out.println("Area: "+r1.area);
// }
//
//}
// class Main{
//    public static void main(String[] args){
//        Rectangle.a();
//    }
// }

// Create a class Laptop with brand, RAM, and price. Add a constructor to initialize values and a
// method to display them

 class Laptop{
    String brand;
    String RAM;
  String Price;

  Laptop(String brand,String RAM,String Price){
      this.brand=brand;
      this.RAM=RAM;
      this.Price=Price;
      System.out.println("Brand Of the Laptop: "+brand);
      System.out.println("RAM Of the Laptop: "+RAM);
      System.out.println("Price Of the Laptop: "+Price);
  }
 }class Main{
    public static void main(String[] args){
        Laptop l1=new Laptop("LENOVO","256","50,000");
    }
 }