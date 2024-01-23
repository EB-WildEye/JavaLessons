package CoreIdeas.inherent.Person;

public class Person {
// Fields
    private String name;
    private int age;

// Constructors
    // Put attention: if we use inherent relation we must create a deafualt constractor at the root class    
    public Person() {  
        // default constructor
        name = "";
        age = 0;
      }

    public Person(String n, int a) {  
        // a = age from the user, n = name from the user
        name = n;
        age = a;
    }
    

// Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String n) {  
        // n = name from the user
        name = n;
    }
    
    public int getAge() {
        return age;
    }   
    public void setAge(int a) {  
        // a = age from the user
        age = a;
    }
    

// Other Methods
    @Override
    public String toString() {  
        // returns a string with the name and age of the person
        return "Name: " + name + "\nAge: " + age;
    }
}

public static void main(String[] args) {
        Person p = new Person();  // creats a new object of person with a difaulte constructor
        p.setName("John");
        p.setAge(25);
        System.out.println(p.toString());

        // Create a new Person object without the default constructor
        //  
        //
        //
        //

        // Create a new Student object with the default constructor
        //
        //
        //

        // Create a new Student object without the default constructor
        //
        //
        //
        
    }
    
}
