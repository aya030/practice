package helloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("HelloWorld!");

//		for (int i = 1; i <= 10; i++) {
//			System.out.println("HelloWorld!" + i);
//		}
		
		for (int i = 1; i <= 20; i++) {
			if(i <= 10) {
				System.out.println("HelloWorld!" + i);
			}else {
				System.out.println("Hello" + i);
			}
		}
		
	}

}
