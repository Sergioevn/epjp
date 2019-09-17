package s040;

public class BooleanEx {
	public static void main(String[] args) {
		boolean[] flags = { true, false, false };
		for (boolean flag : flags) {
			System.out.println(flag);
		}
		
		for (int i = 0; i < flags.length; i++) {
			if (!flags[i]) {
				flags[i] = true;
			}
		}
		{	System.out.println();
			
			for (boolean flag : flags) {
			System.out.println(flag);
							}
			}
		}
}