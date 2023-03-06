package StringPrograms;
class Str1
{
    public static void main(String[] args)
     {
        String s="abcdefgh";
        String res="";
        for(int i=0,k=s.length()-1;i<s.length()/2;i++,k--)
        {
            res=res+s.charAt(i)+s.charAt(k);
        }
        System.out.println(res);
        
    }
}