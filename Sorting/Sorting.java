/**
 * Sorting
 */
public class Sorting {

    public static void main(String[] args) {
        double[] numbers = {22, 11, 110, 6, 17, 10, 18}; //O(1 or n)
        MergeSort(numbers);
        //BubbleSort3(numbers); //sorts the array using Bubble Sort - O(n^2)
        PrintArray(numbers); //display the sorted array- O(n)
    }


    public static void MergeSort(double[] array)
    {
        double[] tmp = new double[array.length];
        MergeSortHelper(array, 0, array.length-1,tmp);
    }

    
    public static void MergeSortHelper(double[] array, int startIdx, int endIdx, double[] tmp)
    {
        if(startIdx<endIdx)//we only sort a slice if it has at least 2 elements in it
        {
            int midIdx = (startIdx+endIdx)/2;//find the mid of the current "slice"
            MergeSortHelper(array, startIdx, midIdx, tmp);//recursively sort the first half
            MergeSortHelper(array, midIdx+1, endIdx, tmp);//recursively sort the second half
            Merge(array, startIdx, midIdx, endIdx, tmp);//merge the two halves of the slice
        }
    }

    public static void Merge(double[] array, int startIdx, int midIdx, int endIdx, double[] tmp)
    {
        int i = startIdx;
        int j = midIdx+1;
        int k = startIdx;

        while(i<=midIdx && j<=endIdx) //select and store the smallest of each slice
        {
            if(array[i] < array[j])
            {
                tmp[k] = array[i];
                i++;
                k++;
            }
            else{
                tmp[k] = array[j];
                j++;
                k++;
            }
        }

        //copy the left over terms - only one loop will actually do something, the other is empty
        while(i<=midIdx ) 
        {
            tmp[k] = array[i];
            i++;
            k++;
        }
        while(j<=endIdx ) 
        {
            tmp[k] = array[j];
            j++;
            k++;
        }

        //copy all elements (from slice) from tmp back into the array
        for(i = startIdx; i<=endIdx; i++)
        {
            array[i] = tmp[i];
        }
    }












    public static void SelectionSort(double[] array)
    {
        for(int j=0; j<array.length-1; j++)//j is the starting position for each run
        {
            int min_pos = j;//keeps track of the position for the smallest value
            //find the position of smallest value in the array
            for(int i = j+1; i<array.length;i++)
            {
                if(array[i] < array[min_pos])//if we find something smaller
                {
                    //save its position
                    min_pos = i;
                }
            }
            //swap elements at position j and min_pos
            double tmp= array[j];
            array[j] = array[min_pos];
            array[min_pos] = tmp;
        }
    }
    public static void BubbleSort(double[] array)
    {
      for(int time = 0; time <array.length-1; time++)
      {
        //traverse the array
        for(int i=0; i<array.length - 1;i++)
        {
            if(array[i] > array[i+1])
            {
                //swap the elements at position i and i+1
                double tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
      }
    }

    
    public static void BubbleSort2(double[] array)
    {
      for(int time = 0; time <array.length-1; time++)
      {
        //traverse the array
        for(int i=0; i<array.length - 1 - time;i++)
        {
            if(array[i] > array[i+1])
            {
                //swap the elements at position i and i+1
                double tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
            }
        }
      }
    }

    public static void BubbleSort3(double[] array)//running time: O(n^2), best case is O(n)/big omega(n)
    {
      for(int time = 0; time <array.length-1; time++)
      {
        boolean didSwap = false;
        //traverse the array
        for(int i=0; i<array.length - 1 - time;i++)
        {
            if(array[i] > array[i+1])
            {
                //swap the elements at position i and i+1
                double tmp = array[i];
                array[i] = array[i+1];
                array[i+1] = tmp;
                didSwap = true; //set the flag, we swapped values
            }
        }
        //did we do any swaps?
        if(!didSwap) //no swaps done in one run = array is now sorted
        {
            break; //leave the loop, we are done
        }
      }
    }
    public static void PrintArray(double[] array)
    {
        //traverse the array
        for(int i = 0; i< array.length; i++)
        {
            //display the value of the array at the index i
            System.out.print( array[i] +" ");
        }
        System.out.println();//move to the next line
    }
}