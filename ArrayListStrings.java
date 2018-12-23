import java.util.*;
public class ArrayListStrings {

	public static void main(String[] args) {
		
		String[] words = {"When", "Harry", "Met", "Sally", "X", "Wild", "Beast",
						  "X", "La", "Femme", "Nikita", "X", "Back", "To", "The", "Future",
						  "X"};
		
		ArrayList<String> myStrings = new ArrayList<String>();
		int k;
		ListIterator<String> p;
		
		for(k = 0; k < words.length; k++)
			myStrings.add(words[k]);
		
		for(p = myStrings.listIterator(); p.hasNext();)
			System.out.print(p.next() + " ");
		System.out.println();
		
		for(p = myStrings.listIterator(); p.hasNext();)
			if(p.next().equals("X"))
				p.set("AA");
		
		for(p = myStrings.listIterator(); p.hasNext();)
			System.out.print(p.next() + " ");
		System.out.println();
		
		for(p = myStrings.listIterator(); p.hasNext();)
			if(p.next().equals("AA"))
				p.remove();
		
		for(p = myStrings.listIterator(); p.hasNext();)
			System.out.print(p.next() + " ");
		System.out.println();
		
		while(p.hasPrevious())
			System.out.print(p.previous() + " ");
		System.out.println();
		
		myStrings.add(3, "24");
		
		for(p = myStrings.listIterator(); p.hasNext();)
			System.out.print(p.next() + " ");
		System.out.println();
		
	}
}
