/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package view;

/**
 *
 * @author roderu
 */
public enum TipoPainel {

    /**
     *
     */
    PAINEL_DATA_CENTER(0),PAINEL_METRO(1);
    private int val;
    TipoPainel(int n){
        val = n;
    }
    public static TipoPainel peloValor(int n){
        switch (n) {
            case 0:
                return PAINEL_DATA_CENTER;
            default:
                return PAINEL_METRO;
        }
    }
}
