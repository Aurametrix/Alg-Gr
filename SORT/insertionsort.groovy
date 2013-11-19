class InsertionSort {
 
  static sort(int[] array) {
    for(int i=1;i<array.length;i++) {   //cost: c1  times: n  
      int key = array[i]                //cost: c2  times: n-1
      int j = i - 1                     //cost: c3  times: n-1
      while (j > 0 && array[j] > key){  //cost: c4  times: for t=2 to n => sum t
        array[j+1] = array[j]           //cost: c5  times: for t=2 to n => sum t-1
        j--                             //cost: c6  times: for t=2 to n => sum t-1
      }
      array[j] = key                    //cost: c7  times: n-1  
    }
  }
     
  static main( args ) {
    def array = [2, 4, 1, 8, 1]
    sort(array)
    println "Sorted array:" + array
  }
}
