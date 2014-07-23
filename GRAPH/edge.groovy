class Edge {
    String node1, node2
    int distance
}
graph = [
    new Edge(node1:'a', node2:'b', distance:4),
    new Edge(node1:'a', node2:'c', distance:2),
    new Edge(node1:'b', node2:'c', distance:3),
    new Edge(node1:'c', node2:'b', distance:1),
    new Edge(node1:'c', node2:'d', distance:5),
    new Edge(node1:'b', node2:'d', distance:1),
    new Edge(node1:'a', node2:'e', distance:1),
    new Edge(node1:'e', node2:'d', distance:4)
]
def dijkstra = new DijkstrasShortestPathAlgoritm(graph, 'a', 'd')
d = dijkstra.calculateShortestPath();
assert d == 4
assert dijkstra.shortestPath == ['a','c','b','d']

