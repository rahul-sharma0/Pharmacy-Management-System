/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.io.File;
import dao.PHARMACY_UTILS;
import javax.swing.JOptionPane;
/**
 *
 * @author Acer
 */
public class openPdf {
    
    public static void openBYid(String id)
    {
        try {
            if((new File(PHARMACY_UTILS.BillPath+id+""+".pdf")).exists())
            {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler   "+PHARMACY_UTILS.BillPath+""+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File does not exists.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
