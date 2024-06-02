import java.util.*;

public class Array{
    public int[] insertAtPosition(int[] arr, int pos){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your new value:");
        int newValue = input.nextInt();

        int[] newArr = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            if(i >= pos - 1){
                newArr[i+1] = arr[i];
                continue;
            }
            newArr[i] = arr[i];
        }
        newArr[pos-1] = newValue;
        return newArr;
    }

    public int[] insertAtBegining(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your new value:");
        int newValue = input.nextInt();

        int[] newArr = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            newArr[i+1] = arr[i];
        }
        newArr[0] = newValue;
        return newArr;
    }

    public int[] insertAtEnd(int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Input your new value:");
        int newValue = input.nextInt();

        int[] newArr = new int[arr.length+1];

        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newValue;
        return newArr;
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int[] arr1 = new int[5];
        // int[] arr2 = {1,2,3,4,5};
        // int[] arr3 = new int[] {5,4,3,2,1};

        for(int i=0;i<arr1.length;i++){
            System.out.print("Input value "+(i+1)+":");
            arr1[i] = input.nextInt();
        }

        // create object...
        Array ob = new Array();
        arr1 = ob.insertAtEnd(arr1);
        arr1 = ob.insertAtBegining(arr1);

        System.out.println("What is the position ?");
        int pos = input.nextInt();
        arr1 = ob.insertAtPosition(arr1,pos);

        System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));
    }
}