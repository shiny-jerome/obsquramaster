package sherin;

import java.util.*;

public class ReverseNum {
	int num;
	public static void main(String args[]) {
		System.out.println("Enter the number \n");
		Scanner reverse = new Scanner(System.in);
		int num = reverse.nextInt();
		ReverseNum r = new ReverseNum(num);
	}

	public ReverseNum(int num) {
		this();
		this.num=num;
		int revnum = 0;
		while (this.num != 0) {
			int reminder = this.num % 10;
			revnum = revnum * 10 + reminder;
			this.num = this.num / 10;

		}
		System.out.println("The reverse number " + revnum);
	}

	public ReverseNum() {

		System.out.println("Finding reverse");
	}
}
