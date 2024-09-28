package org.example.Exception;

public class except {
    public static void main(String[] args) {
      int[] num= { 34,130,65,88};
      int[] den= {34,65,0,89};
      for (int i =0; i<num.length; i++) {
          try {
              System.out.println(divide(num[i], den[i]));
          }catch(Exception e){
              System.out.println(e);
          }

      }
        System.out.println("good job");
    }
    public static int divide( int a, int b) {
        try {
//            student s = null;
//            s.setId(123);
//            System.out.println(s.getId());
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println(e);
            return 0;
        }

//        catch (NullPointerException e) {
//            System.out.println(e);
//            return 1;
//        }
        catch(Exception e){
            return -1;
        }

    }
}
