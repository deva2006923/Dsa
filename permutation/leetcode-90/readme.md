# 90. Subsets II

## 📝 Problem Statement

Given an integer array `nums` that **may contain duplicate elements**, return all possible subsets (the power set).

The solution set **must not contain duplicate subsets**. Return the solution in any order.

---

## 💡 Approach (Iterative with Duplicate Checking)

- Sort the input array so that duplicate elements become adjacent.
- Initialize the result with an empty subset.
- Traverse each element in the sorted array.
- For every existing subset:
  - Create a copy of the subset.
  - Add the current element to the copied subset.
  - Before inserting the new subset into the result, check whether it already exists.
  - Add the subset only if it is unique.
- Continue this process until all elements have been processed.

---

## 🔄 Algorithm

1. Sort the input array.
2. Initialize the result list with one empty subset.
3. Traverse every element in the array.
4. Store the current size of the result list.
5. For each existing subset:
   - Copy the subset.
   - Add the current element.
   - Check whether the new subset already exists.
   - If it does not exist, add it to the result.
6. Return all unique subsets.

---

## ✅ Time Complexity

- Generating subsets: **O(n × 2ⁿ)**
- Each `contains()` operation compares the new subset with existing subsets, which can take up to **O(2ⁿ × n)** in the worst case.

**Overall Time Complexity:** **O(n × 4ⁿ)** (worst case)

> The duplicate checking using `outer.contains()` makes this approach significantly slower than the optimal solution.

---

## ✅ Space Complexity

- The result stores up to **2ⁿ** unique subsets.
- Each subset may contain up to **n** elements.

**Overall Space Complexity:** **O(n × 2ⁿ)**

---

## 🎯 Key Concepts

- Iterative Approach
- Power Set
- Sorting
- Duplicate Handling
- ArrayList
- Simulation

---

## 📌 Note

This solution first sorts the input array so that duplicate elements appear together. While generating new subsets iteratively, it prevents duplicate subsets from being added by checking whether the newly formed subset already exists in the result list. Although this approach correctly produces unique subsets, the repeated use of `contains()` increases the overall time complexity compared to more optimized solutions.
