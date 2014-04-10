import java.util.HashMap;

public class WordFlipper{
	private HashMap<Character,Character> toGetFlipped;
	private String flippedChars = " q?p ??????l?uodb?s?n? x?z?q?p???HI???WNO?Q?S-n?MX9860¿¡";
	private String nonFlippedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890?!. ";
	private String toFlip;
	upsidedown = "?q?p???????l?uodb?s?n??x?z?q?p???HI???WNO?Q?S-n?MX?Z0?????9?86 ¿¡?";

	private String flipped;
	
	public WordFlipper(String toFlip){
		this.toFlip = toFlip.toLowerCase();
		//this.toGetFlipped = populateTheMap(this.toGetFlipped);
		//StringBuilder flippedSB = flipThatString(this.toFlip);
		//this.flipped = convertStringBuilderToString(flippedSB);
	}
	
	private HashMap<Character, Character> populateTheMap(HashMap<Character,Character> toFill){
		toFill = new HashMap<>();
		
		for(int i = 0; i <flippedChars.length(); i++){
			toFill.put(nonFlippedChars.charAt(i), flippedChars.charAt(i));
		
		}
		return toFill;
	}
	
	private StringBuilder flipThatString(String toFlip){
		StringBuilder toReturn = new StringBuilder(toFlip.length());
		for(int i = 0; i < toFlip.length(); i++){
			toReturn.append(toGetFlipped.get(toFlip.charAt(i)));
		}
		
		return toReturn;
	}
	
	private String convertStringBuilderToString(StringBuilder toConvert){
		return toConvert.toString();
	
	}
	
	public String toString(){
		//return this.flipped;
		return this.upsidedown.toString();
	}
	
}

// q+öp +ƒ¦â+Ñß¦ë++-Pl+»uodb+¦s-çn-î-?