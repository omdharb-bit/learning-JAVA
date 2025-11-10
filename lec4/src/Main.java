 class Main{

    public static void main(String[] args) {
//        StringBuilder str=new StringBuilder("hello");
//
//        str.append("j");
//                System.out.println (str);
//                System.out.println(str.insert(2,"bye"));   //insert on specfic index
//                System.out.println (str);

//        replace
//        str.replace(1,4,"hello");
//                System.out.println("replace():"+str);

        //delete

//        str.delete(2,5);
//        System.out.println("delete(): "+str);

        //deletecharAt()
//        str.deleteCharAt(1);
//        System.out.println("deleteCharAt():"+str)
//
//        //setCharAt

//        str.setCharAt(0,'X');
//        System.out.println("SetCharAt():"+str);

        //reverse

//        str.reverse();
//        System.out.println("Reverse:"+str);

//        length

//        str.length();
//        System.out.println("Length()"+str);

        //reverse a string

//        StringBuilder str = new StringBuilder("I Love Java");
//        String newStr=str.toString();
//        StringBuilder result=new StringBuilder();
//
//        String arr[]=newStr.split(" ");
//       for(String s: arr){
//           StringBuilder str2=new StringBuilder(s);
//           result.append(str2.reverse().append(" "));
//
//       }
//
//
//        str.reverse();
//        System.out.println(result.toString().trim());
//
//    }
//    }

        String str = "aaabbbccc";
        StringBuilder result = new StringBuilder();
        int count=1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count=1;
            }
         }
        result.append(result).append(count);
        System.out.println(result);
    }
}