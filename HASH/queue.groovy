// Queues are essentially an implementation of a java.util.LinkedList
// poll() method can be used to remove objects from the queue in FIFO way.  

list =[]
def q1 = list as Queue
// println "Default Queue implementation is ${q1.setClass().name}\n"


q1<<"first"
q1<<"second"
q1<<"third"
q1<<"fourth"

println q1

q1.poll()
println "After poll:" + q1;
q1.poll()
println "After poll:" + q1;


def q = ["one", "two"] as Queue

println "New queue:" + q;

q.offer("new inserted string")
println "After offer:" + q;
assert q.peek() == "one"
// assert q.poll() == "two"
// assert q.poll() == "three"
// assert q.poll() == "new inserted string"
println q

def l = [1, 2, 3] as LinkedList
println "Linked list:" + l;
assert l[0] == 1
println "After assert:" + l;
l.add(4)
println "After add:" + l;
assert l.last() == 4