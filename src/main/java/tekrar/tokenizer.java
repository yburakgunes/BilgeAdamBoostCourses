package tekrar;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class tokenizer {
	public static void main(String[] args) {
		List<String> tokens = new ArrayList<>();
		String str = "Naber canım nasıl gidiyor acaba?";
		
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		
//		while (tokenizer.hasMoreElements()) {
//			System.out.println(tokenizer.nextElement());
//		}
		
		while (tokenizer.hasMoreElements()) {
			tokens.add(tokenizer.nextToken());
		}
		tokens.stream().filter(i -> i.contains("canım")).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
	}
	
}
