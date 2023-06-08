public class LengthOfLastWord {
    public static void main(String[] args) {
        String str=" I  am a Moon ";
        System.out.println(LengthOfLastWord(str));
    }
    static int LengthOfLastWord(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;

            }
            else{
                break;
            }

        }
        return count;
    }
}
