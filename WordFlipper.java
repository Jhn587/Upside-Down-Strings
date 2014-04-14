import java.util.HashMap;

public class WordFlipper{
	private HashMap<Character,Character> toGetFlipped;
	private String flippedChars = " qɔp ɟƃɥᴉɾʞlɯuodbɹsʇnʌ xʎz∀qƆpƎℲפHIſʞ˥WNOԀQɹS┴∩ΛMX⅄ZƖᄅ ㄣϛ9ㄥ860¿¡˙ ";
	private String nonFlippedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890?!. ";
	private String toFlip;
	private String flipped;
	
	public WordFlipper(String toFlip){
		//this.toFlip = toFlip.toLowerCase();
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
		return this.flippedChars;
	}
	
}

// q╔öp ╔ƒ╞â╔Ñß┤ë╔╛╩₧l╔»uodb╔╣s╩çn╩î╩?

/*
a
	"0250" ɐ
b
	q
c	
	"037B" ͻ
d
	p

e
	String hex = "0447";
	int intValue = Integer.parseInt(hex, 16);

f
	"0248" Ɉ
g
	"1d77" ᵷ
h
	"0265" ɥ
i
	"1d09" ᴉ
j
	"027f" ɿ
k
	"029e" ʞ
l
	"01aa" ƪ
m
	"026f" ɯ
	w
n
	u
o
	"0366" ͦ
p
	d
q
	b
r	
	"0279" ɹ
s	
	"01a8" ƨ
t
	"0287" ʇ
u
	n
v
	"028c" ʌ
w
	"028d"  ʍ
x
	"036f" ͯ
y 
	"028e" ʎ
z
A
	"2c6f" Ɐ
B
C
	"0186" Ɔ
D
E
	"018E" Ǝ
F
	"214e" ⅎ
G
	"0494" Ҕ
H
	H
I
	I
J
	"05c6" ׆
K
	K
L
	"0393" Γ
M
	W
N
	"1D3B"ᴻ
O
	O
P
	"042c" Ь
Q
R
	"1d1a" ᴚ
S
	"01A7" Ƨ
T
U 
	"05de" מ
V
	"0245"Ʌ
W
	M
X 
	X
Y
	"05d2" ׆ג 
Z
0
	0
1
2
3	
	"01B8" Ƹ
4
5
6
	9
7
8
	8
9
	6
 
?
!
.




*/