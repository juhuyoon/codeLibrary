class Teacher {
    String designation = "Teacher";
    String college = "Beginnersbook";
    void does() {
        System.out.println("Teaching");
    }
}

public class InheritanceEx extends Teacher {
    //Use the keyword extends to inherit a class. 
    //Class Teacher is parent, Class InheritanceEx is the child. 
    String mainSubject = "Computer Science";
    public static void main(String args[]) {
        InheritanceEx obj = new InheritanceEx(); 
        //constructor to create a new object 
        System.out.println(obj.college);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
        obj.does();
    }
}

/* 
    Multi-level inheritance is allowed in Java but NOT multiple inheritances. 
*/