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
public interface SetInterface <T>{
    
    public boolean add(T newElement);
    public boolean remove(T newElement);
    public boolean checkSubset(SetInterface anotherSet);
}
