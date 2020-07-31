if __name__ == '__main__':
    list1 = []
    for _ in range(int(input())):
        name = input()
        score = float(input())
        list1.append([name,score])

    list2 = sorted(set(x[1] for x in list1 ))

    y= list2[1]
    list3=[]
    for x in list1:
        if x[1]==y:
            list3.append(x[0]) 

    list3.sort()
    for x in list3:
        print(x)

