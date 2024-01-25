package arrays;

public class minMaxNumber {
    public int minimumNumber(int num[]){
        int min=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]<min)
                min=num[i];
        }
        return min;
    }
    public int maximumNumber(int[] num){
        int max=num[0];
        for(int i=0; i<num.length; i++){
            if(num[i]>max)
                max=num[i];
        }
        return max;
    }
    public static void main(String[] arg){
        minMaxNumber m=new minMaxNumber();
        int[] num = readArray.readingArray();
        System.out.println("Minimum Number of array is "+m.minimumNumber(num));
        System.out.println("Maximum Number of array is "+m.maximumNumber(num));
    }
}
