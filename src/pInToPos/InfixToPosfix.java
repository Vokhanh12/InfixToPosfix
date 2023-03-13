package pInToPos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;




public class InfixToPosfix {
	
		
		static final Scanner scn = new Scanner(System.in);
		static final Stack<String> stackSignMath = new Stack<String>();
		static final Stack<String> stackPosfix = new Stack<String>();
		static final Hashtable<String,Integer> htbSignMath = new Hashtable<String,Integer>();

		static String Input="$";
		
		static final String Result="";
		
		static final String Character = "a, b, c, d, e, f, g, h, i, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z";
		static final String signMath ="$,(,+,-,*,/,^,)";
		static final String numFlowMath="0,1,2,3,4,5,6,7";
		
		static final String[] partCharacter =Character.split(", ");
		static final String[] partSignMath=signMath.split(",");
		static final String[] partNumFlowMath=numFlowMath.split(",");

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Input="$";
		System.out.print("Nhap vao:");
		Input+=scn.nextLine();
		final String[] partInput =Input.split("");

		
		
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
		
		
		
		CompareSignMath("$",htbSignMath);
		
		
	
		for(String item:partInput) {
			ReadInput(item,partSignMath,partCharacter);

		}
		

		
	/*	while(!stackPosfix.isEmpty()) {
			System.out.println(""+stackPosfix.pop());
		}
		
		while(!stackSignMath.isEmpty()) {
			System.out.println(""+stackSignMath.pop());
		}
	*/
		while(!stackSignMath.isEmpty()) {
			System.out.println(""+stackSignMath.pop());
		}
		
		
	}
	
	
	public static void ReadInput(String inputSelect,String[] partSignMath,String[] partCharacter) {
		
	
		
	/*	for(String itemCharacter:partCharacter)
		{
		
			if(inputSelect.equals(itemCharacter)) {
				
				stackPosfix.push(inputSelect);
				
			}
			
		}
		*/
		
		
		for(String itemSignMath:partSignMath) {
			
				if(!inputSelect.equals(itemSignMath)) 
				{
					
					
				}
					
				 else
				 {
					 if(!inputSelect.equals(")")) 
						{
					 		if(!inputSelect.equals("$"))
					 		stackSignMath.push(inputSelect);

						}
						else 
						{
							
							//putPostfix();
							
							while(!stackSignMath.isEmpty())
							{
								System.out.println("Pop:"+stackSignMath.pop());
							}
							
							stackSignMath.push("$");
							
							
						}

				
				 }
			
		}
		
		
		

		
		
		
		
		
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
					
					for(int i=0;i<7;i++) {
						System.out.println(array[i].getValue()+""+array[i].getKey());
					}
					
					
					
					if(check==0)
						System.out.println("this a last signMath");
		 
		
					
			}
			finally {System.out.println("Lỗi không có trong SignMath");}
			
				
			
						
		
	}
}
