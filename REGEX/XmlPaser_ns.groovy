def ns = new groovy.xml.Namespace("http://www.example.com/book", 'ns')
def root = new XmlParser().parseText("...")
def authors = root[ns.book][ns.author]
