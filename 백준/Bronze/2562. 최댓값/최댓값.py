_list = list()
for i in range(9):
    _input = input()
    _list.append(int(_input))

print(max(_list))
print(_list.index(max(_list))+1)