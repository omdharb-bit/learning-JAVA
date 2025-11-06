 class Main{
    public static void main(String[] args){
//        String str="hello";
//        System.out.println(str.length());
//           System.out.println(str.charAt(1));
//           System.out.println(str.toUpperCase());
//           System.out.println(str.toLowerCase());
//           System.out.println(str.trim());
//           System.out.println(str.substring(2));
//           System.out.println(str.indexOf(str));
//

//  String str="hello";
//  String str1="hello";
//
//        String str=new String("hello");
//        String str1=new String("hello");
//
//  System.out.println(str==str1);  //here variable is comparing
// System.out.println(str.equals(str1)); //here string is comparing

        // Palindrome

        String a="WOW";
        String b="";
        for(int i=a.length()-1;i>=0;i--){

            b+=a.charAt(i);  //here + sign means new string
        }
if(a.equals(b)){
    System.out.println("It is Palindrome");
}else{
    System.out.println("It is not Palindrome");
}
     }
 }