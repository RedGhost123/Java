package ooPs;

public class Student {

     //CREATING DATATYPES
    public static void function(Class_five s3){
        System.out.println(s3.percentage);
        System.out.println(s3.roll_Noo);
        System.out.println(s3.name);
        return;
    }

    public static void main(String[] args) {
        Class_five s1 = new Class_five();
        s1.name = "Vaibhav";
        s1.roll_Noo = 32;
        s1.percentage = 98.2;
        function(s1);

        s1.name = "Aman";
        s1.roll_Noo = 32;
        s1.percentage = 99.0;

       function(s1);


    }
}
