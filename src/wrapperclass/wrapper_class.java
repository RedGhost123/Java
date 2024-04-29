package wrapperclass;


/*

** -  In wrapper class we store primitive datatype. ex- int,flat,double etc.
  -----------------------------------------
 | Primitive DataType   |    Wrapper Class |
 |-----------------------------------------|
 | int                  |     Integer      |
 | float                |     Float        |
 | char                 |     Character    |
 | boolean              |     Boolean      |
 | long                 |     Long         |
 -------------------------------------------

      # -- Wrapper classes replace the using declaring int,float etc or other primitive datatype variables.

 */

public class wrapper_class {
    public static void main(String[] args) {
        // Wrapper classes

        Integer i = Integer.valueOf(5);
        System.out.println(i);


        Float f = Float.valueOf(8);
        System.out.println(f);
    }
}
