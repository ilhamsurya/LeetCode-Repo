# Time Complexity
Big O Notation
| Notation        | Time         |
| ------------- |:-------------:| 
| O(1)     | Constant time complexity |
| O(n)      | Linear time complexity |   
| O(logn)    |  Logarithmic time complexity |  
| O(n^2)     |  Quadratic time complexity |  

O(1) - Constant Time
> Constant time algorithms will always take same amount of time to be executed. The execution time of these algorithm is independent of the size of the input. A good example of O(1) time is accessing a value with an array index  **Other examples include: push() and pop() operations on an array**. 
```bash
var arr = [ 1,2,3,4,5];
arr[2]; // => 3
```

O(n) - Linear time complexity
>  linear time complexity if the time to execute the algorithm is directly proportional to the input size n. Therefore the time it will take to run the algorithm will increase proportionately as the size of input n increases. 
```bash
string[] arr1 = [orange, apple, banana, lemon]; //=> 4 steps
string[] arr2 = [orange, apple, banana, lemon, pineaple]; //=> 5 steps

for (var i = 0; i &lt; array.length; i++) {     console.log(array[i]);
}
```
O(log n) - Logarithmic time complexity
>  An algorithm has logarithmic time complexity if the time it takes to run the algorithm is proportional to the logarithm of the input size n. An example is **binary search**:
