/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jonathan.Baloyi
 */
public class Main {
    
    public static void main(String[] args){
       
        String[] memberNames = {"Jeff Jones", "Karf Smith", "Jabu Xolani", "Karen Williams", "Eric Bitterhout"};
        int[][] weightLoss = {{10, 10, 7}, {10, 13, 20}, {8, 7, 5}, {10, 7, 5}, {12, 10, 9}};
        int total = 0;
        System.out.println("MEMBER NAME\t\t" + "WEIGHT LOSS\t\t" + "GOAL MET\t\t");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < weightLoss.length; i++) {
            total = weightLoss[i][0] + weightLoss[i][1] + weightLoss[i][2];
            System.out.print(memberNames[i] + "\t\t"+ total+"\t\t" + (total >= 25 ? "Yes" : "No"));
            System.out.println();
        }
    }
    
}
