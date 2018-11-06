/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.m_Koordinat;
/**
 *
 * @author Habibullah
 */
public class m_Tembok {
    m_Koordinat k;
    int panjang, lebar, x, y;

    public m_Tembok(int panjang, int lebar, int x, int y) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.x = x;
        this.y = y;
    }
    
    public m_Koordinat getAtasKiri(){
        k = new m_Koordinat(x,y);
        return k;
    }
    
    public m_Koordinat getAtasKanan(){
        k = new m_Koordinat(x+panjang,y);
        return k;
    }
    
    public m_Koordinat getBawahKiri(){
        k = new m_Koordinat(x,y+lebar);
        return k;
    }
    
    public m_Koordinat getBawahKanan(){
        k = new m_Koordinat(x+panjang,y+lebar);
        return k;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
//    public boolean tabrak(int Px, int Py){
//        boolean tabrak = false;
//        if ((Px > x && Px < x+panjang) && (Py > y && Py < y+lebar)) {
//            return true;
//        }
//        return false;
//    }
    
    public boolean tabrakKiri(m_Tembok pemain){
        boolean tabrak = false;
        if ((((getAtasKanan().getX() > pemain.getAtasKiri().getX() && pemain.getAtasKiri().getX() < getBawahKanan().getX()) && 
              (getAtasKanan().getY() > pemain.getAtasKiri().getY() && pemain.getAtasKiri().getY() < getBawahKanan().getY())) &&
             ((getAtasKanan().getX() > pemain.getBawahKiri().getX() && pemain.getBawahKiri().getX() < getBawahKanan().getX()) &&
              (getAtasKanan().getY() > pemain.getBawahKiri().getY() && pemain.getBawahKiri().getY() < getBawahKanan().getY())))
            ) {
            return true;
        }
        return false;    
    }
    
        public boolean tabrakKanan(m_Tembok pemain){
        boolean tabrak = false;
        if ((((getAtasKiri().getX() < pemain.getAtasKanan().getX() && getBawahKiri().getX() < pemain.getAtasKanan().getX()) && 
              (getAtasKiri().getY() < pemain.getAtasKanan().getY() && getBawahKiri().getY() < pemain.getAtasKanan().getY())) &&
             ((getAtasKiri().getX() < pemain.getBawahKanan().getX() && getBawahKiri().getX() < pemain.getBawahKanan().getX()) &&
              (getAtasKiri().getY() < pemain.getBawahKanan().getY() && getBawahKiri().getY() < pemain.getBawahKanan().getY()))) 
            ) {
            return true;
        }
        return false;
    }
    
        public boolean tabrakAtas(m_Tembok pemain){
        boolean tabrak = false;
        if ((((getAtasKiri().getX() < pemain.getBawahKiri().getX() && getAtasKanan().getX() < pemain.getBawahKiri().getX()) &&
              (getAtasKiri().getY() < pemain.getBawahKiri().getY() && getAtasKanan().getY() < pemain.getBawahKiri().getY())) &&
             ((getAtasKiri().getX() < pemain.getBawahKanan().getX() && getAtasKanan().getX() < pemain.getBawahKanan().getX()) &&
              (getAtasKiri().getY() < pemain.getBawahKanan().getY() && getAtasKanan().getY() < pemain.getBawahKanan().getY())))
            ) {
            return true;
        }
        return false;
    }
        
            public boolean tabrakBawah(m_Tembok pemain){
        boolean tabrak = false;
        if ((((getBawahKiri().getX() < pemain.getAtasKiri().getX() && getBawahKanan().getX() < pemain.getAtasKiri().getX()) &&
              (getBawahKiri().getY() < pemain.getAtasKiri().getY() && getBawahKanan().getY() < pemain.getAtasKiri().getY())) &&
             ((getBawahKiri().getX() < pemain.getAtasKanan().getX() && getBawahKanan().getX() < pemain.getAtasKanan().getX()) &&
              (getBawahKiri().getY() < pemain.getAtasKanan().getY() && getBawahKanan().getY() < pemain.getAtasKanan().getY())))
                ) {
            return true;
        }
        return false;
    }
        
        
    }
    
    



