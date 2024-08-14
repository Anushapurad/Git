package New;

import org.testng.annotations.Test;

public class Code {
	@Test
	public void reverse()
	{
		String s="My name";
		String[] rev=s.split("");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(rev);
		}
	}

}
