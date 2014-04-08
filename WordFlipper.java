public class WordFlipper{
	private HashMap<Character,Character> toGetFlipped;
	private String flippedChars = "ɐqɔpǝɟƃɥᴉɾʞlɯuodbɹsʇnʌʍxʎz∀qƆpƎℲפHIſʞ˥WNOԀQɹS┴∩ΛMX⅄Z0ƖᄅƐㄣϛ9ㄥ86 ¿¡˙";
	private String nonFlippedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789 ?!.";
	private String toFlip;
	private String flipped;
	
	public WordFlipper(String toFlip){
		this.toFlip = toFlip;
		this.toGetFlipped = populateTheMap(this.toGetFlipped);
		StringBuilder flippedSB = flipThatString(this.toFlip);
		this.flipped = convertStringBuilderToString(flippedSB);
	}
	
	private HashMap<Character, Character> populateTheMap(HashMap<Character,Character> toFill){
		for(int i = 0; i <flippedChars.length(); i++){
			toFill.put(nonFlippedChars.getCharAt(i), flippedChars.getCharAt(i));
		
		}
	
	}
	
	private StringBuilder flipThatString(String toFlip){
		StringBuilder toReturn = new StringBuilder(toFlip.length());
		for(int i = 0; i < toFlip.length; i++){
			toReturn.append(toGetFlipped.get(toFlip.getCharAt(i)));
		}
		
		return toReturn;
	}
	
	private String converStringBuilderToString(StringBuilder toConvert){
	
	
	}
	
}