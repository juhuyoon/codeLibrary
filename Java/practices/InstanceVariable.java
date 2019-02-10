public class InstanceVariable {
    String myInstanceVar="instance variable";
     
    public static void main(String args[]){
     InstanceVarExample obj = new InstanceVariable();
     InstanceVarExample obj2 = new InstanceVariable();
     InstanceVarExample obj3 = new InstanceVariable();
         
     System.out.println(obj.myInstanceVar);
     System.out.println(obj2.myInstanceVar);
     System.out.println(obj3.myInstanceVar);
 
         
     obj2.myInstanceVar = "Changed Text";
 
         
     System.out.println(obj.myInstanceVar);
     System.out.println(obj2.myInstanceVar);
     System.out.println(obj3.myInstanceVar);
    }
 }