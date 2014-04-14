// count words of a text

def text = '''
just some text about words
that I will try to count
'''
int words = text
    .collect { it.charAt(0).digit || it.charAt(0).letter ? it : ' ' }
    .join('').tokenize(' ').size()
