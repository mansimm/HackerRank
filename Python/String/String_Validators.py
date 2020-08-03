if __name__ == '__main__':
    s = input()

    alpha = False
    digit = False
    lower = False
    upper = False



    for c in s:
        if c.isdigit():
            digit = True
        if c.isalpha():
            alpha = True
        if c.islower():
            lower = True
        if c.isupper():
            upper = True
    
    print(alpha or digit )
    print(alpha)
    print(digit)
    print(lower)
    print(upper)
