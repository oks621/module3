package main.java;

public class ATM {

        public static void main(String[] args) {
            int[]win=  {500, 200, 100, 50, 20, 10, 5, 2 ,1};
            int res = 0;
            int sum=7280;
            int i = 0;
            while( i < win.length){

                res += sum / win[i];

                sum = sum % win[i];
                i++;
            }
            System.out.println(res);}}

