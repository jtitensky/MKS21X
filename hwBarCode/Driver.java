public class Driver{
    public static void main(String[]args){

	BarCode bc=new BarCode("08451");
	System.out.println(bc.toString());
	BarCode cb=new BarCode("11111");
	System.out.println(bc.compareTo(cb));
	System.out.println(bc.compareTo(bc));
	System.out.println(cb.compareTo(bc));
    }
}