
class CYPHER
{
    void main() {
        // data structure

        String message = "HELLOWORLD";
        char letter;
        int ascii;
        int ROT = 3;

        for (int i=0; i<message.length(); i++) {
            ascii = message.charAt(i);
            System.out.println(message.charAt(i) + " " + ascii + " " + (char)(message.charAt(i) + ROT));
            
        }

    }

}
