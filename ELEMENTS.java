class Main {
    public static void main(String[] args) {
        // data structure

        // Elements which use a single letter of the alphabet, N/A no element for this letter
        
        String[] element = {"N/A", "Boron", "Carbon", "N/A", "N/A", "Fluorine", "N/A", "Hydrogen",
                "Iodine", "N/A", "Potassium", "N/A", "N/A", "Nitrogen", "Oxygen", 
                "Phophorus", "N/A", "N/A", "Sulfur", "N/A", "Uranium", "Vanadium", 
                "Tungsten", "N/A", "Yttrium", "N/A"};                 

                
        // Information: comparing string values                
                
        String textA = "ABC";
        String textB = new String("ABC");
        
        // incorrect way to compare strings
        if (textA == textB) {
            System.out.println(System.identityHashCode(textA) + " is same String as " + System.identityHashCode(textB));
        }
        else{
            System.out.println(System.identityHashCode(textA) + " is not same String as " + System.identityHashCode(textB));
        }

        // correct way to compare strings
        if (textA.equals(textB)) {
            System.out.println(textA + " is same value as " + textB);
        }
        else {
            System.out.println(textA + " is not same value as " + textB);
        }

        
        // display symbol AND element name for elements which use a single letter of the alphabet
        for (int i=0; i<element.length; i++) {

                System.out.print(element[i] + "\n");
    
        }
    }
}
