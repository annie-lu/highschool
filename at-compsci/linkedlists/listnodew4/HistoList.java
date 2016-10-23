package listnodew4;

import java.util.*;

import static java.lang.System.*;

public class HistoList {
	private HistoNode front;

	public HistoList() {
		front = null;
	}

	public void addLetter(char let) {
		if (front != null) {
			HistoNode temp = front;

			while (temp.getNext() != null && temp.getLetter() != let)
				temp = temp.getNext();

			if (temp.getLetter() == let)
				temp.setLetterCount(temp.getLetterCount() + 1);
			else
				temp.setNext(new HistoNode(let, 1, null));
		} else
			front = new HistoNode(let, 1, null);
	}

	public int indexOf(char let) {
		int x = 0;
		HistoNode temp = front;
		while (front != null) {
			if (nodeAt(x).getLetter() == let)
				return x;
			temp = temp.getNext();
			x++;
		}

		return -1;
	}

	private HistoNode nodeAt(int spot) {
		HistoNode temp = front;
		int count = 0;
		while (front != null) {
			if (count == spot)
				return temp;
			else
				temp = temp.getNext();

			count++;
		}
		return null;
	}

       public String toString()
       {
           String histoList = front.getLetter() + ": " + front.getLetterCount();
           HistoNode temp = front.getNext();
           while(temp != null)
           {
        	   histoList += "\t" + temp.getLetter() + ": " + temp.getLetterCount();
               temp = temp.getNext();
           }
           return histoList;
       }
   }
