import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;


public class Postnet {
	
	public static void main(String[] args) throws FileNotFoundException, NumberFormatException {
		// allows file to be chosen from window
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File fileObj = chooser.getSelectedFile();
		

		Scanner in = new Scanner(fileObj);
		String name,street,city,state,zip ;
		
	
		while (in.hasNextLine()) {
			String line = in.nextLine();
				while(!line.equals("")) {
					String[] fields = line.split(",");
					 name = fields[0];
					 street = fields[1];
					 city = fields[2];
					 state = fields[3];
					 zip = fields[4];
					 
					 System.out.println(name);
					 System.out.println(street);
					 System.out.println(city+" "+state+" "+ zip);
					 System.out.println(getBarCode(zip));
					
					 break;
				}
			
		}
		in.close();
		
		
	    }
	
	public static String getBarCode(String input) {
		// take away "-" from input
		int checksum;
		int sum = 0;
	
		
		int dash = 5;
		String dashlessInput = input.substring(0,dash)+input.substring(6,10);
		
				 
		System.out.println(dashlessInput);
		String chars ="0123456789";
				String[] barcodes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
				
				 String bar = "|";
			        for(int i = 0; i < dashlessInput.length( ); i++) {
			            char c = dashlessInput.charAt(i);
			            int index = chars.indexOf(c);
			            sum += index;
			            
			            String code = barcodes[index];
			            bar += code;
			        }
			        checksum = (10-sum%10)%10;
			        
			        return bar+barcodes[checksum]+"|";
			        
			        
			        

	}

	

}
