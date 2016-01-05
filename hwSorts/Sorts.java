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
	}
    }

    public static void main(String[]args){
	int[] nums1=new int[] {9,6,4,7,8,0,2,3,4,4,7,4,5,6};
	insertionSort(nums1);
	printArray(nums1);
	int[] nums2=new int[] {9,6,4,7,8,0,2,3,4,4,7,4,5,6};
	selectionSort(nums2);
	printArray(nums2);
    
    }




}
