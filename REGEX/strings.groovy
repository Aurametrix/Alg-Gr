def a = 'How are you?'
assert "The phrase '$a' has length ${a.size()}" ==
    "The phrase 'How are you?' has length 12"


stringDate = "2013-12-11"
dateArray = stringDate.split("-")	// split() uses regEx's, so you need to escape chars such as a "." -> "\\."
year = dateArray[0].toInteger()
year = year + 1
newDate = year + "-" + dateArray[1] + "-" + dateArray[2]

// implementation of a string buffer
def sb1= new StringBuffer() //default initial capacity is 16
assert sb1.capacity() == 16

def sb2= new StringBuffer(5) //initial capacity is specified
assert sb2.capacity() == 5
sb2<< 'abc'
assert sb2.capacity() == 5 && sb2.size() == 3
sb2.trimToSize()
assert sb2.capacity() == 3
sb2.ensureCapacity(10)
assert sb2.capacity() == 10

def sb3= new StringBuffer(0) //capacity approximately doubles when required
def cap= 0, caps=[]
100.times{
  if((sb3<< 'a').capacity() != cap) caps<< (cap= sb3.capacity())
}
assert caps == [2, 6, 14, 30, 62, 126]
