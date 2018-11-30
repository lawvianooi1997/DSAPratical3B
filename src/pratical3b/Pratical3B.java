/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratical3b;

/**
 *
 * @author B1
 */
public class Pratical3B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SetInterface<Integer> setA = new ArraySet<>();
        
        System.out.println("Add Element");
        System.out.println(setA.add(1)); //true
        System.out.println(setA.add(2)); //true
        System.out.println(setA.add(3)); //true
        System.out.println(setA.add(4)); //true
        System.out.println(setA.add(4)); //false, because same element
        System.out.println(setA);
        
        System.out.println("Remove Element");
        System.out.println(setA.remove(3)); //true
        System.out.println(setA.remove(5)); //false, because the element is not available
        System.out.println(setA); 
        
        System.out.println("Check ");
        SetInterface<Integer> setB = new ArraySet<>();
        setB.add(2);
        setB.add(4);
        setB.add(6);
        setB.add(8);
        System.out.println(setA.checkSubset(setB)); //false
        
        //String compare
        SetInterface<String> setSA = new ArraySet<>();
        setSA.add("test");
        setSA.add("hello");
        
        SetInterface<String> setSB = new ArraySet<>();
        setSB.add("test");
        setSB.add("hello");
        setSB.add("ABC");
        setSB.add("CDE");
        
        System.out.println(setSA);
        System.out.println(setSA.checkSubset(setSB)); //true
        
        SetInterface<Employee> setSC = new ArraySet<>();
        setSC.add(new Employee("Johan"));
        setSC.add(new Employee("Simon"));
        
        
    }
    
}
