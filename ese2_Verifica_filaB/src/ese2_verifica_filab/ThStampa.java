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
public class ThStampa extends Thread {

    private DatiCondivisi ptrDati;

    public ThStampa(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }

    @Override
    public void run() {
        ptrDati.waitFineCont1();
        ptrDati.waitFineCont2();
        for (int i = 0; i < ptrDati.getTrovati().length; i++) {
            System.out.println(ptrDati.getTrovati()[i]);
        }
        System.out.println("Fine trovati");
    }
}
