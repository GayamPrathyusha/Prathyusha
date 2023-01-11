class String:
    def rev_of_string(str):
        str1=''
        for i in range(len(str)-1,-1,-1):
            str1=str1+str[i]
        if str1=="enoN" or str1=="ENON":
            return "invalid datatype"
        elif str==str1:
            return "palindrome"
        else: 
            return str1

s1=String
print(s1.rev_of_string('123456'))

