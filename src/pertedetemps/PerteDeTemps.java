/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertedetemps;

/**
 *
 * @author kimngo
 */
public class PerteDeTemps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tableau tableau = new Tableau();
        
        tableau.play();
    }
    
}

/* Output 1:
Got jack (10) of diamonds from pile 0.t
Got eight (7) of clubs from pile 0.
Got nine (8) of spades from pile 7.
Got ace (0) of clubs from pile 8.
Got eight (7) of clubs from pile 0.
Got eight (7) of clubs from pile 0.
Got three (2) of diamonds from pile 7.
Got three (2) of hearts from pile 2.
Got ten (9) of diamonds from pile 2.
Got two (1) of clubs from pile 9.
Got eight (7) of spades from pile 1.
Got eight (7) of hearts from pile 7.
Got three (2) of spades from pile 7.
Got ten (9) of diamonds from pile 2.
Got seven (6) of clubs from pile 9.
Got jack (10) of hearts from pile 6.
Got nine (8) of clubs from pile 10.
Got queen (11) of clubs from pile 8.
Got seven (6) of diamonds from pile 8.
Got three (2) of spades from pile 6.
Got queen (11) of spades from pile 2.
Pile 2 is empty. We lost!

Output 2:
Got ten (9) of diamonds from pile 0.
Got ten (9) of spades from pile 0.
Got three (2) of diamonds from pile 9.
Got four (3) of clubs from pile 2.
Got queen (11) of diamonds from pile 3.
Got ten (9) of diamonds from pile 11.
Got jack (10) of hearts from pile 11.
Got nine (8) of diamonds from pile 10.
Got jack (10) of spades from pile 8.
Got ten (9) of diamonds from pile 10.
Got six (5) of hearts from pile 9.
Got six (5) of diamonds from pile 5.
Got four (3) of clubs from pile 5.
Got five (4) of spades from pile 3.
Got six (5) of hearts from pile 4.
Got seven (6) of hearts from pile 5.
Got queen (11) of spades from pile 5.
Got four (3) of diamonds from pile 11.
Got seven (6) of diamonds from pile 3.
Got two (1) of spades from pile 3.
Got ace (0) of diamonds from pile 1.
Got queen (11) of spades from pile 0.
Got five (4) of spades from pile 11.
Pile 11 is empty. We lost!

Output 3:
Got ten (9) of diamonds from pile 0.
Got nine (8) of spades from pile 0.
Got ace (0) of diamonds from pile 8.
Got king (12) of clubs from pile 0.
Got two (1) of spades from pile 12.
Got four (3) of hearts from pile 1.
Got ten (9) of spades from pile 3.
Got seven (6) of spades from pile 9.
Got four (3) of spades from pile 9.
Got six (5) of hearts from pile 6.
Got eight (7) of diamonds from pile 5.
Got queen (11) of diamonds from pile 7.
Got jack (10) of diamonds from pile 7.
Got two (1) of clubs from pile 11.
Got five (4) of spades from pile 1.
Got nine (8) of hearts from pile 4.
Got seven (6) of hearts from pile 8.
Got ace (0) of diamonds from pile 8.
Got eight (7) of clubs from pile 0.
Got four (3) of spades from pile 7.
Got queen (11) of clubs from pile 3.
Got five (4) of diamonds from pile 11.
Got king (12) of clubs from pile 4.
Got five (4) of clubs from pile 12.
Got four (3) of clubs from pile 12.
Got queen (11) of spades from pile 4.
Got nine (8) of diamonds from pile 11.
Got two (1) of diamonds from pile 8.
Pile 8 is empty. We lost!
*/