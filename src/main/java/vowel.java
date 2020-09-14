
/**
 * @author Boyu Yuan
 * @date 2020/9/14 12:15
 */
public class vowel {


    public static boolean isVowelMoreThanThirtyPercent(String string){
        int count =0;
        for(int i = 0; i < string.length(); i++){
           char ch = string.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
               count++;
           }
       }
        double percent = (double)count/string.length();
       if (percent > 0.3){
           return true;
       }else {
           return false;
       }
    }

    public static String insertMommy(String string) {
        if (isVowelMoreThanThirtyPercent(string)) {
            StringBuffer stringBuffer = new StringBuffer(string);
            for (int i = string.length()-1; i >= 0; i--) {
                char ch = string.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    stringBuffer.insert(i+1, "mommy");
                }
            }
            return stringBuffer.toString();
        } else {
            return "";
        }
    }
}
