public class mainencapsulation {
    public static void main(String[] args) {
         encapsulation obj = new encapsulation();
         encapsulation obj1 = new encapsulation();
         obj.setnName("johnsena");
         obj.setnRollnum(001);
         obj.setNage(30);
         obj1.setnName("greatkali");
         obj1.setnRollnum(007);
         obj1.setNage(30);
         System.out.println("name: " +obj.getnName());
         System.out.println("rollnum: " +obj.getnRollnum());
         System.out.println("age: " +obj.getNage()); 
         
         System.out.println("name: " +obj1.getnName());
         System.out.println("rollnum: " +obj1.getnRollnum());
         System.out.println("age: " +obj1.getNage());         
   }  
}
