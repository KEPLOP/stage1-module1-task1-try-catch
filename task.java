public class ParseIntegers { 
  public static void main(String[] args) {
    int sum = 0; 
    String str = "When a humble bard, graced right along, with Geralt of Rivia along came this song123"; 
    String[] WORDS = str.split(" "); 
    for (String word : WORDS) { 
      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i); 
        if (Character.isDigit(ch)) 
        { int digit = Character.getNumericValue(ch); sum += digit; 
        } 
      } 
    } 
    System.out.println("Сумма цифр в строке " + "'" + str + "'" + " равна " + sum); 
  } 
}