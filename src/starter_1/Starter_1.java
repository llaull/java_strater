/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starter_1;

/**
 *
 * @author Arkesys
 */
public class Starter_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //go();
        //goTest();

        /*ou 
         Test t = new Test();
         t.faireUnTruc();*/
        
    }

    static void go() {
        Starter_1 starter = new Starter_1();
        starter.faireUnTruc();
    }

    static void goTest() {
        Test t = new Test();
        t.faireUnTruc();
    }

    void faireUnTruc() {
        int nombre = 37;
        System.out.println("coucou toi " + nombre);
    }
}
