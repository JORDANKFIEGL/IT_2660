public class MergeSort {

    //
    void arrayMerge(int arr[], int l, int m, int r) {
        // Gather sizes of sub-arrays
        int size1 = m - l + 1;
        int size2 = r - m;

        // Store data in temp arrays
        int L[] = new int[size1];
        int R[] = new int[size2];

        // Iteratively add data to temp arrays with for loop
        for (int i = 0; i < size1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < size2; ++j)
            R[j] = arr[m + 1 + j];


        // Namesake of function: Merge temp arrays

        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;

        // Initially indexing merged array of sub-arrays
        int k = l;
        while (i < size1 && j < size2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copying remaining elements from each sub-array temp list (if any)
        while (i < size1) {
            arr[k] = L[i];
            i++;
            k++;
        }


        while (j < size2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Now we need to sort those arrays
    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Find the middle point

            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // Merge the sorted halves
            arrayMerge(arr, l, m, r);
        }
    }

    // Function to demonstrate the before/after of the array

}



