/**
 * File : AngkaSialException.java
 * deskripsi : Eksepsi buatan sendiri, menolak angka sial(13) {tahayul}
 * nama : Gabriel Prakosa Ardhi
 * tanggal : 4 Februari 2025
 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan masukan angka 13 karena, haram!!");
    }
}
