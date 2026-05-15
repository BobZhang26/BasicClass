public class People {
    // step 1: design field
    String name;
    int id;
    int age;
    int codingSkills;

    // step 2: constructor
    // option 1:
    public People(){

    }

    // option 2:
    public People(String name, int id){
        this.name = name;
        this.id = id;
    }

    // option 3:
    public People(String name, int id, int age, int codingSkills){
        this.name = name;
        this.id = id;
        this.age = age;
        this.codingSkills = codingSkills;
    }

    // step 3: define static methods
    public static void eat(){
        System.out.println("I am eating");
    }

    public static void sleep(){
        System.out.println("ZZZZZZZZZ");
    }

    // step 4: define other methods
    public String takeSDEInterview(String company){
        if (this.codingSkills > 80){
            return "Strong Hire";
        }else if (this.codingSkills >= 60){
            return "Hire";
        }else{
            return "No Hire";
        }
    }

    // step 5: define main entrance
    public static void main(String[] args){
        People harry = new People("Harry" , 1 , 17 , 99);
        People john = new People("John" , 2 , 19 , 75);
        People bob = new People("Bob" , 3 , 20 , 59);

        System.out.println(harry.id);
        System.out.println(john.name);
        System.out.println(bob.codingSkills);

        People.eat();

        System.out.println(harry.takeSDEInterview("Google"));
        System.out.println(bob.takeSDEInterview("Google"));
        System.out.println(john.takeSDEInterview("Google"));
    }





}
