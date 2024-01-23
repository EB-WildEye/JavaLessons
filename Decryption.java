package CoreIdeas.Riddles;
public class Encryption {
    // Fields
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz"; // 26 alphabets letters
        private int keyNum; // decryption key
        private String text2cipher; // the text from the user
    
    // Constructor
        public Encryption(String text2cipher) {
            // set the text from the user to the field
            this.text2cipher = text2cipher;
            this.keyNum = 3;
        }
    
    // Methods
        public String getText2cipher() {
            // get function - usually template for getters
            return text2cipher;
        }
    
        private int getIndex(char c) {
            // gets a letter from the user text and return the index of the letter in the alphabet string
            return ALPHABET.indexOf(c);
        }
    
        private char getChar(int index) {
            // gets an index of the letter in the alphabet string and return the letter - for example for index 0 it will return a
            return ALPHABET.charAt(index);
        }
    
        private int getKey(int index) {
            // gets an index of the letter in the alphabet string and return the key - for example for index 0 it will return 3
            // % is the operator for modulo function
            return (index + this.keyNum)%26;
        }
    
        private String encrypt() {
            // encrypts the text from the user
            StringBuilder sb = new StringBuilder();  // String is immutable object, thats why we used StringBuilder class to conect all the letters in each iteration to one string
            for(int i = 0; i < text2cipher.length(); i++) {
                // special case for spaces - without change
                if(this.text2cipher.charAt(i) == ' ')    sb.append(' ');
                
                else {
                    int index = this.getIndex(this.text2cipher.charAt(i));
                    int key = this.getKey(index);
                    sb.append(this.getChar(key));
                }
            }
            return sb.toString();
        }
    
        public static void main(String[] args) {

            Encryption e = new Encryption("this is how we do it");  // change the text here
            
            System.out.println("User text : " + e.text2cipher);
            System.out.println("Encrypted text : " + e.encrypt());

            // H.W for lesson 13  -->  Creat your own Decryption class, you can use this class to help you. Good luck !
        }
    }