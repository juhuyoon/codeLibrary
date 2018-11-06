//the process of selecting which implementation operation to call at run time is known as a dynamic dispatch. 
//POJO = Plain Old Java object  cannot create object without all characteristics

//Interfaces to avoid duplication:
//filtering data
    //should you write twice if it's similar codes, but different concepts? (probably not as you should not duplicate code. 
    //Java remembers the actual types when you do new
    // Uses actual type to determine methods to call: "dynamic dispatch"
    //if you already have specific code and filters,
        //create combinations to hold generic code and match for the results you want. 