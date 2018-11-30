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
public class ArraySet<T> implements SetInterface<T>{
    
    T[] setArray;
    int numberOfElements;
    private static final int DEFAULT_CAPACITY = 25;
    
    public ArraySet(){
        //Give flexibaly to the client
        this(DEFAULT_CAPACITY);
    }
    
    public ArraySet(int capacity){
        setArray = (T[]) new Object[capacity];
        numberOfElements = 0;
    }
    
    public static void main(String[] args){
        
        
    }

    //Add Element
    public boolean add(T newElement) {
        
        //check the array whether is full or not
        if(isArrayFull()){
            doubleArray();
        }
        
        for(int i = 0; i < numberOfElements; i ++){
            
            if(setArray[i].equals(newElement)){
                return false;
            }
        }
        
        setArray[numberOfElements] = newElement;
        numberOfElements++;
        return true;
        
    }
    
    public boolean isArrayFull(){
        
        return numberOfElements == setArray.length;
        
    }
    
    public void doubleArray(){
        
        //Create a object named oldArray, pointing to setArray
        T[] oldArray = setArray;
        int size= oldArray.length;
        //or int size = setArray.length;
        
        //recreate the setArray with double the size
        setArray = (T[]) new Object[2 * size];
        System.arraycopy(oldArray, 0 , setArray, 0, size);
        //(source, starting copy from what index, destination , starting copy inside from which index, what size)
    }

    //Reomove Element
    public boolean remove(T anElement) {

        for(int i = 0; i < numberOfElements; i++){
            
            if(setArray[i].equals(anElement)){
                //Found Element
                removeGap(i);
                numberOfElements--;
                return true;
            }
        }
        
        return false;
    }
    
    public void removeGap(int index){
        
        for(int i = index; i < numberOfElements - 1; i++){
        
            setArray[i] = setArray[i + 1];
        }
    }
    
    public boolean isEmpty(){
        
        return numberOfElements == 0;
        
    }
    
        public String toString(){
        
        String output = "";
        
        for(int i = 0; i < numberOfElements; i++){
            
            output += setArray[i] + "\n";
        }
        
        return output;
    }

    //Check Set
    public boolean checkSubset(SetInterface anotherSet) {
        
        //check whether anotherSet is the same type
        if(anotherSet instanceof ArraySet){
            ArraySet bSet = (ArraySet) anotherSet;
            
            if(this.numberOfElements > bSet.numberOfElements){
                
                //greater array cannnot be subset
                return false;
            }
            
            //For Set a
            for(int i = 0; i < numberOfElements; i ++){
                
                boolean found = false;
                // For Set b
                for(int j=0; j < bSet.numberOfElements && !found; j++){
                    
                    if(this.setArray[i].equals(setArray[j])){
                        found = true;//break out of the inner for loop
                    }
                }//end of inner for loop
                
                if(!found)
                    return false; //break out from the outer for loop
                
            }
        }
        return true;
    }
    
}

