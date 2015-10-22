/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prc3_game;

import prc3_robot.*;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * @author Sergio Martín Santana <sergio.ms.91@gmail.com>
 */
public class Comp_Reposo implements iBehaviour{
    ImageIcon icon;
    
    public float moveCommand(Character pj)
    {
        /*String path = "..\\img\\1.png";  
        URL url = this.getClass().getResource(path);  
        icon = new ImageIcon(url);*/
        return pj.REC;
    }
    
    public ImageIcon get_icon ()
    {
        return icon;
    }

}
