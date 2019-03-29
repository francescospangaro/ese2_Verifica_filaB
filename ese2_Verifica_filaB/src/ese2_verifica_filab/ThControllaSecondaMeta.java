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
public class ThControllaSecondaMeta extends Thread{
    private DatiCondivisi ptrDati;

    public ThControllaSecondaMeta(DatiCondivisi ptrDati) {
        this.ptrDati = ptrDati;
    }
     @Override
     public void run(){
         ptrDati.waitFineIns();
         char str = ptrDati.getStr();
        String[] daControllare = ptrDati.getElencoAGENDA_CELL();
        String[] trovati = new String[10];
        for(int i = 0;  i < 5; i++){
            if(daControllare[i].charAt(0) == str){
                trovati[i+5]=daControllare[i];
            }
        }
        ptrDati.setTrovati2(trovati);
        ptrDati.signalFineCont2();
     }
}
