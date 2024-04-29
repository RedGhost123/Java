package ooPs.differentclass;

import ooPs.Class_five;

public class Different_Class {
   static void fun2(Class_five s3){
        System.out.println(s3.name);
    }
    public static void main(String[] args) {
        Class_five s3 = new Class_five();
        s3.name = "Amans";
        fun2(s3);
    }
}
