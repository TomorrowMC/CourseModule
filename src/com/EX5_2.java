package com;

/**
 * @author Yifei.Hu
 * @create 2021-11--00:40
 */
public class EX5_2 {
    public static boolean isValidID(String id) {
        int total=0;//创建一个变量id中所有数字的和

        for (int i = 0; i < id.length()-1; i++) {//遍历id中的每一个char字符
            char c= id.charAt(i);//获取id中第i个位置的char字符的内容,命名为c
            if (Character.isDigit(c)) {//判断c是不是一个数字,如果是,则进入if语句
                String str= String.valueOf(c);//把char变成string,因为只有string才能变成int,char不能直接变成int
                int temp= Integer.parseInt(str);//把string变成int
                total+=temp;//获取数字的和
            }
            }
        char c= id.charAt(id.length() - 1);//获取id中最后个位置的char字符的内容,命名为c
        String str= String.valueOf(c);//把char变成string,因为只有string才能变成int,char不能直接变成int
        int temp;//声明一个int,用来判断最后一位和total是不是相等的

        if (str.equalsIgnoreCase("X")) {//把str转换成int
           temp=10;
        }else {
            temp = Integer.parseInt(str);
        }
        total=total%11;
        if (temp==total) {
            return true;
        }else {
            return false;
        }

        }

    public static void main(String[] args) {
        isValidID("A001-606X-17X");
    }

    }

