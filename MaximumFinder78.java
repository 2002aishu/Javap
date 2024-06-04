public class MaximumFinder78 {
public static int findMaximum(int num1 ,int num2){
if(num1>num2){
return num1;
}else{
return num2;
}
}
public static void main(String[]args){
int number1=10;
int number2=20;
int maxNumber=findMaximum(number1,number2);
System.out.println("The maximum of "+ number1 +" and "+number2+"is:"+maxNumber);
}
}
