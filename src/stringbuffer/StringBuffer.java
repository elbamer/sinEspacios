
package stringbuffer;

public class StringBuffer {

    public static String sinBlanco(String blanco){
        StringBuilder sinBlanco = new StringBuilder();
        for(int i=0; i<blanco.length(); i++){
            if(blanco.charAt(i)!=' '){
                 sinBlanco.append(blanco.charAt(i));
            }
        }
        return sinBlanco.toString();
    }
    
    
    
    public static     void main(String[] args) {
        String frase="Mi primer programa sin blanco";
        String sinBlanc=sinBlanco(frase);
        System.out.println(sinBlanc);
    } 
}
