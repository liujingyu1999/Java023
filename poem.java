package String;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class poem {
 public static void printsplit(String strsplit) {
  for (int i = 0; i<strsplit.length(); i = i+7) {
   if( i%2 == 0 ){
    String split = strsplit.substring(i, i+7);
    System.out.print(split+ "，");   
   } 
   if( i%2 == 1 ){
    String split = strsplit.substring(i, i+7);
    System.out.print(split+ "。" + "\n");  
   } 
   
  } 
 }
 public static int count(String srcStr, String findStr) {
  int count = 0;
  int index = 0;
  while ((index = srcStr.indexOf(findStr, index)) != -1) {

   index = index + findStr.length();
   count++; 
  }
  return count;
 }
    public static void main(String[] args) {
    	printsplit(args[0]);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        String strs = null;
        while(true){
            try {
                System.out.println("输入参数：" );
                strs = br.readLine();
            }catch(IOException e){
                e.printStackTrace();
            }
            break;
        }
        int count = count(args[0], strs);
        System.out.println(strs + " 出现 " + count + " 次");
    }
}



