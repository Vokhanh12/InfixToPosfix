package pInToPos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;



public class InfixToPosfix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//"$" < "(" < "+" = "-" < "*" = "/" < "^"
		
		Scanner scn = new Scanner(System.in);
		Stack<String> stack = new Stack<String>();
		Hashtable<String,Integer> htbSignMath = new Hashtable<String,Integer>();

		String Input = scn.nextLine();
		
		String Result="";
		
		String Character = "a, b, c, d, e, f, g, h, i, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
		String signMath ="$,(,+,-,*,/,^";
		String numFlowMath="0,1,2,3,4,5,6";
		
		String[] partCharacter =Character.split(", ");
		String[] partSignMath=signMath.split(",");
		String[] partNumFlowMath=numFlowMath.split(",");
		String[] partInput =Input.split("");
		
		//Send item in hashtable 
		for(int i=0;i<partSignMath.length;i++) {
			htbSignMath.put(partSignMath[i],i);
		}
		
		


		
		for(int i = partInput.length-1 ; i>=0 ; i--) {
			
			for(int j=partSignMath.length-1 ; j>=0 ; j-- ) {
				
				if(partInput[i]==partSignMath[j])
				{
					
				}
				
				if(partInput[i]==partSignMath[j]) {
					//stack.push(partInput[i]);
				}
					
			}
			
			
		}
		
		
		
		
		
		CompareSignMath("3",htbSignMath);
		
		
		System.out.println("Input_infix:");
		String input = scn.nextLine();
		
	}
	
	
	public static void CompareSignMath(String selectSignMath,Hashtable<String,Integer> htb) {
		
		try {

			int valueInput = htb.get(selectSignMath);
			int check=0;
			
			Map.Entry<String,Integer>[] array = htb.entrySet().toArray(new Map.Entry[0]);
			
			//"$" < "(" < "+" = "-" < "*" = "/" < "^"
			//0,1,2,3,4,5,6
			// Duyệt qua các phần tử trong Hashtable bằng Iterator
					for(int i=0;i<array.length;i++) {
						if(htb.get(selectSignMath)>array[i].getValue() || htb.get(selectSignMath)==array[i].getValue() ) {
							check=0;
						}
						else {
							System.out.println(""+htb.get(selectSignMath)+"<"+array[i].getValue());
							check=1;
			
								}
					}
						
					System.out.println("Check="+check);
					
					for(int i =0;i<7;i++) {
						System.out.println(array[i].getValue()+""+array[i].getKey());
					}
		
		 
		
					
			}
			finally {System.out.println("Lỗi không có trong SignMath");}
						
		
	}
}
