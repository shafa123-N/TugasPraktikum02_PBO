/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingo;

/**
 *
 * @author Acer E5
 */
public class Bingo {
    public static void main(String[] args) {
        BingoKontruktor bingo1 = new BingoKontruktor("B","I","N","G","O");
        BingoKontruktor bingo2 = new BingoKontruktor("(clap)","I","N","G","O");
        BingoKontruktor bingo3 = new BingoKontruktor("(clap)","(clap)","N","G","O");
        BingoKontruktor bingo4 = new BingoKontruktor("(clap)","(clap)","(clap)","G","O");
        BingoKontruktor bingo5 = new BingoKontruktor ("(clap)","(clap)","(clap)","(clap)","O");
        BingoKontruktor bingo6 = new BingoKontruktor ("(clap)","(clap)","(clap)","(clap)","(clap)");
        
        bingo1.print();
        bingo2.print();
        bingo3.print();
        bingo4.print();
        bingo5.print();
        bingo6.print();
    }
    
}
