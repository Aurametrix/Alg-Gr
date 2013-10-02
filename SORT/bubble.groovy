def makeSwap = { a, i, j = i+1 -> print "."; a[[i,j]] = a[[j,i]] }
 
def checkSwap = { a, i, j = i+1 -> [(a[i] > a[j])].find { it }.each { makeSwap(a, i, j) } }
 
def BubbleSort = { list ->
    boolean swapped = true
    while (swapped) { swapped = (1..<list.size()).any { checkSwap(list, it-1) } }
    list
}


println (BubbleSort([23,76,-99,5.8,97,37,85,99,11,38,95,92,24,46,41,24,14,12,57,78,4]))

 


