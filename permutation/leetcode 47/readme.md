# 46. Permutations

## 🧩 Problem Statement

Given an array `nums` of distinct integers, return all possible permutations. The answer can be returned in any order.

---

## 💡 Intuition

To generate every possible permutation, we need to place each element in every possible position exactly once.

Backtracking is a natural choice because it allows us to:
- Choose an unused element.
- Add it to the current permutation.
- Recursively build the remaining positions.
- Undo the choice (backtrack) and try the next possibility.

This process explores every valid arrangement.

---

## 🚀 Approach

- Create an empty list to store all permutations.
- Maintain a `visited` array to track which elements have already been used.
- Start building the permutation from an empty list.
- At each recursive call:
  - Iterate through every element.
  - Skip elements that are already visited.
  - Mark the current element as visited.
  - Add it to the current permutation.
  - Recursively generate the remaining positions.
  - Backtrack by removing the last element and marking it as unvisited.
- Once the current permutation contains all elements, store it in the answer.

---

## 🌳 Backtracking Flow

```text
Start
│
├── Choose an unused element
│      │
│      ├── Mark as visited
│      ├── Add to current permutation
│      └── Recurse
│
├── If permutation size == n
│      └── Store answer
│
└── Backtrack
       ├── Remove last element
       └── Mark as unvisited
```

---

## ⏱️ Time Complexity

**Time Complexity:** **O(N × N!)**

### Explanation

- There are **N!** possible permutations.
- Copying each permutation into the answer takes **O(N)** time.

Therefore,

**Time Complexity = O(N × N!)**

---

## 📦 Space Complexity

### Auxiliary Space

- Visited array → **O(N)**
- Current permutation → **O(N)**
- Recursion stack → **O(N)**

**Auxiliary Space = O(N)**

### Output Space

Storing all permutations requires:

**O(N × N!)**

---

## ✅ Key Observations

- Every recursive call fixes one position of the permutation.
- Each element is used exactly once in a permutation.
- Backtracking efficiently explores all possible arrangements.
- The visited array prevents reusing the same element in a single permutation.

---

## 📚 Concepts Used

- Backtracking
- Recursion
- Depth First Search (DFS)
- Visited Array

---

## 🎯 Takeaway

The Permutations problem is a classic application of **Backtracking**. By recursively choosing unused elements, exploring every possible arrangement, and undoing each choice after recursion, we can efficiently generate all **N!** permutations of the given array.
