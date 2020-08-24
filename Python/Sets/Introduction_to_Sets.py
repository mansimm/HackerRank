def average(array):
    # your code goes here
    arr = set(array)
    sum1 = sum(i for i in arr)
    avg = sum1/len(arr)
    return avg

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
