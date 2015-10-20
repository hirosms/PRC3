/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prc3;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DefensiveBehaivour implements iBehaviour{
    ImageIcon icon;
    
    public void moveCommand()
    {
        String path = "..\\img\\2.png";  
        URL url = this.getClass().getResource(path);  
        icon = new ImageIcon(url);  
    }
    
    public ImageIcon get_icon ()
    {
        return icon;
    }

}
