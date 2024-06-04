public class ArrayExample{
public static void main(String[] args){
int[] number={1,2,3,4,5};
try{
System.out.println("Value at  index 10:"+number[10]);
}catch(ArrayIndexOutOfBoundsException e){
System.out.println("ArrayIndexOutOfBoundsException:"+e.getMessage());
}
}
}
