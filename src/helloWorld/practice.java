package helloWorld;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Practice {

	public static void main(String[] args) {
		/**
		 * /* 1.HelloWorldを変数に代入して表示する
		 */
		helloWorld();

		/**
		 * /* 2.1から10までを足した値を計算して表示する
		 */
		sum();

		/**
		 * /* 3.3年後の今日が何曜日なのかを計算して表示する
		 */
		/* ※LocalDateTimeとDayOfWeekを使う */
		day();

		/**
		 * /* 4.引数が0なら偽。引数が1なら真と表示する
		 */
		/* TrueFalse関数は別定義 */
		trueFalse(0);/* 偽 */
		trueFalse(1);/* 真 */
		trueFalse(3);/* 0か1を入力してください */

		/**
		 * /* 5..1.String型のListを作成して表示する
		 */
		dessertList();

		/**
		 * /* 5..2.String型のMapを作成して表示する
		 */
		addressList();

		/**
		 * /* 5..3.String型のMapを作成して表示する 昇順にソートする
		 */
		numberList();

	}

	/**
	 * /* 1.HelloWorldを変数に代入して表示する
	 */
	private static void helloWorld() {
		String greeting = "Hello World";
		System.out.println(greeting);
	}

	/**
	 * /* 2.1から10までを足した値を計算して表示する
	 */
	private static void sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

	/**
	 * /* 3.3年後の今日が何曜日なのかを計算して表示する
	 */
	/* ※LocalDateTimeとDayOfWeekを使う */
	private static void day() {
		LocalDateTime day = LocalDateTime.now();
		/* 今日の曜日 */
//	day.getDayOfWeek();
		/* 3日後の曜日 */
//	day.plusDays(3).getDayOfWeek();
		/* 3年後の曜日 */
		System.out.println(day.plusYears(3).getDayOfWeek());
	}

	/**
	 * /* 4.引数が0なら偽。引数が1なら真とコンソール画面に表示する
	 */
	private static void trueFalse(int test) {
		if (test == 1) {
			System.out.println("真");
		} else if (test == 0) {
			System.out.println("偽");
		} else {
			System.out.println("0か1を入力してください");
		}
	}

	/**
	 * /* 5.String型のListを作成して表示する
	 */
	private static void dessertList() {
		List<String> list = new ArrayList<>();
		list.add("ケーキ");
		list.add("クッキー");
		list.add("マカロン");

		for (String s : list) {
			System.out.println("今日のおやつは「 " + s + " 」です");
		}
//	       for (int i = 0; i < list.size(); i++) {
//	            System.out.println(list.get(i));
//	        }
	}

	/**
	 * /* 5.String型のMapを作成して表示する
	 */
	private static void addressList() {
		Map<String, String> map = new HashMap<>();
		map.put("兵庫県", "神戸市");
		map.put("大阪府", "大阪市");
		map.put("奈良県", "奈良市");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

	/**
	 * /* 5.String型のMapを作成して表示する 昇順にソートする
	 */
	private static void numberList() {
		Map<Integer, String> map = new TreeMap<>();
		map.put(6, "six");
		map.put(1, "one");
		map.put(5, "five");
		map.put(2, "two");
		map.put(4, "four");
		map.put(3, "three");

		for (Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}

}
