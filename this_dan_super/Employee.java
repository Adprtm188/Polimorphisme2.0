/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package this_dan_super;

/**
 *
 * @author SMK TELKOM 44
 */
public class Employee extends Person {

    public Employee() {
        // eksekusi konstruktor induk
        super();
        
        System.out.println("Ekekusi konstruktor Employee()");
    }
    
    public void info(){
        super.showMessage();
    }
}
