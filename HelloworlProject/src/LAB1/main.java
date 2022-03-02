package LAB1;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class main {
		static int fxShowText(int user) {
	        int i = 0 ;
	        for( i = 1 ; i <= user ; i++ ) {
	            if( i%5 == 0 ) {
	                System.out.println(i);
	            } else {
	                System.out.print(i+", ");
	            }
	        }
	        return user;
	    }

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int user = 0 ;
        System.out.print( "Please enter your value : " );
        try {
            user = Integer.parseInt( br.readLine() );  // Read user input
            //System.out.println( "User Input = " + userInput );  // Output user input
        } catch ( NumberFormatException nfe) {
            System.err.println( "Invalid Format!" );
        }
        System.out.println( "-----------------------");
        fxShowText(user);
        System.out.println("");
        System.out.println( "Jakkrit");
	}

}
