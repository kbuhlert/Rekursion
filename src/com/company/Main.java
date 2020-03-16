package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        runterzaehlen(9,6);

    }

    public static void runterzaehlen (int count, int stop){
        if (count == stop){
            return;
        } else if (count<stop) {return;}
        else {System.out.println("Zahl:" + count);
            count = count-1;
            runterzaehlen(count, stop);
        }
    }
}
