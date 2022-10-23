public class Count_Vowel
{
    int count(String s){
        int count=0;
        for (int i=0;i<s.length();i++){
            String str ="aeiouAEIOU";
            if (str.indexOf(s.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
    public static void main(String ... args){
        String s= "Hello World Welcome To Program ";
        int istr=0,word=0;
        Count_Vowel c1=new Count_Vowel();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' '){
                int Vcount=c1.count(s.substring(istr, i+1));
                System.out.println("Vowel in word "+(++word)+" is "+Vcount);
                istr=i;
            }
        }
    }
}
