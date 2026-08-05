# Letter Combinations of a Phone Number

## Overview

This project generates all possible letter combinations for a given sequence of digits based on the traditional telephone keypad mapping. It uses a recursive backtracking approach to explore every valid combination.

## Features

* Accepts a string containing digits.
* Generates all possible letter combinations.
* Uses recursion (backtracking) for efficient traversal.
* Returns the combinations as a list of strings.

## Approach

1. Read the input digit string.
2. Process one digit at a time.
3. Determine the corresponding range of letters for the current digit.
4. Append each possible letter to the current combination.
5. Recursively process the remaining digits.
6. When all digits are processed, store the completed combination in the result list.

## Algorithm

* **Base Case:**
  If there are no digits left to process, add the current combination to the answer list.

* **Recursive Case:**

  * Find the letters mapped to the current digit.
  * Iterate through each mapped letter.
  * Append the letter to the current partial combination.
  * Recursively process the remaining digits.

## Time Complexity

* **O(4ⁿ)** in the worst case, where **n** is the number of digits.
* Digits **7** and **9** have four possible letters, while the others have three.

## Space Complexity

* **O(n)** for the recursion stack.
* Additional space is required to store all generated combinations.

## Example

**Input**

```
digits = "23"
```

**Output**

```
[ad, ae, af, bd, be, bf, cd, ce, cf]
```

## Concepts Used

* Recursion
* Backtracking
* String Manipulation
* Lists (ArrayList)
* Character Arithmetic

## Applications

* Phone keypad word generation
* Dictionary-based search
* Predictive text systems
* Combinatorial problem solving

## Author

Developed as a Java implementation of the Phone Letter Combinations problem using recursion and backtracking.
