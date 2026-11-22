## i am going to format into table first

Problem | Difficulty,  |Core Technique / Usage
Two Sum,| Easy,        | Hash Map to store visited values and look up complements in O(n).
Best Time to Buy & Sell Stock,| Easy,Single Pass Tracking of the minimum price seen so far.
Maximum Subarray,|Medium,Kadane’s Algorithm to drop negative running sums and keep the max.
Product of Array Except Self,|Medium,Prefix & Suffix Products to compute results in O(n) without division.
Merge Intervals,|Medium,Sorting by start time and merging overlapping boundaries.
Container With Most Water,|Medium,Two Pointers starting at both ends and moving the shorter side inward.
Sliding Window Maximum,Hard,Monotonic Deque to track the largest element in a moving window in O(n).

# problems of the linked lists 

Problem,Difficulty,Core Technique / Usage
Reverse a Linked List,Easy,Rewire next pointers iteratively using prev and curr variables.
Detect a Cycle,Easy,Fast & Slow Pointers (Floyd's algorithm) moving at 2x and 1x speeds.
Merge Two Sorted Lists,Easy,Dummy Node + two pointers to stitch nodes in sorted order.
Remove N-th Node From End,Medium,Two Pointers spaced n nodes apart to find the target in one pass.
Reorder List,Medium,"Find the middle, reverse the second half, and merge both halves alternately."
LRU Cache,Medium,"Doubly Linked List + Hash Map for O(1) insertion, deletion, and lookup."
Merge K Sorted Lists,Hard,Min-Heap (Priority Queue) to always extract the smallest current node.
