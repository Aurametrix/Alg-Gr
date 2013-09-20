def merge = { List left, List right ->
    List mergeList = []
    while (left && right) {
        print "."
        mergeList << ((left[-1] > right[-1]) ? left.pop() : right.pop())
    }
    mergeList = mergeList.reverse()
    mergeList = left + right + mergeList
}
 
def mergeSort;
mergeSort = { List list ->
 
    def n = list.size()
    if (n < 2) return list
 
    def middle = n.intdiv(2)
    def left = [] + list[0..<middle]
    def right = [] + list[middle..<n]
    left = mergeSort(left)
    right = mergeSort(right)
 
    if (left[-1] <= right[0]) return left + right
 
    merge(left, right)
}

println (mergeSort([23,76,-99,5.8,97,37,85,99,11,38,95,92,24,46,41,24,14,12,57,78,4]))