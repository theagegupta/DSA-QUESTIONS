class hello {

    int x = 10; // class variable - defined inside a class

    // 4 principles of oops = encaplsulation , inheritance , polymorphism ,
    // Abstraction
    // access specifier - default , public , private , protected
    // class has two things - data,
    public static void main(String[] args) {
        // class = data(class variables) + behavious (metshod)
        // behavious = what something can do (function - methods)

        System.out.println("Hello");


    }
}


class Application
{
    String fullName; 
    String address;    // variable declaration
    int phoneNumber;  

    Application(String fullname, String add, int phno) // constructor 
    {
        // values ko initialize karna 
        this.fullName = fullname; 
        this.address = "23141";
        this.phoneNumber = 32234252; 
    }

    int add()
    {
        return x+y; 
    }
}

// static variable - created using Static keyword and it is same for all the instances or objects. It is associated with the class not the object. 

Application obj  = new Application("Diti kuchiya","Alampur", 4234234 ); 
Application obj2  = new Application("Ayush kuchiya","Alampur", 4234234 ); 

class HashMap
{
    HashMap()
    {

    }
}

// Day 3 = datatypes, input in java, operators 
// Day 4 = arrays , strings, loops , ifelse 