
package java_programs;


public class Words {
    public static void main(String args[]){
        String s = "my name is vivek";
        String word[] = s.split("\\s");
        String ss = "";
        
        for(String w:word){
            StringBuilder sb =new StringBuilder(w);
            sb.reverse();
            ss+=sb.toString()+" ";
        }
        System.out.println(ss);
    }
}
