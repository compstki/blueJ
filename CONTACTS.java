
class CONTACTS
{
    void main() {
        // data structure

        String[] postcode = {"BS4 1SY", "HD9 7NP", "TS22 5HA", "B30 3EG", "SS8 7NG", "TQ13 9PY", "IP24 2TY", 
                "PE20 3AD", "ME10 3QE", "KY8 5FL", "SL8 5NB", "NN17 1SZ", "DY1 1LT", "LA14 4DS", 
                "ST4 4DL", "BH17 9HL", "NE23 7LF", "EX7 0BY", "CM17 0GH", "PO11 0AG", "SW2 2QR", 
                "N14 4HU", "CH7 6AE", "CF46 6ST", "PE1 1XL", "RH11 9DB", "RG14 2JG", "M15 4DN", 
                "M45 8GH", "BS16 4QX"};

        String[] mobile = {"07507-304671", "07574-522632", "07451-596374", "07715-346302", "07538-254623", 
                "07395-367314", "07435-139456", "07600-278531", "07911-037574", "07419-877121", 
                "07872-075511", "07777-343856", "07903-791470", "07590-011396", "07666-213580", 
                "07499-712468", "07873-758202", "07465-206886", "07758-023034", "07659-527498", 
                "07710-757829", "07526-176025", "07910-227286", "07644-504638", "07840-773947", 
                "07479-935404", "07963-605366", "07427-618981", "07746-842316", "07818-193588"};

        String[] name = {"Edmonds", "Sandoval", "Mullen", "Bennett", "Warren", "Castillo", "Baker", "Butt", 
                "Hubbard", "Wallace", "Cooke", "Winters", "Lynch", "Bowler", "Holden", "Broughton", 
                "Camacho", "Wolf", "Williamson", "Juarez", "Brennan", "Finnegan", "Gilbert", "Metcalfe", 
                "Irving", "Myers", "Wilkinson", "Garrison", "Bridges", "Blaese"};                   

        for (int i=0; i<postcode.length; i++) {

            if (postcode[i].length() == 7) {
                System.out.print(name[i] + "\t\t");
                System.out.print(postcode[i].substring(0, postcode[i].length()-4) + "\t\t");
                System.out.print(mobile[i].substring(1,5) + mobile[i].substring(6,12) + "\n");
            }

        }

    }

}
