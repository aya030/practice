package helloWorld;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * /* 例外処理の練習クラス
 */

public class HaveAnAbnormality {

	public static void main(String[] args) {
		/**
		 * /* 1.２つの整数値を入力して割り算するメソッド 割る数に0、入力値が整数値以外の場合に例外処理でコメントが出てくる。
		 */
		calculation();

		System.out.println();
		System.out.println("----------------------");
		System.out.println();

		/**
		 * /* 2.２つの整数値を割り算するメソッド 意図的に例外をスローして、例外処理を行う。 ArithmeticExceptionの発生
		 */
		result(3, 0);

		System.out.println();
		System.out.println("----------------------");
		System.out.println();

		/**
		 * /* 3.配列のインデックスとして存在しない要素を指定するメソッド ArrayIndexOutOfBoundsExceptionの発生
		 */
		woodwindQuintet();

		System.out.println();
		System.out.println("----------------------");
		System.out.println();

		/**
		 * /* 4.配列の値がNullのメソッド NullPointerExceptionの発生
		 */
		arrayPeople();

		System.out.println();
		System.out.println("----------------------");
		System.out.println();

		/**
		 * /* 5.Integer.parseIntメソッドを実行し文字列"五"の変換結果を変数iに代入する時の例外処理
		 */
		number();

	}

	/*-------------*/
	/* メソッド群 */
	/*-------------*/

	/**
	 * /* 1.２つの整数値を入力して割り算するメソッド 割る数に0、入力値が整数値以外の場合に例外処理されたコメントが出てくる。
	 */
	public static void calculation() {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("整数値を入力してください");
			int num1 = scanner.nextInt();
			System.out.println("整数値を入力してください");
			int num2 = scanner.nextInt();

			double result = (double) num1 / (double) num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("例外が発生しました。0以外の数字を入れてください。");
			System.out.println(e);

		} catch (InputMismatchException e) {
			System.out.println("例外が発生しました。整数値を入力してください");
			System.out.print(e);
		} finally {
			System.out.println("計算が終わりました");
		}
	}

	/**
	 * /* 2.２つの整数値を割り算するメソッド 意図的に例外をスローして、例外処理を行う。 ArithmeticExceptionの発生
	 */
	public static void result(int num1, int num2) {
		try {
			if (num2 == 0) {
				throw new ArithmeticException("0で割ったときの例外を発生させる");
			}
			int result = num1 / num2;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("例外が発生しました。");
			System.out.print(e);
		} finally {
			System.out.print("計算が終わりました");
		}
	}

	/**
	 * /* 3.配列のインデックスとして存在しない要素を指定するメソッド ArrayIndexOutOfBoundsExceptionの発生
	 */
	public static void woodwindQuintet() {
		try {
			ArrayList<String> list = new ArrayList<String>();
			list.add("clarinet");
			list.add("oboe");
			list.add("bassoon");
			list.add("Horn");
			for (int i = 0; i < 5; i++) {
				System.out.println(list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("例外が発生しました。");
			System.out.println(e);
		} finally {
			System.out.println("処理を終了しました");
		}
	}

	/**
	 * /* 4.配列の値がNullのメソッド NullPointerExceptionの発生
	 */
	public static void arrayPeople() {
		try {
			String people = null;
			System.out.println("people length is " + people.length());
		} catch (NullPointerException e) {
			System.out.println("例外が発生しました。値がNullです");
			System.out.println(e);
		} finally {
			System.out.println("処理を終了しました");
		}
	}

	/**
	 * /* 5.Integer.parseIntメソッドを実行し文字列"五"の変換結果を変数iに代入する時の例外処理
	 */
	public static void number() {
		try {
			int i = Integer.parseInt("五");
		} catch (NumberFormatException e) {
			System.out.println("例外が発生しました。数値のフォーマットに関する例外です");
			System.out.println(e);
		} finally {
			System.out.println("処理を終了しました");
		}
	}

}
