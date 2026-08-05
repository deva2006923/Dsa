# LeetCode 40 – Combination Sum II

## Problem

Given a collection of candidate numbers `candidates` (which may contain duplicates) and a target integer `target`, return all **unique combinations** where the chosen numbers sum to `target`.

- Each number can be used **only once**.
- The solution set must not contain duplicate combinations.

---

## Approach – Backtracking (Pick or Not Pick)

This problem follows the **Decision Model (Pick or Not Pick)**.

Unlike Combination Sum I, each element can be used **only once**, so after picking an element, we move to the **next index**.

Since the array may contain duplicate values, we first **sort the array**. Sorting helps us skip duplicate elements while exploring the "Not Pick" branch, ensuring that duplicate combinations are not generated.

---

## Algorithm

1. Sort the input array.
2. Start from index `0` with sum `0`.
3. If the current sum equals the target:
   - Store the current combination.
4. If the current sum exceeds the target or all elements have been processed:
   - Stop exploring this path.
5. Pick the current element:
   - Add it to the current combination.
   - Move to the next index because each element can be used only once.
6. Backtrack:
   - Remove the last added element.
7. Before exploring the "Not Pick" branch:
   - Skip all consecutive duplicate elements.
8. Continue recursion with the next distinct element.

---

## Dry Run

### Input

```
candidates = [10,1,2,7,6,1,5]
target = 8
```

After sorting:

```
[1,1,2,5,6,7,10]
```

```
helper(0,0)

                 []
             /          \
          Pick1       Skip duplicates
           [1]
         /      \
     Pick1      Skip1
    [1,1]
      |
    Pick6
   [1,1,6] → 8 ✅

Backtrack

[1]
 |
Pick7
[1,7] → 8 ✅

Backtrack

[]
 |
Skip duplicate 1
 |
Pick2
[2]
 |
Pick6
[2,6] → 8 ✅
```

### Output

```
[
  [1,1,6],
  [1,2,5],
  [1,7],
  [2,6]
]
```

---

## Why do we move to the next index after picking?

Each candidate can be used **only once**.

After choosing an element, we move to the next index so that the same element is not selected again.

Example:

```
Current index = 2

Pick candidates[2]

Next recursive call starts from index = 3
```

---

## Why do we skip duplicate elements?

After exploring the "Pick" branch, while exploring the "Not Pick" branch, consecutive duplicate values are skipped.

Example:

```
Sorted array:

[1,1,1,2]
```

If we skip only the first `1`, the second and third `1` would generate the same combinations again.

By skipping all consecutive duplicates, each unique combination is generated only once.

---

## Backtracking

After exploring the "Pick" branch, the last inserted element is removed before exploring the "Not Pick" branch.

This restores the previous state of the current combination and allows other recursive branches to be explored correctly.

---

## Complexity Analysis

**Time Complexity:** Exponential in the worst case, approximately **O(2ⁿ)**

**Space Complexity:** **O(n)** (Recursion depth excluding the output list)

---

## Key Takeaways

- **Pattern:** Backtracking
- **Model:** Pick or Not Pick (Decision Model)
- **Sort the array** to handle duplicates efficiently.
- **Pick:** Move to the next index because each element can be used only once.
- **Not Pick:** Skip all consecutive duplicate elements before moving forward.
- **Backtracking:** Remove the last chosen element before exploring another branch.
- **Difficulty:** Medium
- **LeetCode:** 40 – Combination Sum II
