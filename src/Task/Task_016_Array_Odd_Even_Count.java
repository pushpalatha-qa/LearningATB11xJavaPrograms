package Task;

public class Task_016_Array_Odd_Even_Count {

    public static void main(String[] args) {
                int [] a={1,2,3,4,5,6,7,8,9,10};

        int even = 0;
        int odd=0;
        System.out.println("The length of array is " + a.length);
                for(int i=0;i<a.length;i++){
                    if (a[i]%2==0){
                           even++;

                    }
                    else{
                        odd++;

                    }

                }
        System.out.println("Total number of even number in given list "+ even);
        System.out.println("Total number of odd number in given list " + odd);
    }
            }

//output--
//The length of array is 10
//Total number of even number in given list 5
//Total number of odd number in given list 5