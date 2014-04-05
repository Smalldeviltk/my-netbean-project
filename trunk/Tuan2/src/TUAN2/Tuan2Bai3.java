/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN2;

import java.util.Scanner;

/**
 *
 * @author Small
 */
public class Tuan2Bai3 {
    
    public static void main(String[] args){
        QuadraticEquation2 q = new QuadraticEquation2();
        q.inputQuadratic();
        q.printResultQuadratic();
    }
}

/**
 *
 * @author NGUYEN VAN SINH
 * @version 1.0.0 GIAI PHUONG TRINH BAC HAI
 */
class QuadraticEquation2 {

    private float a;
    private float b;
    private float c;

    /**
     * contractor
     */
    public QuadraticEquation2() {
        a = 0;
        b = 0;
        c = 0;
    }

    /*
     * Nhap cac he so vao phuong trinh bac hai
     */
    public void inputQuadratic() {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao he so a cua phuong trinh: ");
        this.a = sc.nextFloat();
        System.out.println();
        System.out.print("Nhap vao he so b cua phuong trinh: ");
        this.b = sc.nextFloat();
        System.out.println();
        System.out.print("Nhap vao he so c cua phuong trinh: ");
        this.c = sc.nextFloat();
        System.out.println();
    }
    
    /*
     * In ra ket qua cua phuong trinh bac hai
     */
    @SuppressWarnings("UnnecessaryReturnStatement")
    public void printResultQuadratic(){
        if(this.a == 0){
            System.out.println("Phuong trinh nay co he so a = 0.");
            return;
        } else {
            float delta = (float) (Math.pow(this.b, 2) - 4*this.a*this.c);
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem.");
                return;
            }
            if(delta == 0){
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + (-this.b/(2*this.a)));
                return;
            } else {
                System.out.println("Phuong trinh co hai nghiem phan biet"
                        + "\n x1 = " + ((-this.b + Math.sqrt(delta))/(2*this.a))
                        + "\n x2 = " + ((-this.b - Math.sqrt(delta))/(2*this.a)));
                return;
            }
        }
    }
}
