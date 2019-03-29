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
public class ThInserisci extends Thread{
    private DatiCondivisi ptrDati;

    public ThInserisci(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
    @Override
    public void run(){
        Scanner input = new Scanner(System.in);
        java.io.BufferedReader console = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        String[] inseriti = new String[10];
        char str = ' ';
        int i = 0;
        while (str != 'f') {
            System.out.println("Inserisci la cifra da controllare, inserisci f quando vuoi uscire");
            try {
                inseriti[i] = console.readLine();
            } catch (IOException ex) {
                Logger.getLogger(ThInserisci.class.getName()).log(Level.SEVERE, null, ex);
            }
            str = inseriti[i].charAt(0);
            ptrDati.setStr(str);
        }
        System.out.println("Fine inserimento");
        ptrDati.setInseriti(inseriti);
        ptrDati.signalFineIns();
        ptrDati.signalFineIns();
    }
    
}
