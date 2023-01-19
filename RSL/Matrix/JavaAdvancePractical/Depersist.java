/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaAdvancePractical;
import java.io.*;
class Depersist{  
 public static void main(String args[]){  
  try{  
  //Creating stream to read the object  
  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
  Student s=(Student)in.readObject();  
  //printing the data of the serialized object  
  System.out.println(s.id+" "+s.name);  
  //closing the stream  
  in.close();  
  }catch(Exception e){System.out.println(e);}  
 }  
}  
