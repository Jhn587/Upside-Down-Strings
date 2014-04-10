import java.util.HashMap;

public class WordFlipper{
	private HashMap<Character,Character> toGetFlipped;
	private String flippedChars = " qɔp ɟƃɥᴉɾʞlɯuodbɹsʇnʌ xʎz∀qƆpƎℲפHIſʞ˥WNOԀQɹS┴∩ΛMX⅄ZƖᄅ ㄣϛ9ㄥ860¿¡˙ ";
	private String nonFlippedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890?!. ";
	private String toFlip;
	private String flipped;
	
	public WordFlipper(String toFlip){
		this.toFlip = toFlip.toLowerCase();
		this.toGetFlipped = populateTheMap(this.toGetFlipped);
		StringBuilder flippedSB = flipThatString(this.toFlip);
		this.flipped = convertStringBuilderToString(flippedSB);
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
		return this.flipped;
	}
	
}

// q╔öp ╔ƒ╞â╔Ñß┤ë╔╛╩₧l╔»uodb╔╣s╩çn╩î╩?