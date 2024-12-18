import java.util.*;
class Duplicate{
    public void stringduplicate(String str){
        int count = 0;
       for(int i=0;i<str.length();i++){
          for(int j=1;j<str.length();j++){
            if(str.charAt(i) == str.charAt(j)){
                count++;
                break;
            }
          }
       }
       System.out.println("the no. of occurences are: "+count);
    }
}
class DuplicateDemo{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string to be checked");
        String str = sc.next();
        Duplicate d = new Duplicate();
        d.stringduplicate(str);
        sc.close();
    }
}
