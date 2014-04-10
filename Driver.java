import javax.swing.JOptionPane;

public class Driver{
	public static void main(String[] args){
		System.out.println("\\u0447");
		String hex = "0447";
		int intValue = Integer.parseInt(hex, 16);
		
		String toConvert = JOptionPane.showInputDialog((char) intValue);
		WordFlipper toTest = new WordFlipper(toConvert);
		JOptionPane.showMessageDialog(null, toTest.toString());
	
	
	}

}