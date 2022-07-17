package DSpracto;

public class Main {
    public static void main(String[] args) {
        int[] nums = {10,45,36,56,47,20,61,-8,-14};
        int target = 56;
        int ans = linearSearch(nums, target);int ans2= linearSearch2(nums, target);int ans3= linearSearch3(nums, target);
        System.out.println(ans+"\n"+ans2+"\n"+ans3);
    }

    //Search in array, return index if found otherwise return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for(int index = 0; index < arr.length; index++) {        //for(int element : arr){
            //check every index if it's = target                 //if(element == target){
            int element = arr[index];                           //return element;}}
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for(int index = 0; index < arr.length; index++) {        //for(int element : arr){
            //check every index if it's = target                 //if(element == target){
            int element = arr[index];                           //return element;}}
            if (element == target) {
                System.out.print(element+": ");
                return element;
            }
        }
        return -1;
    }

    static int linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for(int index = 0; index < arr.length; index++) {        //for(int element : arr){
            //check every index if it's = target                 //if(element == target){
            int element = arr[index];                           //return element;}}
            if (element == target) {
                System.out.print(element+": ");
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}

