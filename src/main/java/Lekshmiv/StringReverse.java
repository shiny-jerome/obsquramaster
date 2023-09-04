/*32. Program to check whether the given Strings are Palindrome or not.
a) Java
b) Malayalam*/


package Lekshmiv;

public class StringReverse {
    
    public void palindrome(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        
        if (str.equals(reversed.toString())) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
    
    public static void main(String args[]) {
        StringReverse obj = new StringReverse();
        obj.palindrome("java");
        obj.palindrome("malayalam");
    }
}


