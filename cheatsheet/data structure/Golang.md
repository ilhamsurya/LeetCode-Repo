# Data Structure

## Array
Initialization
```bash
var a [3]string // maximum 3 data
var a [...]string // undefined length data
```
Initialization with value
```bash
var a [3]string{
    "test",
    "other_test"
}
```
Add Value
```bash
a[0] = "test"
a[1] = "other_test"
```
Array Length
```bash
len(array)
```

## Slice (Equal to ArrayList)
> Slice have 3 primary data, pointer to point the first data, length & capacity where length can't be more than capacity
 
 Slicing Array
```bash
array[low:high] 
array[low:]
array[:high]  
```

Initialization
```bash
var a = []int{
    1,
    2,
    3
}
```
Initialization Using Make
```bash
a := make([]int, 5)  // len(a)=5
b := make([]int, 0, 5) // len(b)=0, cap(b)=5
```
Add Item
```bash
a = append(a, 1) // add one element
a = append(a, 1,2,3,4) // add multiple element
```    
Copy Slice
```bash
days = []string {"Senin", "Selasa", "Rabu"}
newDays = []String {"Kamis","Jumat","Sabtu","Minggu"}
copy(days,NewDays)
```
Slice length
```bash
len(s)
```
Slice capacity
```bash
cap(s)
```
Slice Loop V1
```bash
var slice = []int {1,2,3,4,5}

for i := range slice {
    fmt.printf("%d\n",i)
}
```
Slice Loop V2
```bash
var slice = []int {1,2,3,4,5}

for i := range slice {
    fmt.printf("%d\n",i)
}
```

## Map

Initialization
```bash
person := map[string]string{
    "name":"ilham",
    "address":"indonesia",
}
```
Initialize Using Map
```bash
var book  = make(map[string]string)
```
Map Access
```bash
fmt.Println(person["name"])
```
Add value 
```bash
person["age"] = "22"
```
Delete value 
```bash
delete(person,"name")
```
Map Length
```bash
len(map)
```