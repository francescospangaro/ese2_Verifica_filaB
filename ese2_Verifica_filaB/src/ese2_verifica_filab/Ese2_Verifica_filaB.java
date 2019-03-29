/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2_verifica_filab;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spangaro_francesco
 */
public class Ese2_Verifica_filaB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            // TODO code application logic here
            Scanner input = new Scanner(System.in);
            java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
            
            DatiCondivisi dati = new DatiCondivisi();
            ThInserisci thInserisci = new ThInserisci(dati);
            ThControllaPrimaMeta thControllaPrimaMeta = new ThControllaPrimaMeta(dati);
            ThControllaSecondaMeta thControllaSecondaMeta = new ThControllaSecondaMeta(dati);
            ThStampa thStampa = new ThStampa(dati);
            
            thInserisci.start();
            thControllaPrimaMeta.start();
            thControllaSecondaMeta.start();
            thStampa.start();
            
            thInserisci.join();
            thControllaPrimaMeta.join();
            thControllaSecondaMeta.join();
            thStampa.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Ese2_Verifica_filaB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
