if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()

    for x,y in student_marks.items():
        if x == query_name:
            cnt=0
            sum1=0
            for i in y:
                sum1 +=i
                cnt=cnt+1
            per = sum1/cnt
            print("%0.2f"%per)
            break
