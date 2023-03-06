class Rita {
	public static void main (String[] args) {
		int i=1;
		int j=40;
		char ch='A';
		char ch1='Z';
		int k=1;
		int l=2;

System.out.println("numbers from 1 to 50");
		while(i<51)
		{
		System.out.println(i);
		i++;
		} 

System.out.println("numbers from 40 to 20");
		while(j>19)
		{
		System.out.println(j);
		j--;
		}

System.out.println("odd numbers from 1 to 100");
		while (k<=100)
		{
		System.out.println(k);
		k=k+2;
		}

System.out.println("even numbers from 1 to 100");
		while(l<=100)
		{
		System.out.println(l);
		l=l+2;
		}

System.out.println("alphabets from A to Z");
		while ( ch<='Z')
		{
		System.out.println(ch++);
		}

System.out.println("alphabets from Z to A");
		while	(ch1>='A')
		{
		System.out.println(ch1);
		ch1--;
		}

	}
}