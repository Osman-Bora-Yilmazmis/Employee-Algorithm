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
public abstract class Employee {

    private String AdSoyad;
    private int TCKimlikNo;

    public Employee() {
        AdSoyad = "No name";
        TCKimlikNo = 0;
    }

    public Employee(String GirilenAdSoyad, int GirilenTCKimlikNo) {
        AdSoyad = GirilenAdSoyad;
        TCKimlikNo = GirilenTCKimlikNo;
    }

    public Employee(Employee Object) {
        AdSoyad = Object.AdSoyad;
        TCKimlikNo = Object.TCKimlikNo;
    }

    /**
     * @return the AdSoyad
     */
    public String getAdSoyad() {
        return AdSoyad;
    }

    /**
     * @param AdSoyad the AdSoyad to set
     */
    public void setAdSoyad(String AdSoyad) {
        this.AdSoyad = AdSoyad;
    }

    /**
     * @return the TCKimlikNo
     */
    public int getTCKimlikNo() {
        return TCKimlikNo;
    }

    /**
     * @param TCKimlikNo the TCKimlikNo to set
     */
    public void setTCKimlikNo(int TCKimlikNo) {
        this.TCKimlikNo = TCKimlikNo;
    }

    @Override
    public String toString() {
        return (AdSoyad + " " + TCKimlikNo);
    }

    public abstract double maasAl(); //METODUMUZU TANIMLAR

}
