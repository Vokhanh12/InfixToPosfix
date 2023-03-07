package pInToPos;

import java.util.Scanner;
import java.util.Stack;

public class InfixToPosfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"$" < "(" < "+" = "-" < "*" = "/" < "^"
		
		Scanner scn = new Scanner(System.in);
		
		String Input = scn.nextLine();
		
		String Character = "a, b, c, d, e, f, g, h, i, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
		String signMath ="$,(,+,-,*,/,^";
		String numFlowMath="0,1,2,3,4,5,6";
		
		String[] partCharacter =Character.split(", ");
		String[] partsignMath=signMath.split(",");
		String[] partnumFlowMath=numFlowMath.split(",");
		String[] partInput =Input.split("");

		
		for(int i = partInput.length;i>=0;i--) {
			System.out.println(i);
		}
		
		
		Stack<String> stack = new Stack<String>();
		
		
		
		
		
		System.out.println("Input_infix:");
		String input = scn.nextLine();
		
	}

}
