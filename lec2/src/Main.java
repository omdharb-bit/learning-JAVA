//import java.util.Scanner;
//
//public class Main {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//
//       System.out.println("Enter integer:");
//       int a = sc.nextInt();
//
//       System.out.println("Enter double:");
//     double b = sc.nextDouble();
//
//       System.out.println("Enter the single word:");
//       String c = sc.next();
//
//       sc.nextLine();
//
//       System.out.println("Enter the full line");
//       String d = sc.nextLine();
//
//       System.out.println("Integer:" + a);
//       System.out.println("double:" + b);
//       System.out.println("word:" + c);
//       System.out.println("Line:" + d);
//}
//
//}

//type casting

class Main {
    public static void main(String[] args) {

        String str = "Hello";
        char[] ch = str.toCharArray();

        System.out.println("Reversed string:");

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }

        System.out.println();
    }
}

