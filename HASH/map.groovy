def mymap = [name:"UserX", allergic_to:"cheese", id:4321]
def key = "allergic_to"

if(mymap[key]) {
    println mymap[key]
}

// if the value could potentially be Groovy-false better to use:

if(mymap.containsKey(key)) {
    println mymap[key]
}

// if Groovy-false not an issue

def value = mymap[key] ?: "default"
