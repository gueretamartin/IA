cities = {'City 1': ['City 2', 'City 4'],
         'City 2': ['City 3'],
         'City 4': ['City 5', 'City 6'],
         'City 5': ['City 6']}


def findPath(cities, origin, destination, path=[]):
    #by adding [origin] instead of origin, I create a new list (I need a new list because the function is recursive)
    path = path + [origin]
    if origin == destination:
        return path
    if origin not in cities:
        return None
    for node in cities[origin]:
        if node not in path:
            newPath = findPath(cities, node, destination, path)
            if newPath: return newPath 
    return None

result = findPath(cities, "City 1", "City 6")
print(result)

