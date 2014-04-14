/*
this
is
a
string
*/
def str = """this
is
a
string
"""
int num = 0;
str.each { if(it == '\n') num++; } 
println num // 4
/**
Joe Schmoe
John Q. Public
Jane Doe
**/
num = 0;
new File("names.txt").eachLine { num++ }
println num; // 3
