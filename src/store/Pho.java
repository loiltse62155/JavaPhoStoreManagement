/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 *
 * @author Ly Tan loi
 */
public abstract class Pho implements Item{

    /**
     *
     * @return
     */
    @Override
    public Packing packing(){
        return new Bowl();
    }

    @Override
    public abstract float price();
        
    
}
