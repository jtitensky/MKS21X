import java.lang.Math;
public class Sorts{

    public static void insertionSort(int[]data){
	for(int i=1;i<data.length;i++){
	    if(data[i]<data[i-1]){
		int a=1;
		int b=i-1;
		int c=0;
		if(data[i]>data[0]){
		    while(!(data[c]>=data[i] && data[c-1]<=data[i])){
			if(data[c]<data[i]){
			    a=c;
			}
			if(data[c]>data[i]){
			    b=c;
			}
			c=(a+b)/2+(a+b)%2;
		    }
		}
		int x=data[i];
		for(int j=i-1;j>=c;j--){
		    data[j+1]=data[j];
		}
		data[c]=x;
	    }
	    //printArray(data);
	}
    }

    public static void printArray(int[]data){
	String s="[";
	for(int i=0;i<data.length;i++){
	    s+=data[i]+", ";
	}
	s=s.substring(0,s.length()-2)+"]";
	System.out.println(s);
    }

    public static void selectionSort(int[] data){
	for(int i=0;i<data.length;i++){
	    int x=data[i];
	    int y=i;
	    for(int j=i;j<data.length;j++){
		if(data[j]<x){
		    x=data[j];
		    y=j;
		}
	    }
	    data[y]=data[i];
	    data[i]=x;
	    //printArray(data);
	}
    }

    public static void bubbleSort(int[] data){
	boolean o=false;
	for(int i=data.length;i>0;i--){
	    if(!o){
		o=true;
		for(int j=0;j<i-1;j++){
		    if (data[j]>data[j+1]){
			int x=data[j];
			data[j]=data[j+1];
			data[j+1]=x;
			o=false;
		    }
		}
	    }else{
	    }
	    //printArray(data);
	}
    }

    public static void fillRandom(int[] data){
	for(int i=0;i<data.length;i++){
	    data[i]=(int)(Math.random()*Integer.MAX_VALUE);
	}
    }

    public static void swap(int[] data,int i,int j){
	int x=data[i];
	data[i]=data[j];
	data[j]=x;
    }

    public static void main(String[]args){
	int[] nums1=new int[] {1,2,9,5,0,3};
	//insertionSort(nums1);//.121
	int[] nums2=new int[] {1,2,9,5,0,3};
	//selectionSort(nums2);//.076
	int[] nums3=new int[] {1,2,9,5,0,3};
	//bubbleSort(nums3);//.39

    
    }




}
