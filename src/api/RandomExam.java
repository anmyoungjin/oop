package api;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		
		System.out.println(System.currentTimeMillis());
		//10-20
		for(int i = 0; i < 100; i++)
			System.out.println(random.nextInt(11)+10);
		
		
		System.out.println(Math.abs(random.nextInt(11)));
		System.out.println(Math.abs(random.nextInt()));
		
	}

}
