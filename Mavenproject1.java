/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author yahya
 */
public class Mavenproject1 {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.name = "tugrul";
        emp.hireYear = 1985;
        emp.salary = 2000;
        emp.workHours = 45;
        System.out.println(emp.name);

        System.out.println(emp.salary);

        System.out.println(emp.workHours);

        System.out.println(emp.hireYear);
        System.out.println("vergi oranı : " +emp.tax());
         System.out.println("bonus: " +emp.bonus());

        System.out.println("maas artisi: " +emp.raiseSallary());
        System.out.println("toplam maas : " +emp.totalmaas());


    }

}
