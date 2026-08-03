# 974. Subarray Sums Divisible by K

## 🔗 Problem Link
https://leetcode.com/problems/subarray-sums-divisible-by-k/

## 📌 Problem Statement

Given an integer array `nums` and an integer `k`, return the number of non-empty subarrays whose sum is divisible by `k`.

A subarray is a contiguous part of an array.

### Example

**Input**
```text
nums = [4,5,0,-2,-3,1], k = 5
```

**Output**
```text
7
```

---

# 💡 Intuition

A subarray sum is divisible by `k` if:

```text
(PrefixSum[j] - PrefixSum[i]) % k == 0
```

This can be rewritten as:

```text
PrefixSum[j] % k == PrefixSum[i] % k
```

This means:

- Compute the prefix sum while traversing the array.
- Find its remainder when divided by `k`.
- If the same remainder has appeared before, then every previous occurrence forms a valid subarray ending at the current index.

To efficiently count previous occurrences of each remainder, we use a **HashMap**.

---

# 🧠 Algorithm

1. Initialize:
   - `sum = 0`
   - `count = 0`
   - HashMap to store frequency of remainders.
2. Store `(0 → 1)` initially.
   - This handles subarrays starting from index `0`.
3. Traverse the array:
   - Add current element to prefix sum.
   - Compute remainder:
     ```java
     rem = sum % k;
     ```
   - If remainder is negative:
     ```java
     rem += k;
     ```
   - Add frequency of this remainder to the answer.
   - Increase the frequency of the remainder.
4. Return the count.

---

# 🔍 Dry Run

### Input

```text
nums = [4,5,0,-2,-3,1]
k = 5
```

| Element | Prefix Sum | Remainder | Previous Frequency | Count |
|---------:|-----------:|----------:|-------------------:|------:|
| 4 | 4 | 4 | 0 | 0 |
| 5 | 9 | 4 | 1 | 1 |
| 0 | 9 | 4 | 2 | 3 |
| -2 | 7 | 2 | 0 | 3 |
| -3 | 4 | 4 | 3 | 6 |
| 1 | 5 | 0 | 1 | 7 |

Final Answer:

```text
7
```

---

# ⚠️ Why Handle Negative Remainders?

In Java,

```java
-2 % 5 = -2
```

But mathematically,

```text
-2 ≡ 3 (mod 5)
```

So we convert negative remainders into positive ones:

```java
if(rem < 0)
    rem += k;
```

Example:

```text
sum = -2
k = 5

Java:
-2 % 5 = -2

After correction:
-2 + 5 = 3
```

Now all equivalent remainders are stored using the same key in the HashMap.

---

# ✅ Java Solution

REFER THE BELOW FILE...

---

# ⏱️ Complexity Analysis

### Time Complexity

```
O(n)
```

- Single traversal of the array.
- HashMap operations take **O(1)** on average.

### Space Complexity

```
O(min(n, k))
```

- The HashMap stores frequencies of prefix sum remainders.
- At most `k` different remainders (`0` to `k-1`) are possible, though it can also be bounded by `n`.

---

# 🔑 Key Takeaways

- Use **Prefix Sum** to compute cumulative sums efficiently.
- Two prefix sums with the **same remainder** indicate the subarray between them is divisible by `k`.
- A **HashMap** stores the frequency of each remainder.
- Initialize `map.put(0, 1)` to count subarrays that start from index `0`.
- Convert negative remainders to positive using `rem += k` to ensure consistent remainder mapping.

---

⭐ If you found this explanation helpful, consider giving the repository a **Star**!
