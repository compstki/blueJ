
class CONTACTS
{
    void main() {
        
   // data structure

    String[] postcode = { "BS4_1SY", "HD9_7NP", "TS22_5HA", "B30_3EG", "SS8_7NG", "TQ13_9PY", "IP24_2TY", "PE20_3AD",
        "ME10_3QE", "KY8_5FL", "SL8_5NB", "NN17_1SZ", "DY1_1LT", "LA14_4DS", "ST4_4DL", "BH17_9HL", "NE23_7LF",
        "EX7_0BY", "CM17_0GH", "PO11_0AG", "SW2_2QR", "N14_4HU", "CH7_6AE", "CF46_6ST", "PE1_1XL", "RH11_9DB",
        "RG14_2JG", "M15_4DN", "M45_8GH", "BS16_4QX" };

    String[] mobile = { "07507-304671", "07574-522632", "07451-596374", "07715-346302", "07538-254623", "07395-367314",
        "07435-139456", "07600-278531", "07911-037574", "07419-877121", "07872-075511", "07777-343856", "07903-791470",
        "07590-011396", "07666-213580", "07499-712468", "07873-758202", "07465-206886", "07758-023034", "07659-527498",
        "07710-757829", "07526-176025", "07910-227286", "07644-504638", "07840-773947", "07479-935404", "07963-605366",
        "07427-618981", "07746-842316", "07818-193588" };

    String[] name = { "Edmonds", "Sandoval", "Mullen", "Bennett", "Warren", "Castillo", "Baker", "Butt", "Hubbard",
        "Wallace", "Cooke", "Winters", "Lynch", "Bowler", "Holden", "Broughton", "Camacho", "Wolf", "Williamson",
        "Juarez", "Brennan", "Finnegan", "Gilbert", "Metcalfe", "Irving", "Myers", "Wilkinson", "Garrison", "Bridges",
        "Blaese" };
        
    //PRI code
    System.out.print("BD51 SMR".length() + ": ");
    System.out.print("BD51 SMR".substring(0,2) + "-");
    System.out.println("BD51 SMR".substring(5,"BD51 SMR".length() ));
    
        
    //MM code
    for (int i = 0; i < postcode.length; i++) {

      // name
      System.out.print(name[i] + "\t\t");

      // 1st part of postcode
      
      // reformatted phone number
       
              
      // take a new line
      System.out.print("\n");

    }

    }

}
