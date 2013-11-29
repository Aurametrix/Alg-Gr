//sample array
a = [123,45,56,3,56,67,84234,2342,1,34,546,67,677,5,15]
b = a 
long startTime = System.currentTimeMillis();
(0..(a.size()-2)).each {
		 minimumValue = it
		(it+1).upto(a.size()-1){ insideElement ->
			if(a[insideElement] < a[minimumValue])
				minimumValue = insideElement
		}
		swap(it,minimumValue)
}
long endTime = System.currentTimeMillis();
def swap(def one,def two)
{
        def temp = a[one]
        a[one] = a[two]
        a[two] = temp
}
println "It took ${endTime-startTime} s to finish ${a.size()}-element selection-sorting\n"
println a
 
 
// testing
//println (([23,76,-99,5.8,97,37,85,99,11,38,95,92,24,46,41,24,14,12,57,78,4]).sort)
assert b.sort() == a
assert b.size() == a.size()
