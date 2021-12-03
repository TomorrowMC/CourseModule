package com.CW_end;/*
 * CW2 Lab Group Fri 16
 */

public class RevEvenNum {
    
    // CW2 Lab Group Fri 16 Question 5
    // Given a string input that consists of letters,  存有很多字母的输入
    // or other characters (such as whitespace, numbers, punctuation),  或者是其他 空格 数字 符号
    // return the string where all even numbers are reversed in their positions,  所有的偶数
    // but all characters that are not an even number remain in the same position.  其他都不变
    // You must use String methods in lecture notes. 必须使用string的方法
    // You must NOT use StringBuilder or Regular Expression methods.
    
    public static String revEvenNum(String input) {
       /* int toalEvenNumber=0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int j= Integer.parseInt(input.substring(i, i+1));
                if (j %2==0) {
                    //EvenNumbers[toalEvenNumber]=j;
                    toalEvenNumber++;
                }
            }
        }

        int[] EvenNumbers=new int[toalEvenNumber];
        int numberIndex=toalEvenNumber-1;
        toalEvenNumber=0;

        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int j= Integer.parseInt(input.substring(i, i+1));
                if (j %2==0) {
                    EvenNumbers[toalEvenNumber]=j;
                    toalEvenNumber++;
                }
            }
        }


        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                int j= Integer.parseInt(input.substring(i, i+1));
                if (j %2==0) {
                    String str1= input.substring(0, i);
                    String str2 = String.valueOf(EvenNumbers[numberIndex]) ;
                    String str3 = input.substring(i+1,input.length());
                    numberIndex--;
                    input=str1+str2+str3;
                }
            }
        }
		return input;*/

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length/2; i++) {
            label:  if (chars[i] == '2'||chars[i] == '4'||chars[i] == '6'||chars[i] == '8'||chars[i] == '0') {
                char a=chars[i];
                for (int j = chars.length - 1; j < chars.length/2; j--) {
                    if (chars[j] == '2'||chars[j] == '4'||chars[j] == '6'||chars[j] == '8'||chars[j] == '0') {
                        chars[i]=chars[j];
                        chars[j] = a;
                        break label;
                    }
                }
            }
        }
        return String.valueOf(chars);
    }
    
    // Test Client
    public static void main(String[] args) {
        System.out.println(revEvenNum("a1234_&_5678z"));  // a1836_&_5472z
        System.out.println(revEvenNum("pq24 6^o^"));      // pq64 2^o^
        
		
        // add your own test cases here
		
		
		
		
		
    }
    
}
