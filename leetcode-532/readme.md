# 📌 LeetCode 523 - Continuous Subarray Sum

## 🔗 Problem

Given an integer array `nums` and an integer `k`, return `true` if the array contains a **continuous subarray** of size **at least 2** whose sum is a multiple of `k`. Otherwise, return `false`.

---

## 💡 Approach

This solution uses the **Prefix Sum + HashMap** technique.

### Key Observation

If two prefix sums have the same remainder when divided by `k`, then the sum of the elements between them is divisible by `k`.

Mathematically,

```
PrefixSum[j] % k == PrefixSum[i] % k
```

Then,

```
(PrefixSum[j] - PrefixSum[i]) % k == 0
```

which means the subarray between these indices has a sum that is a multiple of `k`.

---

## 🚀 Algorithm

1. Initialize a running prefix sum.
2. Create a `HashMap` to store the first occurrence of each remainder.
3. Insert `(0, -1)` into the map.
   - This handles cases where the valid subarray starts from index `0`.
4. Traverse the array:
   - Add the current element to the prefix sum.
   - Compute `remainder = prefixSum % k`.
   - If the remainder already exists:
     - Check whether the distance between the current index and the stored index is at least `2`.
     - If yes, return `true`.
   - Otherwise, store the remainder with its index.
5. If no valid subarray is found, return `false`.

---

## 💻 Java Solution

  CODE IS IN THE SAME FILE
---

## 🔍 Dry Run

### Input

```text
nums = [23, 2, 4, 6, 7]
k = 6
```

| Index | Number | Prefix Sum | Remainder | HashMap | Action |
|------:|--------:|-----------:|----------:|---------|--------|
| -1 | - | 0 | 0 | {0:-1} | Initialize |
| 0 | 23 | 23 | 5 | {0:-1,5:0} | Store remainder |
| 1 | 2 | 25 | 1 | {0:-1,5:0,1:1} | Store remainder |
| 2 | 4 | 29 | 5 | remainder exists | Distance = 2 → ✅ Return true |

---

## ⏱️ Complexity Analysis

| Operation | Complexity |
|-----------|------------|
| Time | **O(n)** |
| Space | **O(min(n, k))** |

---

## 🧠 Why `map.put(0, -1)`?

Initially,

```
map.put(0, -1);
```

This allows us to detect subarrays that start from index `0`.

Example:

```
nums = [6, 6]
k = 6

Prefix Sum:
6  -> remainder 0
12 -> remainder 0
```

When we reach index `1`,

```
1 - (-1) = 2
```

which satisfies the required subarray length.

Without storing `(0, -1)`, this case would be missed.

---

## ✅ Key Concepts

- Prefix Sum
- HashMap
- Modulo Arithmetic
- First Occurrence Storage
- O(n) Optimization

---

## 🏷️ Tags

`Array` `HashMap` `Prefix Sum` `Math`

---

⭐ **Efficient Solution:** Uses a HashMap to store the first occurrence of each remainder, reducing the brute-force **O(n²)** approach to **O(n)**.
