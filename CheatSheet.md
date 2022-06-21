# Data Structure

## Linked List
Initialization
```bash
LinkedList<Object> linkedList = new LinkedList<>();
```
Adding Element
```bash
linkedList.add(“item”)
```
Add in beginning or last
```bash
linkedList.addFirst(“item”)
linkedList.addLast("item")
```
Remove element.
```bash
linkedList.poll();
linkedList.pop();
```
## ArrayList
Initialization
```bash
ArrayList<String>list = new ArrayList<>();
```
Add Item
```bash
list.add(“item”)
```
Access Item
```bash
list.get(0)
```
Update Item
```bash
list.set(0,”item”)
```
Remove Single Item Or All
```bash
list.remove(0) || list.clear()
```
List Size
```bash
list.remove(0) || list.clear()
```
Array List Loop V1
```bash
for(int i=0; i<list.size(); i++){
  System.out.println(list.get(i))
}
```
Array List Loop V2 
```bash
for(String i : list){
  System.out.println(i)
}
```
Sort Array
```bash
Collections.sort(list)
```
Check empty 
```bash
list.isEmpty()
```
Convert list to array 
```bash
String[] arr = new String[list.size()]; 
for (int i = 0; i < list.size(); i++) 
    arr[i] = list.get(i);
```
## Multidimensional Array
Initialization
```bash
Int[][] matriks = new int [row][column]
```
Access row & column
```bash
mat = [[1,2],[3,4]]
rows = mat.length;
cols = mat[0].length;
```
Loop through matrix
```bash
for(int i=0; i<rows;i++){
   for(int j=0; j<cols; j++){
           System.out.println(mat[i][j])
    }
}
```
Binary Search
Define the row and column of the matrix
```bash
      int row = matrix.length;
      int col = matrix[0].length;
```
Define the start and endpoint for the loop
```bash
      int left = 0;
      int right = row*col-1;
```
Start the loop
```bash
      while(left<=right){
          // define mid value
          int mid = left + (right-left)/ 2;
            //convert mid value to matrix wise
          int midValue = matrix[mid/col][mid%col];
          if(midValue == target){
              return true;
          } else if (midValue > target){
              right = mid - 1;
          } else {
              left = mid + 1;
          }
      }
      return false;
```
## HashMap
Initialization
```bash
HashMap<Integer,String>map = new HashMap<String,Integer>();
```
Add Item
```bash
map.put(1,”Ayam”)
```
Access Item By Key
```bash
map.get(1)
```
Access Item Or Default
```bash
map.getOrDefault(1,0) 
```
Remove Single Item 
```bash
map.remove(1) 
```
Remove All Item 
```bash
map.clear() 
```
Get the maximum value using collections
```bash
Collections.max(map.values())
```
Loop By Key
```bash
for(String x : map.keySet()){
  System.out.println(x)
}
```
Loop By Values
```bash
for(String x : map.values()){
  System.out.println(x)
}
```
Loop By Key Values
```bash
for(String x : map.keySet()){
  System.out.println(x)
  System.out.println(map.get(i))
}
```
## HashSet
Initialization
```bash
HashSet<String>set = new HashSet<String>();
```
Add Item
```bash
set.add(”Ayam”)
```
Access Item
```bash
set.contains(“Ayam”)
```
Remove Single Item 
```bash
set.remove(“Ayam”)
```
Remove All Item 
```bash
set.clear() 
```
Size Set
```bash
set.clear() 
```
## Stack
Initialization
```bash
Stack<String> stack = new Stack<String>();
```
Add Item
```bash
stack.push(“Mangga”);
```
Access Item Top
```bash
Stack.peek() 
```
Remove Single Item 
```bash
set.remove(“Ayam”)
```
Remove All Item 
```bash
set.clear() 
```
Size Set
```bash
set.clear() 
```
## Queue
Initialization
```bash
Queue<Integer>queue = new LinkedList<Integer>();
```
Initialization (Priority Based)
```bash
PriorityQueue<Integer>pQueue = new PriorityQueue<Integer>();
```
Initialization (Mutable Queue)
```bash
ArrayDeque<Integer>deQueue = new ArrayDeque<Integer>(); 
```
Add Item
```bash
queue.add(1);
```
Access Item Top
```bash
Stack.peek() 
```
Remove Single Item 
```bash
queue.remove(1)
```
Remove First Element
```bash
queue.poll()
```
Size Queue
```bash
queue.size() 
```
Check whether queue empty
```bash
queue.isEmpty()
```
Loop Queue
```bash
Iterator iterator = queue.iterator();
While (iterator.hasNext()){
       iterator.next();
}
```
## String
String Builder
```bash
  StringBuilder str = new StringBuilder();
```
Add to string Builder
```bash
  str.append()
```
Convert to array
```bash
  char[] ch = str.toCharArray()
```
Compare lexicographically
```bash
  String sen1= "sample"
  String sen2= "a sample"
  sen1.compareTo(sen2);
```
Convert back from array to string
```bash
  new String(ch);
```
Chech if letter or digit
```bash
char ch = 'A'
Character.isLetterOrDigit(ch)
```
To Lowercase
```bash
char ch = 'A'
Character.isLetterOrDigit(ch)
```

## Sort
Quicksort
> Is a divide and conquer algorithm, it picks an element as pivot and partitions the given array around pivot. **O(n log n)** time complexity.
```bash
    
```

## Tree
Invert Binary Tree
> Replacing the left subtree with the value from right subtree **O(V) where V is the number of node** time complexity. 
![Inverted Tree Example](/images/inverted%20tree.png "Inverted Tree Example")

```bash
    public TreeNode invertTree(TreeNode root) {
        # Solution by ilham surya 15/06/22
        # DFS, Recursion approach

        # edge case if root null
        if (root == null)
            return null;

        # replace the left and right of root node
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        # do recursively for any subtree available
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
```
Maximum depth of binary tree
> Find out about the height of the binary tree **O(V) where V is the number of node** time complexity. 
```bash
    public int maxDepth(TreeNode root) {
        # Solution by ilham surya 15/06/22
        # Recursive approach, DFS
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }
```
Traversal
| Type        | Pattern         |
| ------------- |:-------------:| 
| Preorder     | Root->left->right |
| Inorder      | left->root->right |   
| Postorder    | left->right->root |  
![Traversal Example](/images/traversal.png "Traversal Example")

Preorder Traversal
> Iterative method using stack
```bash
    public List<Integer> preorderTraversal(TreeNode root) {
        // Solution by ilham surya 17/06/22
        // Iterative Method (Stack)
        List<Integer> pre = new LinkedList<>();
        if (root == null)
            return pre;
        Stack<TreeNode> toVisit = new Stack<>();
        toVisit.push(root);

        while (!toVisit.empty()) {
            TreeNode visiting = toVisit.pop();
            pre.add(visiting.val);
            if (visiting.right != null)
                toVisit.push(visiting.right);
            if (visiting.left != null)
                toVisit.push(visiting.left);
        }
        return pre;
    }
```
> Recursive method
```bash
    public List<Integer> preorderTraversal(TreeNode root) {
        // Solution by ilham surya 17/06/22
        // Recursive Method
        List<Integer> pre = new LinkedList<>();
        preOrderHelper(root, pre);
        return pre;
    }

    public void preOrderHelper(TreeNode root, List<Integer> pre) {
        if (root == null)
            return;
        pre.add(root.val);
        preOrderHelper(root.left, pre);
        preOrderHelper(root.right, pre);
    }
```

Depth First Search
>A traversal algorithm that starts traversing the graph/tree from the root node and explores all the neighboring node **O(V+E) where V is the number of node and E is the edges** time complexity. 


Breadth First Search
>A traversal algorithm that starts traversing the graph/tree from the root node and explores all the neighboring node **O(V+E) where V is the number of node and E is the edges** time complexity. 
