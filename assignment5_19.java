public class assignment5_19 {

	public static void main(String[] args) {
		String line = "";
		for (int a = 0; a <8; a++)
		{
			line = "";
			for(int b = 0; b < 7-a;b++)
			{
				line += "    "; 
			}
			for(int c = 0; c <= a; c++)
			{
				line += String.format("%4d",((int) Math.pow(2, c)));
			}
			for(int d = a; d >0; d--)
			{
				line += String.format("%4d",((int) Math.pow(2, d-1)));
			}
			System.out.println(line);
			
		}

	}

}
