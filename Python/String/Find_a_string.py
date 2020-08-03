def count_substring(string, sub_string):
    cnt = 0
    if len(sub_string)>len(string):
        return 0
    else:
        for i in range(0, len(string)-len(sub_string)+1):
            if string[i : i+len(sub_string)] == sub_string:
                cnt+=1
    return cnt
                    

    return

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)
