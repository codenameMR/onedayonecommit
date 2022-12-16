package gitHub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapInArrayList {
	static int a = 0;

	public static void main(String[] args) {
		List<HashMap<String, String>> hashList = new ArrayList<>();
		//ArrayList안에 HashMap 넣기, 제네릭 타입을 String타입으로 재정의
		//HashMap<key, value>
			HashMap<String, String> hash = new HashMap<>();
			hash.put("name", "kyle");
			hash.put("age", "18");
			hash.put("Gender", "man");
			
			HashMap<String, String> hash2 = new HashMap<>();
			hash2.put("name", "cindy");
			hash2.put("age", "19");
			hash2.put("Gender", "woman");
			
			hashList.add(hash);
			hashList.add(hash2);//(변수명)hashList에 HashMap값 넣기
			
			
			for(HashMap<String, String> a : hashList) {//향상된 for문으로 (변수명)hashList 값 뽑기
				System.out.println(a);
			}
			
			System.out.println(hash.get("name"));
			
			hashList.stream().forEach( a -> //stream().forEach 람다식을 이용한 (변수명)hashList 값 뽑기
				System.out.println(a)
			);
			
			List<Boolean> arrList = new ArrayList<>();
			arrList.add(true);
			arrList.add(1==2);
			arrList.add("a".equals("a"));
			arrList.forEach(i -> {
			if(i.equals(true)) {
				a = a + 1;
			}
			});
			System.out.println("true 개수 : " + a);

	}

}

//			<<<console>>>
//			{name=kyle, Gender=man, age=18}
//			{name=cindy, Gender=woman, age=19}
//			kyle
//			{name=kyle, Gender=man, age=18}
//			{name=cindy, Gender=woman, age=19}
//			true 개수 : 2
