/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2_verifica_filab;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author spangaro_francesco
 */
public class DatiCondivisi {
    private String [] elencoAGENDA_CELL = {"02384938", "02928903",
        "34092883903", "3339283403", "3409212345", "02300903",
        "34192883000", "34092882012", "023928833", "1234567890"};
    
    private String[] trovati;
    private String[] inseriti;
    private String str;
    
    private Semaphore fineIns;
    private Semaphore fineCont1;
    private Semaphore fineCont2;
    private Semaphore fineStampa;

    public DatiCondivisi() {
        this.fineIns = new Semaphore(0); 
        this.fineCont1 = new Semaphore(0);
        this.fineCont2 = new Semaphore(0);
        this.fineStampa = new Semaphore(0);
    }
    
    public void waitFineIns(){
        try {
            this.fineIns.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitFineCont1(){
        try {
            this.fineCont1.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitFineCont2(){
        try {
            this.fineCont2.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void waitFineStampa(){
        try {
            this.fineStampa.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(DatiCondivisi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void signalFineIns(){
        this.fineIns.release();
    }
    
    public void signalFineCont1(){
        this.fineCont1.release();
    }
    
    public void signalFineCont2(){
        this.fineCont2.release();
    }
    
    public void signalFineStampa(){
        this.fineStampa.release();
    }

    public String[] getElencoAGENDA_CELL() {
        return elencoAGENDA_CELL;
    }

    public void setElencoAGENDA_CELL(String[] elencoAGENDA_CELL) {
        this.elencoAGENDA_CELL = elencoAGENDA_CELL;
    }

    public String[] getTrovati() {
        return trovati;
    }

    public void setTrovati(String[] trovati) {
        this.trovati = trovati;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String[] getInseriti() {
        return inseriti;
    }

    public void setInseriti(String[] inseriti) {
        this.inseriti = inseriti;
    }
    
    
    
}
