import java.util.*;

public class Array {
    public int searchValue(int[] arr, int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == val){
                return 0;
            }
        }
        return -1;
    }

    public void printArray(int[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ",");
        }
        System.out.print("\b]");
    }

    public int[] inputValues(int[] arr){
        Scanner input = null;

        try {
            input = new Scanner(System.in);
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Input value " + (i + 1) + ":");
                arr[i] = input.nextInt();
            }
            return arr;
        } finally {
            if(input != null){
                input.close();
            }
        }
    }

    public int[] deleteAtPosition(int[] arr){
        Scanner input = null;
    
        try {
            input = new Scanner(System.in);
            System.out.println("What is the position ?");
            int pos = input.nextInt();

            int[] newArr = new int[arr.length-1];

            for(int i=0;i<newArr.length;i++){
                if(i >= pos-1){
                    newArr[i] = arr[i+1];
                    continue;
                }
                newArr[i] = arr[i];
            }
            return newArr;

        } finally {
            if(input != null){
                input.close();
            }
        }
    }

    public int[] deleteAtBegining(int[] arr){
        int[] newArr = new int[arr.length-1];

        for(int i=0;i<newArr.length;i++){
            newArr[i] = arr[i+1];
        }
        return newArr;
    }

    public int[] deleteAtEnd(int[] arr){
        int[] newArr = new int[arr.length-1];

        for(int i=0;i<newArr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    public int[] insertAtPosition(int[] arr){
        Scanner input = null;
        
        try {
            input = new Scanner(System.in);
            System.out.println("What is the position ?");
            int pos = input.nextInt();
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

        } finally {
            if(input != null){
                input.close();
            }
        }
    }

    public int[] insertAtBegining(int[] arr) {
        Scanner input = null;

        try {
        input = new Scanner(System.in);
        System.out.println("Input your new value:");
        int newValue = input.nextInt();

        
int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        newArr[0] = newValue;
        return newArr;
        } finally {
            if(input != null){
                input.close();
            }
        }
    }

    public int[] insertAtEnd(int[] arr) {
        Scanner input = null;

        try {
            input = new Scanner(System.in);
            System.out.println("Input your new value:");
            int newValue = input.nextInt();

            int[] newArr = new int[arr.length + 1];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = newValue;
            return newArr;

        } finally {
            if(input != null){
                input.close();
            }
        }
    }

    public static void main(String args[]) {
        int[] arr1 = new int[5];
        // int[] arr2 = {1,2,3,4,5};
        // int[] arr3 = new int[] {5,4,3,2,1};

        // create object...
        Array ob = new Array();

        // input values...
        arr1 = ob.inputValues(arr1);

        // insert.....
        // arr1 = ob.insertAtEnd(arr1);
        // arr1 = ob.insertAtBegining(arr1);

        // arr1 = ob.insertAtPosition(arr1);

        // delete.....
        // arr1 = ob.deleteAtEnd(arr1);
        // arr1 = ob.deleteAtBegining(arr1);
        // arr1 = ob.deleteAtPosition(arr1);

        // print value(Traversal)...
        // ob.printArray(arr1);

        // search value(Traversal)...
        System.out.println(ob.searchValue(arr1,55) == -1 ? "False" : "True");

        // System.out.println(Arrays.toString(arr1));
        // System.out.println(Arrays.toString(arr2));
        // System.out.println(Arrays.toString(arr3));
        
    }
}