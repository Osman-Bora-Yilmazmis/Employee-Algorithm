/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package büt;

/**
 *
 * @author fikre
 */
public class PieceWorker extends Employee {

    private int producedPieces;
    private int moneyPerPiece;

    public PieceWorker() {
        super();
        producedPieces = 0;
        moneyPerPiece = 0;
    }

    public PieceWorker(String GirilenAdSoyad, int GirilenTCKimlikNo, int GirilenproducedPieces, int GirilenmoneyPerPiece) {
        super(GirilenAdSoyad, GirilenTCKimlikNo);
        producedPieces = GirilenproducedPieces;
        moneyPerPiece = GirilenmoneyPerPiece;

    }

    public PieceWorker(PieceWorker Object) {
        super(Object);
        producedPieces = Object.producedPieces;
        moneyPerPiece = Object.moneyPerPiece;
    }

    //MAAS ALMA METODU
    @Override
    public double maasAl() {
        return (getProducedPieces() * getMoneyPerPiece());
    }

    /**
     * @return the producedPieces
     */
    public int getProducedPieces() {
        return producedPieces;
    }

    /**
     * @param GirilenproducedPieces
     */
    public void setProducedPieces(int GirilenproducedPieces) {
        if (GirilenproducedPieces >= 0) {
            producedPieces = GirilenproducedPieces;
        } else {
            System.out.println("Fatal Error: Negatif Sayi.");
            System.exit(0);
        }
    }

    /**
     * @return the moneyPerPiece
     */
    public int getMoneyPerPiece() {
        return moneyPerPiece;
    }

    /**
     * @param GirilenmoneyPerPiece
     */
    public void setMoneyPerPiece(int GirilenmoneyPerPiece) {
        if (GirilenmoneyPerPiece >= 0) {
            moneyPerPiece = GirilenmoneyPerPiece;
        } else {
            System.out.println("Fatal Error: Negatif Sayi.");
            System.exit(0);
        }
    }

    //TO STRING METODU
    @Override
    public String toString() {
        return (" Piece " + getAdSoyad() + " " + getTCKimlikNo() + " " + getProducedPieces() + " " + getMoneyPerPiece());
    }

}
