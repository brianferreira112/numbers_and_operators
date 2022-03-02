package com.teksystems;

public class Main {

    public static void main(String[] args) {

        /*
        Convert to binary:
        1 decimal = 1 binary
        8 decimal = 1000 binary
        33 decimal = 100001 binary
        78 decimal = 1001110 binary
        787 decimal = 1100010011 binary
        33987 decimal = 1000010011000011 binary

        Convert to decimal notation:
        10 binary = 2 decimal
        1001 binary = 9 decimal
        00110100 binary = 52 decimal
        01110010 binary = 114
        001000011111 binary = 543
        0010110001100111 binary = 11367
         */


        /*
        int x = 2;
        System.out.println(Integer.toBinaryString(x));
        x = x<<1;
        System.out.println(Integer.toBinaryString(x));

        int y = 9;
        System.out.println(Integer.toBinaryString(y));
        y = y<<1;
        System.out.println(Integer.toBinaryString(y));

        int z = 17;
        System.out.println(Integer.toBinaryString(z));
        z = z<<1;
        System.out.println(Integer.toBinaryString(z));
        */

        /*
        int x = 150;
        System.out.println(Integer.toBinaryString(x));
        x = x>>2;
        System.out.println(Integer.toBinaryString(x));

        int y = 150;
        System.out.println(Integer.toBinaryString(y));
        y = y>>2;
        System.out.println(Integer.toBinaryString(y));

        int z = 150;
        System.out.println(Integer.toBinaryString(z));
        z = z>>2;
        System.out.println(Integer.toBinaryString(z));
        */

        /*
        int x = 7;
        int y = 17;
        int z = (x & y);
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        int a = 7;
        int b = 17;
        int c = (x | y);
        System.out.println(c);
        System.out.println(Integer.toBinaryString(c));
    */

        /*
        int f = 12;
        f = ++f;
        System.out.println(f);

        for(byte counter = 0; counter <4; counter++) {
            System.out.println(counter);
        }
        */

     //   byte k = 3;
     //   System.out.println(k);
     //   k = (byte) (1 + k);
     //   System.out.println(k);
     //   System.out.println(++k);

        int x = 5;
        int y = 8;
        int z = (++x + y);
        System.out.println(z);


    }

}
