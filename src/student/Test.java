/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape.student;

import clock.Clock;

/**
 *
 * @author danichh
 */
public class Test {
    public static void main(String[] args) {
        
        
        Clock c = new Clock(14,55,2); 
        Clock c2 = new Clock(c); 
        
        for (int i = 0; i < 10000; i++){
            c.increseSe();
            System.out.println(c);
        }
        System.out.println(c);
//        Student stu1 = new Student("danich", 12, "female", new Address("30", "123", 
//                "Main Street", "MOntreal", "QC", "A1A A2A")); 
//        Student stu2 = new Student("Yi", 35, "male"); 
//        Student stu3 = new Student("Wang", 18, "male"); 
//        
//        stu1.getAddress().setAptNum("223");
//        stu1.getAddress().setCity("Toronto");
//        stu1.getAddress().setProvince("ON");
//        stu1.checkDistance();
//        System.out.println(stu1);
//        System.out.println(stu2);
//        System.out.println(stu3);
//      // Never use == to compare two object
                                          // if you want to compare thier value 
          
    }
}
