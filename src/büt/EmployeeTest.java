/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package büt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author fikre
 */
public class EmployeeTest {

    public static void main(String[] args) throws FileNotFoundException {
        Stack CalisanStack = new Stack(); //YIGINIMIZI OLSUTURUR

        Scanner fileIn = null;
        
        // TEXT DOSYASINI KONTROL EDER
        try {
            fileIn = new Scanner(new FileInputStream("bilgiler.txt")); //OKUNACAK DOSYAMIZ
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Dosya Bulunamadı.");
            System.exit(0);
        }
        
        //TEXT DOSYASINDAKI VERILERI ALIR VE YIGINIMIZA EKLER
        while (fileIn.hasNext()){
            String PieceorHourly = fileIn.next(); 
            if("piece".equals(PieceorHourly)){
                 String adSoyad = fileIn.next()+" "+ fileIn.next();
                 int TCKimlikNo = fileIn.nextInt();
                 int ProducedPieces = fileIn.nextInt();
                 int MoneyPerPiece = fileIn.nextInt();
                 PieceWorker calisan1 = new PieceWorker(adSoyad,TCKimlikNo,ProducedPieces,MoneyPerPiece);//CALISANIMIZI OLUSTURUR
                 CalisanStack.push(calisan1);
                 System.out.println(" Calisanin verileri: " + calisan1.toString()); //CALISANIN VERILERINI YAZDIRIR
                 System.out.println(" Calisanin alacagi maas: " + calisan1.maasAl()); //CALİSANIN MAASINI HESAPLAR 
                 System.out.println();
            }
            else{
                 String adSoyad = fileIn.next()+" "+ fileIn.next();
                 int TCKimlikNo = fileIn.nextInt();
                 int workHours = fileIn.nextInt();
                 int wage = fileIn.nextInt();
                 HourlyEmployee calisan2 = new HourlyEmployee(adSoyad,TCKimlikNo,workHours,wage);//CALISANIMIZI OLUSTURUR
                 CalisanStack.push(calisan2);
                 System.out.println(" Calisanin verileri: " + calisan2.toString()); //CALİSANIN VERILERINI YAZDIRIR
                 System.out.println(" Calisanin alacagi maas: " + calisan2.maasAl()); //CALİSANIN MAASINI HESAPLAR    
                 System.out.println();
            }
        
        }
        
        //YIGIT ICERIGINI KONSOLA YAZDIRIR
        System.out.println(" --CALISANLARIN VERILERININ LISTESI-- ");
        while(CalisanStack.isEmpty()==false)
        {
            Object CalisanKisi = CalisanStack.pop();
            System.out.println(CalisanKisi);
        }
        
    }
}
