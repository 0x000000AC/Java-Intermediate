/* 
	Playing with char
*/

public class Characters
{
	public static void main(String[] args)
	{
		char ch;
		for (int code=0; code<=127; code++)
		{
			ch = (char) code; // The char cast operatr uses the ASCII table to return character associated with code's numeric value
			System.out.print(ch + " ");
		}
	} // end main
} // end Characters class