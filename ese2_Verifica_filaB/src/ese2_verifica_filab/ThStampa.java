/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ese2_verifica_filab;

/**
 *
 * @author spangaro_francesco
 */
public class ThStampa extends Thread{
    private DatiCondivisi ptrDati;

    public ThStampa(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
    
}
