
def merge_the_tools(string, k):
    # your code goes here
    i=0
    while i<len(string):
        s = string[i:i+k]
        i = i+k
        t=""
        for j in s:
            if j in t:
                pass
            else:
                t=t+j
        print(t)

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
