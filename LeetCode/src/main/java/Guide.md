
# **A guide for Java interview coding tools**

[Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/)

# Iteration
When index is important
for(int i = 0; i <= 0; i++){
    // do something
}

When only the item is important
for (Object obj: List<Object> list) {
    // do something
}

# Sliding Window

# Dynamic Programming / Memoization
int col = object1.length;
int row = object2.length;
boolean dp[][] = new boolean[col][row];


# Sort
- Collections.sort(sortableList);

## ArrayList
List<String> stringList = new ArrayList<>();
- stringList.add(index);
- stringList.set(index);
- stringList.remove(index);
- stringList.size();

### Arrays.asList(int[]) causes issue, tf:

- List<String> tasks = new ArrayList<>();
- List<String> workers = new ArrayList<>();
- Collections.addAll(tasks, tList);
- Collections.addAll(workers, wList);`

## Strings 
int a = Integer.parseInt(String.valueOf(ch)); 

## HashMap
HashMap<String, Integer> map = new HashMap<>();
- set.put("x");
- set.get("x");
- set.remove("x");

## Set
HashSet<String> set = new HashSet<>();
- set.add("x");
- set.contains("x");
- set.remove("x");

## Iterator
Iterator<String> it = cars.iterator();
- while(it.hasNext()) 
- System.out.println(it.next());

## StringBuilder
StringBuilder sb = new StringBuilder();
- sb.toString().reverse();

## MinHeap
PriorityQueue<Integer>  minHeap = new PriorityQueue<Integer>();

## MaxHeap
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
- pQueue.add(x);
- pQueue.peek();
- pQueue.poll();

## Deque (Used as Stack or Queue)
Deque<String> dq = new ArrayDeque<String>();
- dq.offerFirst();
- dq.offerLast();
- dq.peekFirst();
- dq.peekLast();
- dq.pollFirst();
- dq.pollLast();
- dq.contains();
- dq.size();