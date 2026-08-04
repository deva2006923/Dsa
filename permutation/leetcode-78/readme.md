# 78. Subsets

## 📝 Problem Statement

Given an integer array `nums` of **unique elements**, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

---

## 💡 Approach (Iterative)

- Start with an empty subset.
- For each element in the input array:
  - Determine the current number of subsets.
  - Duplicate each existing subset.
  - Add the current element to the duplicated subset.
  - Store the newly formed subset back into the result list.
- Repeat this process for every element.
- After processing all elements, the result contains every possible subset.

---

## 🔄 Algorithm

1. Initialize the result list with one empty subset.
2. Traverse each element in the input array.
3. Store the current size of the result list.
4. For every existing subset:
   - Create a copy of the subset.
   - Add the current element to it.
   - Append the new subset to the result list.
5. Continue until all elements have been processed.
6. Return the complete list of subsets.

---

## ✅ Time Complexity

- For every element, all existing subsets are duplicated.
- Total number of subsets generated = **2ⁿ**.
- Copying each subset takes up to **O(n)** time.

**Overall Time Complexity:** **O(n × 2ⁿ)**

---

## ✅ Space Complexity

- The result stores **2ⁿ** subsets.
- Each subset can contain up to **n** elements.

**Overall Space Complexity:** **O(n × 2ⁿ)**

---

## 🎯 Key Concepts

- Iterative Approach
- Power Set
- Dynamic Subset Generation
- ArrayList
- Simulation

---

## 📌 Note

This solution uses an **iterative subset generation** technique. It begins with the empty subset and progressively builds larger subsets by duplicating all existing subsets and including the current element. Since every element either belongs to a subset or does not, the total number of generated subsets is **2ⁿ**, which represents the power set of the given array.
