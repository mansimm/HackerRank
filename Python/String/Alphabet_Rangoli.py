import string
def print_rangoli(size):
    # your code goes here
    alphabets = string.ascii_lowercase 
    #print(alphabets) #gives lowercase alphabets
    li = []
    for i in range(size):
        s = '-'.join(alphabets[i:size])#concat alpha[i:size] with '-' eg. for size =3 it will be a-b-c for i=0
        li.append((s[::-1]+ s[1:]).center(4*size - 3, '-'))#'c-b-a'+'b-c' for i=0

    print('\n'.join(li[:0:-1] + li))
    

if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)
