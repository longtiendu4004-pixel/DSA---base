package day4;
import java.util.*;
public class groupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> part = new HashMap<>();
		for(String str : strs) {
			char[] data = str.toCharArray();
			int[] standard = new int[26];
			for(int i = 0; i < data.length; i++) {
				standard[data[i] - 'a']++;
			}
			String key = (Arrays.toString(standard));
			part.putIfAbsent(key, new ArrayList<String>());
			part.get(key).add(str);
			
		}
        return new ArrayList<List<String>>(part.values());
    }
	public static void main(String args[]) {
		String[] s = {"act","pots","tops","cat","stop","hat"};
		List<List<String>> results = groupAnagrams(s);
		System.out.print(results);
	}
}
