# Data Structure
## ArrayList
> List is a collection which is ordered and changeable. Allows duplicate members.
Initialization
```bash
list = [1,2,3,4]
```
Add Item
```bash
list.append(10)
```
Access Item
```bash
list[2:5]
```
Update Item
```bash
list[0] = 1
list[0:2] = [1,2,3]
```
Remove Single Item by value
```bash
list.remove("test")
```
Remove Single Item by position
```bash
list.pop(1)
```
List Size
```bash
len(list)
```
Array List Loop V1
```bash
for i in range(len(list)):
  print(list[i])
```
Array List Loop V2 
```bash
for x in list:
  if "a" in x:
    list.append(x)
```
Sort Array
```bash
list.sort()
```
Copy Array
```bash
list.copy()
```
Reverse Array
```bash
list.reverse()
```
## Dictionary
> is a collection which is ordered** and changeable. No duplicate members.
> 
Initialization
```bash
thisdict = {
  "brand": "Ford",
  "model": "Mustang",
  "year": 1964
}
```
Add Item
```bash
thisdict["color"] = "red"
```
Update Item
```bash
thisdict.update({"year": 2020})
```
Access Item By Key
```bash
x = thisdict.get("model")
```
Get dict key or values
```bash
x = thisdict.keys()
x = thisdict.values()
```
Get dict key and values
```bash
x = thisdict.items()
```
Remove Single Item 
```bash
thisdict.pop("model")
```
Remove All Item 
```bash
thisdict.clear()
```
Loop By Values
```bash
for x in thisdict.values():
  print(x)
```
Loop By Key Values
```bash
for x in thisdict.keys():
  print(x)
```
Loop By Values & Keys
```bash
for x, y in thisdict.items():
  print(x, y)
```
## HashSet
Initialization
```bash
thisset = {"apple", "banana", "cherry"}
```
Add Item
```bash
thisset.add("orange")
```
Remove Single Item 
```bash
thisset.remove("banana")
```
Remove All Item 
```bash
thisset.clear() 
```
## String
Substring
```bash
    b = "Hello, World!"
    print(b[2:5])
```
Convert to array
```bash
    a = "Hello, World!"
    print(a.split(",")) # returns ['Hello', ' World!']
