//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){
        int hi=0;
        for(int left=0;left<height.length/2;left++){
            for(int right=height.length-1;right>height.length/2;right--){
                int length = right - left;
                int up = 0;
                if (height[left] < height[right]) {
                    up = height[left];
                } else {
                    up = height[right];
                }
                int area = up * length;
                if (area > hi) {
                    hi = area;
                }
            }
        }


        System.out.println(hi);
        //TO DO


    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
