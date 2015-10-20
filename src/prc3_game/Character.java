/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prc3_game;

import java.net.URL;
import javax.swing.ImageIcon;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Character {
    
    ImageIcon icon = new ImageIcon ();
    int HP;
    int ATA;
    int DEF;
    int REC;
    iBehaviour com ;

    public Character ()
    {
    
    String path = "..\\img_ava\\Buu.png";
    URL url  = this.getClass().getResource(path);
    ImageIcon icono = new ImageIcon(url);
    this.icon = icono;
        
    this.HP = 100;
    this.ATA = 100;
    this.DEF = 100;
    this.REC = 100;
    }
    
    public void set_Character(String name, int HPt, int ATAt, int DEFt, int RECt) {
        
    String path = "..\\img_ava\\"+name+".png";
    URL url  = this.getClass().getResource(path);
    ImageIcon icono = new ImageIcon(url);
    this.icon = icono;
        
    this.HP = HPt;
    this.ATA = ATAt;
    this.DEF = DEFt;
    this.REC = RECt;
    }

    public ImageIcon getIcon() {
        return icon;
    }

    public int getHP() {
        return HP;
    }

    public int getATA() {
        return ATA;
    }

    public int getDEF() {
        return DEF;
    }

    public int getREC() {
        return REC;
    }

    public iBehaviour getCom() {
        return com;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setATA(int ATA) {
        this.ATA = ATA;
    }

    public void setDEF(int DEF) {
        this.DEF = DEF;
    }

    public void setREC(int REC) {
        this.REC = REC;
    }

    public void setCom(iBehaviour com) {
        this.com = com;
    }
    
    
    

}
