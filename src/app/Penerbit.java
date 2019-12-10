/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author setiyawan
 */
public class Penerbit {

    int id;
    String Penerbit;

    public Penerbit(int id, String Penerbit) {
        this.id = id;
        this.Penerbit = Penerbit;
    }

    public int getId() {
        return id;
    }

    public String getPenerbit() {
        return Penerbit;
    }

    @Override
    public String toString() {
        return getPenerbit();
    }
    
    
}
