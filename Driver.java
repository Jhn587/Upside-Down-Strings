import javax.swing.JOptionPane;

public class Driver{
	public static void main(String[] args){
		System.out.println("\\u01DD");
		String toConvert = JOptionPane.showInputDialog( "Enter a String to be flipped");
		WordFlipper toTest = new WordFlipper(toConvert);
		JOptionPane.showMessageDialog(null, toTest.toString());
	
	
	}

}