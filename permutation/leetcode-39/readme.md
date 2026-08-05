# LeetCode 39 – Combination Sum

## Problem
Given an array of **distinct integers** `candidates` and a target integer `target`, return all **unique combinations** where the chosen numbers sum to `target`.

- You may choose the **same number unlimited times**.
- The order of numbers in a combination does not matter.

---

## Approach – Backtracking (Pick or Not Pick)

This problem follows the **Decision Model (Pick or Not Pick)**.

At every index, we have two choices:

1. **Pick** the current element.
   - Add it to the current combination.
   - Since the same element can be reused, stay at the **same index**.
2. **Do Not Pick**
   - Skip the current element.
   - Move to the next index.

We continue exploring both choices until we either:
- Reach the target (valid combination).
- Exceed the target.
- Reach the end of the array.

---

## Algorithm

1. Start from index `0` with sum `0`.
2. If the current sum equals the target:
   - Store the current combination.
3. If the current sum exceeds the target or all elements have been processed:
   - Stop exploring this path.
4. Pick the current element:
   - Add it to the current combination.
   - Stay at the same index since the element can be reused.
5. Backtrack:
   - Remove the last added element.
6. Skip the current element:
   - Move to the next index.

---

## Dry Run

### Input

```
candidates = [2,3,6,7]
target = 7
```

```
helper(0,0)

                []
           /             \
         Pick2         Skip2
         [2]             []
      /        \       /      \
   Pick2    Skip2   Pick3   Skip3
   [2,2]      []     [3]      ...
   /   \
Pick2 Skip2
[2,2,2]
  |
Pick2
[2,2,2,2] → sum > 7 ❌

Backtrack

[2,2]
   |
Skip2 → index=1

[2,2,3] → sum = 7 ✅
```

Another successful path:

```
[]
 |
Skip2
 |
Skip3
 |
Skip6
 |
Pick7

[7] → sum = 7 ✅
```

### Output

```
[
  [2,2,3],
  [7]
]
```

---

## Why do we stay at the same index after picking?

When we choose an element, we **do not move to the next index** because each candidate can be used **multiple times**.

Example:

```
2 → 2 → 2 → 2
```

If we moved to the next index after picking, each element could be used only once, which would solve a different problem (**Combination Sum II**).

---

## Why do we move to the next index after skipping?

If we decide **not** to include the current element, we move to the next index and continue exploring the remaining candidates.

This ensures every possible combination is explored exactly once.

---

## Backtracking

After exploring the "pick" path, we remove the last inserted element before exploring the "not pick" path.

This restores the list to its previous state so that other recursive branches are not affected.

---

## Complexity Analysis

**Time Complexity:** `O(2^(target / minimumCandidate))` (Exponential)

**Space Complexity:** `O(target / minimumCandidate)` (Recursion depth)

---

## Key Takeaways

- **Pattern:** Backtracking
- **Model:** Pick or Not Pick (Decision Model)
- **Pick:** Stay at the same index because elements can be reused.
- **Not Pick:** Move to the next index.
- **Backtracking:** Remove the last chosen element before exploring another branch.
- **Difficulty:** Medium
- **LeetCode:** 39 – Combination Sum
