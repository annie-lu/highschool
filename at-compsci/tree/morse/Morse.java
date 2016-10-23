package morse;

public class Morse implements Comparable{
	
	private String morse;
	private String letter;
	private Morse left;
	private Morse right;
	private int index;

	public Morse(String s){
		new Morse(s,0);
	}
	public Morse(String s, int index)
	{
		letter = s;
		this.index = index;
	}
	
	public void setLeft(Morse left)
	{
		this.left = left;
	}
	public void setRight(Morse right)
	{
		this.right = right;
	}
	public void setLetter(String l)
	{
		letter = l;
	}
	
	public String getMorse()
	{
		return morse;
	}
	
	public Comparable getValue()
	{
		return letter;
	}
	public int getIndex()
	{
		return index;
	}
	
	public Morse getLeft()
	{
		return left;
	}
	public Morse getRight()
	{
		return right;
	}

	@Override
	public int compareTo(Object arg0) {
		Morse other = (Morse)arg0;
		if (index > other.getIndex())
			return 1;
		else if (index < other.getIndex())
			return -1;
		else 
			return 0;
	}
	
	public String toString()
	{
		return letter;
	}

}