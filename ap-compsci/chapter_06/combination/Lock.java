package combination;
import java.util.Random;
public class Lock 

{
	String firstLetter;
	String secondLetter;
	String thirdLetter;
	String unlockFirst;
	String unlockSecond;
	String unlockThird;
	Random r = new Random();

	public Lock()
	{
		firstLetter = (""+(char)(r.nextInt(26) + 'a'));
		secondLetter = (""+(char)(r.nextInt(26) + 'a'));
		thirdLetter = (""+(char)(r.nextInt(26) + 'a'));
	}
	
	public void SetLock(String first, String second, String third)
	{
		firstLetter = first;
		secondLetter = second;
		thirdLetter = third;
	}
	
	public boolean checkLock(String one, String two, String three)
	{
		unlockFirst=one;
		unlockSecond=two;
		unlockThird=three;
		
		if ((firstLetter.equals(unlockFirst))&&(secondLetter.equals(unlockSecond))&&(thirdLetter.equals(unlockThird)))
			return true;
		else
			return false;
	}
	
	
	public String getPassword()
	{
		return firstLetter+secondLetter+thirdLetter;
	}

	
}

