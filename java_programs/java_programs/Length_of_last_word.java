/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_programs;

/**
 *
 * @author Lenovo
 */
public class Length_of_last_word {
    public static void main(String args[]){
        String s = "   fly me   to   the moon  ";
	    int count=0;
	    for(int i=s.length()-1;i>0;i--){
	        if(s.charAt(i)!=' '){
	            count++;
	        }
	        else if(count>0){
	            System.out.println(count);
	            break;
	        }
	    }
	    System.out.println(count);
    }
}
