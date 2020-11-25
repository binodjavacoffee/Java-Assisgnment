package assignment_day_17;

public class Practice1 {

	public void breakDemo() {
		
		for (int i=1; i<=5;i++) {
			if (i==3) {
				break;
			}
		System.out.println(i);
		}
	}
	
	public void continueDemo() {
		for (int i=1; i<=5;i++) {
			if (i==3) {
				continue;
			}
		System.out.println(i);
		}	
	}
	
	public void defaultValue() {
		byte bb=0;
		short ss=0;
		int a =0;
		long l=0;
		boolean b=true;
		double d=0.0;
		float f= 0;
		char c= 'b' ;
		String s =" binod";
	System.out.println(bb);	 
	System.out.println(ss);
	System.out.println(a);
	System.out.println(l);
	System.out.println(s);
	}
	
}

