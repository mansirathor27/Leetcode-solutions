package Arrays;
public class Anagram{
    public static void main(String[] args) {
        String s = "jam";
        String t = "jar";
        if(s.length()!=t.length()){
            System.out.println("False");
            return;
        }
        int[] count = new int[26];
        for(int i =0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int c: count){
            if(c!=0){
                System.out.println("False");
                return;
            }

        }
        System.out.println("True");

    }
}