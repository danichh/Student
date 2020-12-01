/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape.student;



/**
 *Class of Student, basic OOP exercise 
 * @author Danich Hang
 */
public class Student {
    private String name; 
    private int age;
    private String gender;
    private String id; 
    private String email; 
    private Address address;   // user defined class in another use defined class 
    private static int nextId = 1;   // one copy of it 
    private final static String SCHOOL_NAME = "Vanier College"; 

    public Student() {
        this.name = null;
        this.age = 0;
        this.gender = null;
        this.id = null; 
        this.email = null;
        this.address = null; 
    }
    
    public Student (String name, String gender){  // non-static method 
        this.name = name; 
        this.age = 0; 
        this.gender = gender; 
        this.id = String.format("%06d", nextId++); 
        this.email = null;
        this.address = null; 
        
    }
     public Student(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.id = String.format("%06d", nextId++); 
            this.email = null; 
            
     }
    public Student(String name, int age, String gender, Address address) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.id = String.format("%06d", nextId++); 
            this.email = null; 
            this.address = address;
            
    }
    

    public Student(Student student) {
            this.name = student.name;
            this.age = student.age;
            this.gender = student.gender;
            this.id = student.id; 
            this.email = student.email; 
            this.address = new Address(student.address); // deep copy  
    }
    
    public static boolean isNameValid(String name){   // static method (belong to the class) 
        for (int i = 0; i < name.length() - 1; i++){
            char c = name.charAt(i);
            if (!Character.isLetter(c) && c != ' ' && c != '-' && c != '\'')
                return false; 
        }
        return true; 
    }
    
    public void checkDistance() {
        if (this.address.getCity().equalsIgnoreCase("montreal"))
            System.out.println("YOu live ery close to school");
        else if (this.address.getProvince().equalsIgnoreCase("QC"))
            System.out.println("YOu live not very close to school, but "
                    + "also not too far ");
        else 
            System.out.println("You live really far form the school !");
    }
    /**
     * generate the school email 
     */
    public void generateEmail (){
        email = String.format("%s@vaniercollege.ca", name); 
        
    }
  

    public boolean equal (Student student){
        return this.name.equals(student.name) &&
                this.age == student.age &&
                this.gender.equals(student.gender) && 
                this.id.equals(student.id) &&
                this.email.equals(student.email) &&
                this.address.equals(student.address);
        
    }

    @Override
    public String toString() {
        String str = "";
        
        
        str += String.format("%-10s: %s\n","Name", name); 
        str += String.format("%-10s: %d\n","Age", age); 
        str += String.format("%-10s: %s\n","Gender", gender); 
        str += String.format("%-10s: %s\n","ID", id);
        str += String.format("%-10s: %s\n","email", email);
        str += String.format("Student form %s\n", SCHOOL_NAME);
         str += String.format("%-10s: \n","Address");
         str += String.format("%s\n",address); 
        
        return str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (isNameValid(name)){
            this.name = name;
            this.email = String.format("%s@vaniercollege.com", name.toLowerCase());
        }
        else 
            System.out.println("Sorry, that new name is invalid ... Request denyed");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getId (){
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getEmail (){
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
        int atIdx = email.indexOf("@");
        name = email.substring(0, atIdx);
    } 

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

   
}