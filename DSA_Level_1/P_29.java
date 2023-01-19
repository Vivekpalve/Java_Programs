/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_Level_1;

/*
p										p	
	r								r		
		a						a			
			n				n				
				i		i					
					t						
				a		a					
			m				m				
		o						o			
	r								r		
e										e	
e										e	
	r								r		
		o						o			
			m				m				
				a		a					
					t						
				i		i					
			n				n				
		a						a			
	r								r		
p										p	
BUILD SUCCESSFUL (total time: 6 seconds)
 */
import java.util.*;
public class P_29 {
    public static void pattern(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(i==j || i+j==s.length()-1){
                    System.out.print(s.charAt(i)+"\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        for(int i=s.length()-1;i>=0;i--){
            for(int j=s.length()-1;j>=0;j--){
                if(i==j || i+j==s.length()-1){
                    System.out.print(s.charAt(i)+"\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        pattern(s);
    }
}
