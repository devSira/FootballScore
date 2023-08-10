/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscore;

import java.util.Scanner;

/**
 *
 * @author Siraphob.B
 */
public class FootballScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Admin obj = new Admin();
        FanClub obj1 = new FanClub();
        FanClub obj2 = new FanClub();
        obj.register(obj1);
        obj.register(obj2);
        Scanner sc = new Scanner(System.in);
        String score = " ";
        while(true) {
            System.out.print("Enter Score: ");
            score = sc.nextLine();
            if("".equals(score)) {
                return;
            }
            obj.setSomeData(score);
        }        
    }
    
}
