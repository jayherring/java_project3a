
public class Barcode {

	/**
	 * @param args
	 */
	public static String makeBar(String input) {
		// take away "-" from input
		int dash = 5;
		String dashlessInput = input.substring(0,dash)+input.substring(dash,9);
		String chars ="0123456789";
				String[] barcodes = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::",};
				
				 String bar = "";
			        for(int i = 0; i < input.length( ); i++) {
			            char c = input.charAt(i);
			            int index = chars.indexOf(c);
			            String code = barcodes[index];
			            bar += code + " ";
			        }
			        return bar;

	}

}
