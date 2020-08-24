# Enter your code here. Read input from STDIN. Print output to STDOUT



if __name__ == "__main__":
    m = int(input())
    A = set(map(int, input().split()))
    n = int(input())
    B = set(map(int, input().split()))

    diff = (A.union(B)).difference(A.intersection(B))   
    for i in sorted(diff):
        print(i)
