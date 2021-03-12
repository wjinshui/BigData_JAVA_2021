# 求1-9的平方元组
result = (i ** 2 for i in range(1, 10))
item = next(result, None)
while item is not None:
    print(item)
    item = next(result, None)
print(tuple(result))

#result = tuple(result)
