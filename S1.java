class S1 
{
	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="world";
		String m=s1.concat(s2);

		System.out.println(m);
		String s="";
		
		for(int i=0;i<m.length();i++)
		{
			char c=m.charAt(i);
			if(s.contains(c+"")){
				continue;
			}
			else
				s=s+c;
		}
		System.out.println(s);
	}
}
