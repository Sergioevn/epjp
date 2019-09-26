package esercizio2609;

import java.util.ArrayList;
import java.util.HashMap;

public class Stat {
	private char mostPopular;
	private int mostPopularHowMany;
	private int howMany;

	public Stat() {
	}

	public void getStat(String s) {
		
		int maxFrequency = 0;
		char maxCharacter = '\0';
		
		HashMap<Character, Integer> hashmap =new HashMap<Character, Integer>();
		for(int i=0; i<s.length();i++) {
			char charTemp = s.charAt(i);
			if(!hashmap.containsKey(charTemp)) {
				hashmap.put(s.charAt(i), 1);
			}
			else {
				hashmap.put(s.charAt(i), hashmap.get(charTemp)+1);
				if (maxFrequency<hashmap.get(charTemp)) {
					maxFrequency = hashmap.get(charTemp);
					maxCharacter = s.charAt(i); 
				}
			}
		}
		
		this.mostPopular = maxCharacter;
		this.mostPopularHowMany = maxFrequency;
		this.howMany = hashmap.keySet().size();
	}
	
	@Override
	public String toString() {
		
		return "\nmostPopular: " + String.valueOf(this.mostPopular) + "\ncounter: " + String.valueOf(this.mostPopularHowMany) + "\nHowManySingle: " + String.valueOf(this.howMany);
		
	}
}
