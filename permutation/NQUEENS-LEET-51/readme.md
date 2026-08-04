# 51. N-Queens

## 📝 Problem Statement

Given an integer `n`, return all distinct solutions to the `n`-Queens puzzle.

Each solution contains a unique board configuration where:

- `'Q'` represents a queen.
- `'.'` represents an empty space.

The solution must ensure that no two queens attack each other. This means:

- No two queens can share the same row.
- No two queens can share the same column.
- No two queens can share the same diagonal.

---

## 💡 Approach (Backtracking)

- Use **Backtracking** to place one queen in each row.
- Represent the chessboard using a **boolean matrix**, where `true` indicates the presence of a queen.
- Start placing queens row by row.
- For every column in the current row:
  - Place a queen temporarily.
  - Check whether the placement is valid by verifying:
    - Upper-left diagonal
    - Upper-right diagonal
    - Same column
  - If the position is safe, recursively place queens in the next row.
  - After returning from recursion, remove the queen (backtrack) and try the next column.
- Once queens are successfully placed in all rows, convert the board into the required string representation and store it.

---

## 🔄 Algorithm

1. Initialize an `n × n` boolean board.
2. Start backtracking from the first row.
3. For each column in the current row:
   - Place a queen.
   - Check whether the queen is safe.
   - If safe:
     - Recursively solve for the next row.
   - Remove the queen (backtrack).
4. When all rows are processed:
   - Convert the board into a list of strings.
   - Add the configuration to the final answer.
5. Return all valid board configurations.

---

## ✅ Time Complexity

- In the worst case, the algorithm explores all possible queen placements using backtracking.

**Time Complexity:** **O(N!)**

> The pruning performed by checking valid queen positions significantly reduces the number of explored states compared to trying all possible board configurations.

---

## ✅ Space Complexity

- Boolean board: **O(N²)**
- Recursion stack: **O(N)**
- Result list: Depends on the number of valid solutions.

**Overall Auxiliary Space:** **O(N²)**

---

## 🎯 Key Concepts

- Backtracking
- Recursion
- Matrix Representation
- Diagonal Traversal
- Constraint Checking
- Depth First Search (DFS)

---

## 📌 Note

This solution places queens **row by row** using backtracking. Before moving to the next row, it verifies whether the current queen placement is safe by checking the **upper-left diagonal**, **upper-right diagonal**, and **same column**. Whenever a valid configuration is found, the board is converted into the required string format and added to the final list of solutions.
