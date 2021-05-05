
# **A guide for Java interview coding tools**

[Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)

# Approach & Strategy
- Print as much as necessary to get to the root of problems fast
- Print sequentially and be hypothesis driven
- Print at each level of logic to ensure values are as expected before introducing new code
- When you get stuck, work an example or two fully through your code (sequentially), focusing on the functional logic
- Think about what each variable would be. Does it make sense? Can you spot an issue?


# Iteration
When index is important
> `for(int i = 0; i <= 0; i++) {
> do something\
> }`

When only the item is important
> `for (Object obj: List<Object> list) {
>    // do something
> }`

Iterator<String> it = cars.iterator();
> while(it.hasNext()) 
> System.out.println(it.next());

# Sort
> Collections.sort(sortableList);

# ArrayList
`import java.util.*;`
List<String> stringList = new ArrayList<>();\
> stringList.size();
> stringList.contains();
> stringList.add(index);\
> stringList.set(index);
> stringList.remove(index);
> stringList.equals(otherList);

> int[] convertedList = Arrays.asList(stringList):
> int[] reversedList = ArrayUtils.reverse(convertedList) 

> List<String> tasks = new ArrayList<>();
> List<String> workers = new ArrayList<>();
> Collections.addAll(tasks, tList);
> Collections.addAll(workers, wList);`

# Strings & chars
> String.valueOf() to convert some data to a String
> String.equals() to compare strings (always prefer this to x.equals(y) since this will fail if x is null)
> Get value of a char: int a = Integer.parseInt(String.valueOf(ch)); 



# HashMap
HashMap<String, Integer> map = new HashMap<>();
> set.containsKey("x");
> set.put("x");
> set.get("x");
> set.remove("x");

# Set
HashSet<String> set = new HashSet<>();
> set.add("x");
> set.contains("x");
> set.remove("x");

# StringBuilder
StringBuilder sb = new StringBuilder();
> sb.toString().reverse();

# MinHeap
PriorityQueue<Integer>  minHeap = new PriorityQueue<Integer>();

# MaxHeap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
> pQueue.add(x);
> pQueue.peek();
> pQueue.poll();

# Deque (Used as Stack or Queue)
Deque<String> dq = new ArrayDeque<String>();
> dq.offerFirst();
> dq.offerLast();
> dq.peekFirst();
> dq.peekLast();
> dq.pollFirst();
> dq.pollLast();
> dq.contains();
> dq.size();

# Sliding Window Approach

# Dynamic Programming / Memoization
int col = object1.length;\
int row = object2.length;\
boolean dp[][] = new boolean[col][row];