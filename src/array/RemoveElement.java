package array;

/**
 * Created by apuris on 20/02/18.
 */
public class RemoveElement {

    public static void main(String[] args){
        int resultingLength = removeElement(new int[]{3, 2, 2, 3, 3, 4},3);
        int resultingLength2 = removeElement2(new int[]{3, 2, 2, 3, 3, 4},3);
        System.out.println(resultingLength);
        System.out.println("---------------");
        System.out.println(resultingLength2);

    }

    //Approach 1 - Two Pointers
    private static int removeElement(int[] arr, int val){
        int i,j=0;

        for(i=0; i < arr.length;i++){
            if (arr[i] != val){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    //Approach 2 - Two Pointers - when element to remove are rare
    private static int removeElement2(int[] arr, int val){
        int i = 0;
        int n = arr.length;

        while (i < n){
            if (arr[i] == val){
                arr[i] = arr[n-1];
                //reduce array size by 1
                n--;
            }
            else {
                i++;
            }
        }
        return i;
    }
}
