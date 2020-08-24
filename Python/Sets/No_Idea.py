# Enter your code here. Read input from STDIN. Print output to STDOUT

def calculate(arr,A,B):
    happyness = 0
    for i in arr:
        if i in A:
            happyness+=1
        elif i in B:
            happyness-=1
    print(happyness)

if __name__ == '__main__':
    n ,m = map(int, input().split())

    arr = list(map(int,input().split()))
    A = set(map(int,input().split()))
    B = set(map(int,input().split()))
    calculate(arr,A,B)


