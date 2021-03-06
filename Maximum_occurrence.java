/*
Problem
You are given a string which comprises of lower case alphabets (a-z), upper case alphabets (A-Z), numbers, (0-9) and special characters like !,-.; etc.

You are supposed to find out which character occurs the maximum number of times and the number of its occurrence, in the given string. If two characters occur equal number of times, you have to output the character with the lower ASCII value.

For example, if your string was: aaaaAAAA, your output would be: A 4, because A has lower ASCII value than a.

Input format:
The input will contain a string.

Output format:
You've to output two things which will be separated by a space:
i) The character which occurs the maximum number of times.
ii) The number of its occurrence.

Constraints:
The maximum length of the string can be 1000.
Sample Input
Pulkit is a dog!!!!!!!!!!!!
Sample Output
! 12

*/

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int maxx=0;
        char val='A';
        int[] freq=new int[265];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)]++;
        }
         
        for(int i=0;i<freq.length;i++){
            if(freq[i]>maxx){
                maxx=freq[i];
                val=(char)i;
            }
        }
        System.out.println(val+" "+maxx);
    }
}
