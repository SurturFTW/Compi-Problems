public class Animal { //default access-specifier to run with warings 

    protected String name;
    protected int age;

  
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public void eat() {
        System.out.println(this.name + " is eating.");
    }
}

public class Cat extends Animal {  //default access-specifier to run with warings 
  
    private String furColor;


    public Cat(String name, int age, String furColor) {
        Super(name, age);
        this.furColor = furColor;
    }

    public void purr() {
        System.out.println(this.name + " is purring.");
    }
}

public class q18 {
    public static void main(String[] args) {
      
        Cat cat = new Cat("Fluffy", 5, "white");
    
        cat.eat();
   
        cat.purr();
    }
}
