import java.util.Scanner;
class Count_Freq{
    static final int ch=256;
    static void Counting_Char(String s){
        int n=s.length();
        int charr[]=new int[ch];
        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                charr[s.charAt(i)-'a']++;
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                charr[s.charAt(i)-'A']++;
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                charr[s.charAt(i)-48]++;
            }
            else if(s.charAt(i)>='\t' && s.charAt(i)<='/'){
                charr[s.charAt(i)-'\t']++;
            }
        }

        for(int i=0;i<n;i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                if(charr[s.charAt(i)-'a']!=0){
                    System.out.print(s.charAt(i)+":");
                    System.out.print(charr[s.charAt(i)-'a']+" ");
                    charr[s.charAt(i)-'a']=0;
                }
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                if(charr[s.charAt(i)-'A']!=0){
                    System.out.print(s.charAt(i)+":");
                    System.out.print(charr[s.charAt(i)-'A']+" ");
                    charr[s.charAt(i)-'A']=0;
                }
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                if(charr[s.charAt(i)-48]!=0){
                    System.out.print(s.charAt(i)+":");
                    System.out.print(charr[s.charAt(i)-48]+" ");
                    charr[s.charAt(i)-48]=0;
                }
            }
            else if(s.charAt(i)>='\t' && s.charAt(i)<='/'){
                if(charr[s.charAt(i)-'\t']!=0){
                    System.out.print(s.charAt(i)+":");
                    System.out.print(charr[s.charAt(i)-'\t']+" ");
                    charr[s.charAt(i)-'\t']=0;
                }
            }
        }

    }
}

public class Frequency {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Count_Freq obj=new Count_Freq();
        obj.Counting_Char(s);
    }
}
