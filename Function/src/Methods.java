public class Methods {

  static void staticMethod(){
       System.out.println("this is Static Method");
    }

 void instanceMethod(){
        System.out.println("This is Instance method ");
    }

    public static void main (String[]args){
      System.out .println("Main method is Running Perfectly ");

      staticMethod();

      Methods obj = new Methods();
      obj.instanceMethod();

    }


}
