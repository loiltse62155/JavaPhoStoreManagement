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
public abstract class PhoGa extends Pho{
    @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Pho Ga";
   }

   
}
