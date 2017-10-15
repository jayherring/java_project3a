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
					 break;
				}
			
		}
		in.close();
		
		
	    }

	

}
