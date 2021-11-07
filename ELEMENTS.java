
class ELEMENTS
{
    void main() {
        // data structure

        String[] element = {"N/A", "Boron", "Carbon", "N/A", "N/A", "Fluorine", "N/A", "Hydrogen",
                "Iodine", "N/A", "Potassium", "N/A", "N/A", "Nitrogen", "Oxygen", 
                "Phophorus", "N/A", "N/A", "Sulfur", "N/A", "Uranium", "Vanadium", 
                "Tungsten", "N/A", "Yttrium", "N/A"};                 

        for (int i=0; i<element.length; i++) {

            if(!(element[i].equals("N/A"))) {
                System.out.print(element[i].charAt(0) + " is for " + element[i] + "\n");
            }

        }

    }

}
