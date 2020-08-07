# Enter your code here. Read input from STDIN. Print output to STDOUT
x , y= map(int,input().split())

for i in range(1,x,2):
    print((i*".|.").center(y,"-"))
print("WELCOME".center(y,"-"))
for i in range(x-2,-1,-2):
    print((i*".|.").center(y,"-"))
    
