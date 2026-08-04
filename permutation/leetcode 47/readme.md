# 47. Permutations II

## 🧩 Problem Statement

Given an integer array `nums` that may contain duplicate elements, return all possible **unique permutations**. The solution set must not contain duplicate permutations, and the order of the output does not matter.

---

## 💡 Intuition

The standard permutation algorithm generates every possible arrangement by choosing one unused element at each position. However, when duplicate values exist, the same permutation can be generated multiple times.

To solve this problem efficiently, we need to ensure that duplicate values are not selected in a way that produces identical recursive paths. This pruning allows us to generate only unique permutations.

---

## 🚀 Approach

- Sort the input array so duplicate elements become adjacent.
- Maintain a `visited` array to track which indices are already used in the current permutation.
- Traverse every element:
  - Skip elements that are already used.
  - Skip duplicate elements if the previous identical element has not been used in the current recursive level.
- Add the selected element to the current permutation.
- Recursively generate the remaining positions.
- Once the permutation reaches the array size, store it in the answer.
- Backtrack by removing the last element and marking it as unused.

---

## 🌳 Backtracking Flow

```text
Start
│
├── Choose an unused element
│      │
│      ├── Skip if already visited
│      ├── Skip duplicate branch
│      ├── Mark visited
│      ├── Add to current permutation
│      └── Recurse
│
├── If permutation size == n
│      └── Store answer
│
└── Backtrack
       ├── Remove last element
       └── Mark unvisited
```

---

## ⏱️ Time Complexity

**Worst Case:** `O(N × N!)`

### Explanation

- There can be at most **N!** unique permutations when all elements are distinct.
- Copying each permutation into the answer requires **O(N)** time.

Therefore,

**Time Complexity = O(N × N!)**

If duplicate elements exist, the actual number of generated permutations is smaller.

---

## 📦 Space Complexity

### Auxiliary Space

- Visited array → **O(N)**
- Current permutation → **O(N)**
- Recursion stack → **O(N)**

**Auxiliary Space = O(N)**

### Output Space

Storing all unique permutations requires:

**O(U × N)**

where **U** is the number of unique permutations.

---

## ✅ Key Observations

- Backtracking explores every possible ordering.
- A visited array ensures each index is used only once in a permutation.
- Sorting groups duplicate values together.
- Duplicate pruning prevents generating identical permutations.
- Every recursive call fixes one position of the final permutation.

---

## 📚 Concepts Used

- Backtracking
- Recursion
- Depth First Search (DFS)
- Visited Array
- Duplicate Pruning

---

## 🎯 Takeaway

Permutations II is an extension of the classic permutation problem. The challenge is not generating permutations but eliminating duplicate recursive paths. By combining **sorting**, a **visited array**, and **duplicate pruning**, we can efficiently generate every unique permutation exactly once.
