//For Visualization of sorting algorithms
//https://www.toptal.com/developers/sorting-algorithms
//http://khan4019.github.io/front-end-Interview-Questions/sort.html

1) Bubble Sort 
    //Compare first item with second, if bigger then swap. 
    //Continue swaps until at the end. 
        function bubbleSort(arr){
            var len = arr.length;
            for (var i = len-1; i>=0; i--){
            for(var j = 1; j<=i; j++){
                if(arr[j-1]>arr[j]){
                    var temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            }
            return arr;
        }
        bubbleSort([7,5,2,4,3,9]); //[2, 3, 4, 5, 7, 9]
        bubbleSort([9,7,5,4,3,1]); //[1, 3, 4, 5, 7, 9]
        bubbleSort([1,2,3,4,5,6]); //[1, 2, 3, 4, 5, 6]

 2) Selection Sort
    //Go through array, find index of lowest element, swap lowest with first element. 


        function selectionSort(arr){
            var minIdx, temp, 
                len = arr.length;
            for(var i = 0; i < len; i++){
            minIdx = i;
            for(var  j = i+1; j<len; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
            }
            return arr;
        }
            

  3) Insertion Sort
    //Begin with second element, compare to previous element, if first is bigger move first element ahead and then continue on down the list. 

        function insertionSort(arr){
            var i, len = arr.length, el, j;
        
            for(i = 1; i<len; i++){
            el = arr[i];
            j = i;
        
            while(j>0 && arr[j-1]>toInsert){
                arr[j] = arr[j-1];
                j--;
            }
        
            arr[j] = el;
            }
        
            return arr;
        }

 4) Quick Sort
        //Pick a pivot, put all items smaller than pivot to the left and larger than pivot to the right. 
    
        function quickSort(arr, left, right){
            var len = arr.length, 
            pivot,
            partitionIndex;
         
         
           if(left < right){
             pivot = right;
             partitionIndex = partition(arr, pivot, left, right);
             
            //sort left and right
            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
           }
           return arr;
         }
            
            function partition(arr, pivot, left, right){
                var pivotValue = arr[pivot],
                    partitionIndex = left;
            
                for(var i = left; i < right; i++){
                if(arr[i] < pivotValue){
                swap(arr, i, partitionIndex);
                partitionIndex++;
                }
            }
            swap(arr, right, partitionIndex);
            return partitionIndex;
            }    

                function swap(arr, i, j){
                    var temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }