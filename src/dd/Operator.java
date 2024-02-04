package dd;

public class Operator {

	public static void main(String[] args) {
		int a = 7;
		int b = 8;
		
		System.out.println("a=> " + a); 
		
		a++;
		System.out.println("a=> " + a);
		
		++a;
		System.out.println("a => " + a);
		
		
		a++; b++;
		System.out.println(a+b);
		
		
		int x = 10,  y = 11;
		int z = ++x;  // x = x+1
		System.out.println("z=> " + z );
		System.out.println("x=> " + x);
		
		z = y++; // y = y+1
		System.out.println("z => " + z);
		System.out.println("y => " + x);
		
		z = y--;
		System.out.println("z => " + z);
		System.out.println("y => " + x);
		
		
		
		 boolean bool = false;
		   System.out.println("bool=>" + bool); // bool => false
		   System.out.println("!bool = > " + !bool); 
	
	
		   int m1 =  0, n1 = 1;
	    	
	    	if((m1++ == 0) | (n1 ++ == 2)) {		// 참 (m1 = 1 후위) | 거짓 (n1 = 2 후위) = 참
	    		m1 = 42; 	
	    		/* 
				 (m1 == 0)
				 true		m1= m1+ 1; m1 ==> 1
				 
				 true | skip 안됨 (n1 == 2) false	 	n1 = n1+1;
				 									n1 ==> 2
				 m1 = 42
				 
				 *  */
	    	}
	    	System.out.println("m1 =>"+ m1 + ", n1=>" + n1); // m1=> 42 , n1=> 2
	    
	    	m1 = 0;
	    	n1 = 1;
	    	if((m1++ == 0) || (n1 ++ == 2)) // 참 || 거짓
				/* (m1 == 0)
				 * true	m1 =m1+1;	m1 ==>1
				 * true   ||		false, ture가되든 skip 무조건 true이기 때문
				 * true		|| 스킵
				 *  */
	    		
	    		
	    		m1 = 42; // m1 ==> 42
	    	
	    	
	    	
	    	int no = 1;
	    	no += 3; // no = no + 3;와 같은 것이다
	    	
	    	
	
	
	
	}

}
