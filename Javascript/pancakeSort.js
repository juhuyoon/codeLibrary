function pancakeSort(arr) {
    for(var i = arr.length -1; i >= 1; i--) {
        //find the index of the largest element not yet sorted
        var max_idx = 0;
        var max = arr[0];

        for(var j = 1; j <= i; j++) {
            if(arr[j] > max) {
                max = arr[j];
                max_idx = j;
            }
        }
        if(max_idx == i)
        continue; //if element is already in place here. 

        var new_slice;

        //flip arr max element to index 0 pancake!
        if(max_idx > 0) {
            new_slice = arr.slice(0, max_idx+1).reverse();
            for(j = 0; j <= max_idx; j++) {
                arr[j] = new_slice[j];
            }

            new_slice = arr.slice(0, i+1).reverse();
            for(j = 0; j <= i; j++) {
                arr[j] = new_slice[j];
            }
            return arr;
        }
    }
}

var array = [3,0,2,5,-1,4,1];
console.log("Original Array Elements");
console.log(array);
console.log("Sorted Array Elements");
console.log(pancakeSort(array, 0, 5));