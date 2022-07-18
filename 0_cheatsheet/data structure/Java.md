# JAVA Input/Output
Scanner Class
```bash
Scanner sc=new Scanner(System.in);  
```
Scan Type
```bash
int a= sc.nextInt();  
String  a= sc.nextLine();  
float  a= sc.float ();  
```
Array Input
```bash
# reading the number of elements from the that we want to enter  
n=sc.nextInt();  
# creates an array in the memory of length 10  
    int[] array = new int[10];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  {  
    # reading array elements from the user   
    array[i]=sc.nextInt();  
    }  
```
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
set.size() 
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
stack.pop()
```
Check if empty
```bash
stack.isEmpty()
```
Size Stack
```bash
set.size() 
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
queue.offer(1);
```
Access Item Top
```bash
queue.peek() 
```
Remove Element
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
Convert from int
```bash
    int i=10;  
    String s=String.valueOf(i)
```
Substring
```bash
  string.substring(start, end); 
```
Equals
```bash
  string.equals("string2")
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
## String Builder
String Builder
```bash
  StringBuilder str = new StringBuilder();
```
Add to string Builder
```bash
  str.append()
```
Convert to string
```bash
  str.toString()
```
## Sort
Quicksort
> Is a divide and conquer algorithm, it picks an element as pivot and partitions the given array around pivot. **O(n log n)** time complexity.
![Merge Sort Example](/images/quicksort.png "Quick Sort Example")
```bash
  # first implementation of quick sort, take array, first and last index
  public void quickSort(int arr[], int begin, int end) {
      # wont stop until the arr is sorted
      if (begin < end) {
          int partitionIndex = partition(arr, begin, end);

          quickSort(arr, begin, partitionIndex-1);
          quickSort(arr, partitionIndex+1, end);
      }
  }
  # create partition with last element as pivot
  private int partition(int arr[], int begin, int end) {
      int pivot = arr[end];
      int i = (begin-1);

      for (int j = begin; j < end; j++) {
          if (arr[j] <= pivot) {
              i++;

              int swapTemp = arr[i];
              arr[i] = arr[j];
              arr[j] = swapTemp;
          }
      }

      int swapTemp = arr[i+1];
      arr[i+1] = arr[end];
      arr[end] = swapTemp;

      return i+1;
  }
```

MergeSort
> Is a divide and conquer algorithm, it picks an element as pivot and partitions the given array around pivot. **O(n log n)** time complexity.
![Merge Sort Example](/images/mergesort.png "Merge Sort Example")
```bash
  # first implementation of merge sort, take array, first and the length
  public static void mergeSort(int[] a, int n) {
      if (n < 2) {
          return;
      }
      int mid = n / 2;
      int[] l = new int[mid];
      int[] r = new int[n - mid];

      for (int i = 0; i < mid; i++) {
          l[i] = a[i];
      }
      for (int i = mid; i < n; i++) {
          r[i - mid] = a[i];
      }
      mergeSort(l, mid);
      mergeSort(r, n - mid);

      merge(a, l, r, mid, n - mid);
  }
  # comparing each number from reserved subarray
  public static void merge(
    int[] a, int[] l, int[] r, int left, int right) {
  
      int i = 0, j = 0, k = 0;
      while (i < left && j < right) {
          if (l[i] <= r[j]) {
              a[k++] = l[i++];
          }
          else {
              a[k++] = r[j++];
          }
      }
      while (i < left) {
          a[k++] = l[i++];
      }
      while (j < right) {
          a[k++] = r[j++];
      }
  }
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
![Preorder Example](/images/preorder.png "Preorder Example")
```bash
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new LinkedList<>();
        if (root == null)
            return pre;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode tmp = stack.pop();
            pre.add(tmp.val);
            if (tmp.right != null)
                stack.push(tmp.right);
            if (tmp.left != null)
                stack.push(tmp.left);
        }
        return pre;
    }
```
Postorder Traversal
> Iterative method using stack
![postorder Example](/images/postorder.png "postorder Example")
```bash
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.empty()){
            root = stack.pop();
            list.add(0, root.val);
            if(root.left != null){
                stack.push(root.left)
            }
            if(root.right != null){
                stack.push(root.right);
            }
        }
        return list;
    }
```
Inorder Traversal
> Iterative method using stack
![inorder Example](/images/inorder.png "inorder Example")
```bash
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
```

Depth First Search
>A traversal algorithm that starts traversing the graph/tree from the root node to the last children **O(V+E) where V is the number of node and E is the edges** time complexity Using **Recursive**. 
![DFS Example](/images/DFS.png "DFS Example")
```bash
    public List<Integer> maxDepth(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode cur = root;

        while (cur != null || !stack.empty()) {
            while (cur != null) {
                stack.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }
```

Breadth First Search
>A traversal algorithm that search level by level **O(V+E) where V is the number of node and E is the edges** time complexity Using **Queue**. 
![BFS Example](/images/BFS.png "BFS Example")
```bash
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int depth = 0;
        Queue<Node>queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                Node currentNode = queue.poll();
                for(Node child: currentNode.children){
                    queue.offer(child);
                }
            }
            depth++;
        } 
        return depth++;
    }
```

