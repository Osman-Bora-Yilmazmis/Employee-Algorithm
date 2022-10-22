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
public class HourlyEmployee extends Employee {

    private int workHours;
    private int wage;

    public HourlyEmployee() {
        super();
        workHours = 0;
        wage = 0;
    }

    public HourlyEmployee(String GirilenAdSoyad, int GirilenTCKimlikNo, int GirilenworkHours, int Girilenwage) {
        super(GirilenAdSoyad, GirilenTCKimlikNo);
        workHours = GirilenworkHours;
        wage = Girilenwage;

    }

    public HourlyEmployee(HourlyEmployee Object) {
        super(Object);
        workHours = Object.workHours;
        wage = Object.wage;
    }

    //MAAS ALMA METODU
    @Override
    public double maasAl() {
        return (getWorkHours() * getWage()); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the workHours
     */
    public int getWorkHours() {
        return workHours;
    }

    /**
     * @param GirilenworkHours
     */
    public void setWorkHours(int GirilenworkHours) {
        if (GirilenworkHours >= 0) {
            workHours = GirilenworkHours;
        } else {
            System.out.println("Fatal Error: Negatif Sayi.");
            System.exit(0);
        }
    }

    /**
     * @return the wage
     */
    public int getWage() {
        return wage;
    }

    /**
     * @param Girilenwage
     */
    public void setWage(int Girilenwage) {
        if (Girilenwage >= 0) {
            wage = Girilenwage;
        } else {
            System.out.println("Fatal Error: Negatif Sayi.");
            System.exit(0);
        }

    }

    //TO STRING METODU
    @Override
    public String toString() {
        return (" Hourly " + super.toString() + " " + getWorkHours() + " " + getWage());
    }

}
