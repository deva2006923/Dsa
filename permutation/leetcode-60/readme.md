# 60. Permutation Sequence

## 📝 Problem Statement

Given two integers `n` and `k`, return the `kᵗʰ` permutation sequence of the numbers from `1` to `n`.

A permutation is a rearrangement of all the elements of a set.

---

## 💡 Approach (Backtracking)

- Use **Backtracking** to generate all possible permutations of the numbers from `1` to `n`.
- Maintain a **visited boolean array** to ensure each number is used only once in a permutation.
- Build the current permutation using a temporary list.
- Once a permutation of length `n` is formed, store it in the result list.
- After generating all permutations, access the `(k-1)`th permutation from the list (0-based indexing).
- Convert that permutation into a string and return it as the answer.

---

## 🔄 Algorithm

1. Initialize an empty list to store all permutations.
2. Create a visited array of size `n`.
3. Start backtracking with an empty temporary list.
4. For every number from `1` to `n`:
   - Skip if it has already been used.
   - Mark it as visited.
   - Add it to the current permutation.
   - Recursively generate the remaining permutation.
   - Backtrack by removing the last element and marking it as unvisited.
5. Store every complete permutation.
6. Retrieve the `(k-1)`th permutation.
7. Convert it into a string and return it.

---

## ✅ Time Complexity

- Generating all permutations: **O(n × n!)**
- Retrieving the `kᵗʰ` permutation: **O(n)**

**Overall Time Complexity:** **O(n × n!)**

---

## ✅ Space Complexity

- Visited array: **O(n)**
- Recursion stack: **O(n)**
- Storing all permutations: **O(n × n!)**

**Overall Space Complexity:** **O(n × n!)**

---

## 🎯 Key Concepts

- Backtracking
- Recursion
- Visited Array
- Permutations
- DFS (Depth First Search)

---

## 📌 Note

This solution generates **all possible permutations** using backtracking and stores them before retrieving the required `kᵗʰ` permutation. While this approach correctly solves the problem, it is not the most optimal for larger values of `n` because every permutation is generated and stored.
