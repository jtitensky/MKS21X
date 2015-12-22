public class BarCode implements Comparable{

    private String _zip;
    private int _checkDigit;
    private static String[] arr=new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};

    public BarCode(String zip){
	if(zip.length()!=5){
	    throw new RuntimeException();
	}
	try{
	    _checkDigit=0;
	    for(int i=0;i<5;i++){
		_checkDigit+=Integer.parseInt(zip.substring(i,i+1));
	    }
	    _checkDigit=_checkDigit%10;
	    _zip=zip;
	}catch(NumberFormatException e){
	    throw new RuntimeException();
	}
    }

    public BarCode(BarCode x){
	_zip=x._zip;
	_checkDigit=x._checkDigit;
    }

    public int checkSum(){
	int x=0;
	for(int i=0;i<5;i++){
	    x+=Integer.parseInt(_zip.substring(i,i+1));
	}
	return x;
    }

    public String toString(){
	String x=_zip+_checkDigit;
	String y="";
	for(int i=0;i<6;i++){
	    y+=arr[Integer.parseInt(x.substring(i,i+1))];
	}
	return x+" |"+y+"|";
    }

    public boolean equals(Object other){
	if(!(other instanceof BarCode)){
	    return false;
	}
	return _zip.equals(((BarCode)(other))._zip);
    }

    public int compareTo(Object other){
	//Object vs Comparable
	return Integer.parseInt(((BarCode)(other))._zip)-Integer.parseInt(_zip);
    }



}
