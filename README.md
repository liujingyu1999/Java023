字符串实验
======

实验目的
-------
掌握字符串String及其方法的使用。<br>
掌握异常处理结构<br>

实验要求
--------
利用已学的字符串处理知识编程完成《长恨歌》古诗的整理对其工作，写出功能函数，并运行。达到如下功能。<br>
1.每7哥汉字加入一个标点符号，奇数时加“，”，偶数时加“。”<br>
2允许提供输入参数，统计古诗中某个字或词出现的次数。<br>
3允许操作中可能出现的异常，在程序中设计异常处理程序。<br>

核心代码
---------
1.将所需改格式的文字输入<br>
```		    
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
```    
2.用for循环每7个字添加一个逗号，每14字添加一个句号和换行符“\n”<br>
```
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
 ```
3．输入某文字，将该文字与该段文字出现的次数输出<br>
```		
    public static int count(String srcStr, String findStr) {
  int count = 0;
  int index = 0;
  while ((index = srcStr.indexOf(findStr, index)) != -1) {

   index = index + findStr.length();
   count++; 
  }
  return count;
 }
```
实验结果
--------
实验过程
-----------
查询资料，整理方向，理清代码，编译代码，输入古诗，调试代码，按要求输出。<br>

编程感想
------------
在这次实验中，学会如何在一段文字中，查找某文字出现的次数。遇到不会的要虚心向同学请教，敢于向同学问问题或自己上网查资料。<br>
