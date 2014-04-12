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
g
h
	"044
i
j
l
m
	"019c" Ɯ
	w
n
	u
o
p
	d
q
	b
r
s
t
u
	n
v
w
	m
x
y
z
A
B
C
	"0186" Ɔ
D
E
	"018E" Ǝ
F
G
H
	H
I
	
J
K
L
M
	W
N
	"1D3B"ᴻ
O
	O
P
Q
R
S
	"01A7" Ƨ
T
U
V
	"0245"Ʌ
W
	M
X
Y
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