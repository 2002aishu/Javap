public class overloading75{
public static void print(int num){
System.out.println("Printing integer:"+num);
}
public static void print(double num){
System.out.println("Printing double:"+num);
}
public static void print(String str){
System.out.println("Printing string:"+str);
}
public static void print(char ch){
System.out.println("Printing Character:"+ch);
}
public static void main(String []args){
print(10);
print(3.14);
print("Hello ,World");
print('A');
}
}
