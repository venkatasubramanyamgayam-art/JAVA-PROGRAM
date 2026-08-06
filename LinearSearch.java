package day8;
public class LinearSearch{
public static int search(String[] list, String desired, int index){
if(index==list.length)return-1;
if(list[index].compareTo(desired)==0)return index;
return search(list,disered,index=1);
}
public static void main(string[] args){
String[] rating = {"deloite","zoho","tieto","Accenture","Capgemini"};
System.out.println(search(rating,"google",O));
System.out.println(search(rating,"capgemini",O));
System.out.println(search(rating,"bmw",O));
System.out.println(search(rating,"tieto",O));
System.out.println(search(rating,"wipro",O));
System.out.println(search(rating,"space x",O));
}
}