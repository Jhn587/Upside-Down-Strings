

public class Driver{
	public static void main(String[] args){
		String toConvert = JOptionPane.showInputDialog("Enter a String to be flipped");
		WordFlipper toTest = new WordFlipper(toConvert);
		JOptionPane.showMessageDialog(toTest.toString());
	
	
	}

}