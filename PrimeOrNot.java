
// Program to print all the prime number between a and b (both are inclusive) whose sum of the digit are also prime

// for example : a = 10 and b = 20
// prime number beween 10 to 20 are [11, 13, 17, 19]
// sum of digits of prime number are

// 11 = 1 + 1 = 2  this is prime
// 13 = 1 + 3 = 4  this is not prime
// 17 = 1 + 7 = 8  this is not prime
// 19 = 1 + 9 = 10   this is not prime

//so the result is 11

// second example : a = 50 and b = 70
// prime numbers are  53 59, 61, 67

// 53 = 5 + 3 = 8 not prime number
// 59 = 5 + 9 = 14 (it is 2 digit number we need to find sum of digit) 14 = 1 + 4 = 5   prime number
// 61 = 6 + 1 = 7  prime number
// 67 = 6 + 7 = 13  (it is 2 digit number we need to find sum of digit) 13 = 1 + 3 = 4 not prime number

// so result is 59, 61

import java.util.Scanner;


// summation of digits of a number
public class PrimeOrNot {
	public static int checkBox(int  a) {
		int temp = a;
		int sum = 0;
		while(temp > 0) {
			int x  = temp % 10;
			sum += x;
			temp /= 10;

		}
		return sum;

	}

// check prime or not
	public static boolean checkPrimeOrNot(int a) {

		int i,m = 0;
		boolean flag = false;
		m = a/2;
		if(a == 0 || a == 1) {
			return false;
		}
		for(i = 2; i<= m; i++) {
			if(a % i == 0) {
				return false;
			}
		}

		if(!flag) {
			return true;
		}

		return false;
	}

// print all the prime numbers whose sum of digit are also prime
	public static void PrintPrimeNumber(int a, int b) {
		int sum = 0;
		while (a <= b) {
			boolean flag = false;

			for(int i = 2; i <= a/2; i++) {
				if(a % i == 0) {
					flag = true;
					break;
				}
			}

			if(!flag && a != 0 && a !=1) {

				sum = checkBox(a);
				while(sum > 9) {
					sum = checkBox(sum);
				}

				if(checkPrimeOrNot(sum)) {
					System.out.println(a);
				}

			}
			++a;
		}
	}
	public static void main(String[] args) {

		System.out.println("Enter ranges");
		Scanner scanner = new Scanner(System.in);
		int a  = scanner.nextInt();
		int b = scanner.nextInt();

		PrintPrimeNumber(a,b);
	}
}
