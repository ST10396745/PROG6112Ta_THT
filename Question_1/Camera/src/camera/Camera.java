/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camera;

/**
 *
 * @author William Stainton
 */
public class Camera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //This is where the variables a initialize;
        double [] mirrorless = {10500, 9500, 12000};
        double [] DSLR = {8500, 7200, 8000};
        double canon = mirrorless[0] - DSLR[0];
        double sony = mirrorless[1] - DSLR[1];
        double nikon = mirrorless[2] - DSLR[2];
        double max;
        String maxWord;
        
        System.out.println("-------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY REPORT");
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\tMirrorless\tDRLR");
        System.out.println("CANON\t\tR " + mirrorless[0] + "\tR " + DSLR[0]);
        System.out.println("SONY\t\tR " + mirrorless[1] + "\tR " + DSLR[1]);
        System.out.println("NIKON\t\tR " + mirrorless[2] + "\tR " + DSLR[2]);
        System.out.println("-------------------------------------------------------------");
        System.out.println("CAMERA TECHNOLOGY RESULTS");
        System.out.println("-------------------------------------------------------------");
        
        //This is to check if the cost diffence is bigger than 2500 and if so it must put the three sars at the end
        if (canon >= 2500) {
            System.out.println("CANON\tR " + canon + " ***");
        }else if (canon < 2500) {
            System.out.println("CANON\tR " + canon);
        }
        
        if (sony >= 2500) {
            System.out.println("SONY\tR " + sony + " ***");
        }else if (canon < 2500) {
            System.out.println("SONY\tR " + sony);
        }
        
        if (nikon >= 2500) {
            System.out.println("NIKON\tR " + nikon + " ***");
        }else if (canon < 2500) {
            System.out.println("NIKON\tR " + nikon);
        }
        
        //This is to check which brand has the most cost diffeernce.
        max = canon;
        maxWord = "CANON";
        
        if (max < sony) {
            max = sony;
            maxWord = "SONY";
        }
        
        if (max < nikon) {
            max = nikon;
            maxWord = "NIKON";
        }
        
        System.out.println("CAMERA WITH THE MOST COST DIFFERENCE: " + maxWord);
        System.out.println("-------------------------------------------------------------");
    }
    
}
