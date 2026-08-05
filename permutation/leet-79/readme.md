# LeetCode 79 – Word Search

## Problem

Given an `m × n` grid of characters `board` and a string `word`, return `true` if the word exists in the grid.

The word can be formed by sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.

- A cell can be used **only once** in a single path.

---

## Approach – Backtracking (Grid Traversal)

This problem follows the **Move in Different Directions (Grid Model)**.

We start searching from **every cell** in the board.

If a cell matches the first character of the word, we perform a DFS (Backtracking).

During recursion:

- Check whether the current character matches.
- Mark the current cell as visited.
- Explore all four directions:
  - Right
  - Left
  - Up
  - Down
- Restore the cell after exploring all paths (Backtracking).

If every character of the word is matched, return `true`.

---

## Algorithm

1. Traverse every cell in the board.
2. Start DFS from each cell.
3. If all characters of the word are matched:
   - Return `true`.
4. If the current position is outside the board:
   - Return `false`.
5. If the current character does not match:
   - Return `false`.
6. Temporarily mark the current cell as visited.
7. Explore all four directions recursively.
8. Restore the original character while backtracking.
9. If no path forms the word, return `false`.

---

## Dry Run

### Input

```
Board

A B C E
S F C S
A D E E

Word = "ABCCED"
```

Start searching from every cell.

Starting from the first `A`:

```
A → B → C
        |
        C
        |
        E
        |
        D
```

All characters are matched.

Output

```
true
```

---

## Why do we start from every cell?

The first character of the word can appear anywhere in the board.

Example:

```
Board

C A A
A A A
B C D

Word = "AAB"
```

The correct starting position is **not** `(0,0)`.

Therefore, every cell must be considered as a possible starting point.

---

## Why do we mark a cell as visited?

A cell cannot be reused while forming the same word.

Example:

```
A B

Word = "ABA"
```

Without marking the first `A` as visited, it could be used again, producing an invalid path.

To prevent this, the current cell is temporarily replaced with a special character (such as `@`).

---

## Why do we restore the cell?

After exploring one path, other starting positions or paths should still be able to use that cell.

Example:

```
A B
C D
```

If `B` remains marked as visited permanently, future searches cannot use it even when it belongs to a valid path.

Restoring the original character is the **Backtracking** step.

---

## Directions Explored

At every matching cell, we recursively move in four directions:

- Right
- Left
- Up
- Down

Every possible path is explored until either the word is found or the path becomes invalid.

---

## Complexity Analysis

**Time Complexity:** `O(m × n × 4^L)`

Where:

- `m` = Number of rows
- `n` = Number of columns
- `L` = Length of the word

Each cell can be a starting point, and each recursive call explores up to four directions.

**Space Complexity:** `O(L)`

The recursion stack can grow up to the length of the word.

---

## Key Takeaways

- **Pattern:** Backtracking
- **Model:** Move in Different Directions (Grid Model)
- Start searching from every cell.
- Match one character at a time.
- Mark the current cell as visited.
- Explore four directions recursively.
- Restore the original character while backtracking.
- **Difficulty:** Medium
- **LeetCode:** 79 – Word Search
