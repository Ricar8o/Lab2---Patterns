package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		String a;
		a = "Hello";
		if (args.length == 0){
				a+= " World";
		}
		for(int i = 0; i < args.length; i++){
			a+= " " + args[i];	
		}
		System.out.println(a + "!");
    }
}
