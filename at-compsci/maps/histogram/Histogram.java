package histogram;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Histogram
{
	private Map<String,Integer> histogram;

	public Histogram()
	{
		histogram = new TreeMap<String,Integer>();
	}

	public Histogram(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		String[] list = sent.split(" ");
		for(String x:list){
			if(!histogram.containsKey(x)){
				histogram.put(x, 0);
			}
			else{
				histogram.replace(x, histogram.get(x)+1);
			}
		}
		
	}
	
	public void setSentence(String sent)
	{
		histogram = new TreeMap<String,Integer>();
		String[] list = sent.split(" ");
		for(String x:list){
			if(!histogram.containsKey(x)){
				histogram.put(x, 0);
			}
			else{
				histogram.replace(x, histogram.get(x)+1);
			}
		}
	}

	public String toString()
	{
		String output="";
		String allStars="";
		Iterator<String> a=histogram.keySet().iterator();
		while(a.hasNext()){
			String character=a.next();
			output+=character+"\t";
			int num=0;
			int lim=histogram.get(character);
			while(num<=lim){
				output+="*";
				num++;
			}
			output+="\n";
		}
		return output;
	}
}