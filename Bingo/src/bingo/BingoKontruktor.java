/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bingo;

/**
 *
 * @author Acer E5
 */
public class BingoKontruktor {
     String B, I, N, G, O;
    
    public BingoKontruktor(String B, String I, String N, String G, String O){
        this.B = B;
        this.I = I;
        this.N = N;
        this.G = G;
        this.O = O;
               
    }
    
    public void print(){
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo as his name-o.");
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+0);
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+0);
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+0);
        System.out.println(B+"-"+I+"-"+N+"-"+G+"-"+0);
        System.out.println("And Bingo was his name-o.\n");
    }
}
