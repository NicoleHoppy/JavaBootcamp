### Week 3 / Section 02 — List Processing & Stream Operations

**Focus:** Practicing functional-style operations on collections using **streams**, filtering, mapping, and aggregation.  
This section demonstrates how to process lists efficiently and extract meaningful data.

**🎯 Key exercises:**
1. **Counting elements above a threshold** → counted how many integers in a list are greater than 10.
2. **Filtering strings by prefix** → displayed all words starting with the letter 'A'.
3. **Mapping values** → created a new list containing the squares of numbers from an existing list.
4. **Sorting strings alphabetically** → sorted a list of names in natural order.
5. **Finding the longest word** → determined the longest string in a list using `Optional`.
6. **Checking conditions** → verified whether any number in the list is greater than 100.
7. **Summing values with condition** → calculated the sum of all even numbers in a list.
8. **Transforming lists** → converted a list of words to a list of their lengths.
9. **Filtering unique elements** → displayed only unique numbers from a list with duplicates.
10. **Limiting results** → displayed the first three elements from a filtered list of numbers greater than 5.

**🏋️ Skills demonstrated:**
- Using **Java Streams API** for filtering, mapping, and aggregation.
- Applying functional operations such as `filter()`, `map()`, `distinct()`, `limit()`, and `reduce()`.
- Efficient list processing and transformation.
- Leveraging **Optional** to safely handle potentially empty results.
- Combining multiple stream operations to implement concise and readable solutions.  

**💻 Terminal output:**

```
Ex01: Count of numbers greater than 10: 3
Ex02: Words grouped by starting letter: {A=[Apple, Avocado], B=[Banana], C=[Cherry]}
Ex03: List of squares: [1, 4, 9, 16]
Ex04: Names sorted alphabetically: [Anna, John, Tom, Zoe]
Ex05: The longest word: Concurrency
Ex06: Is there any number greater than 100?: true
Ex07: Sum of even numbers: 12
Ex08: Length of each word: [2, 6, 3]
Ex09: Unique numbers: [1, 2, 3, 4]
Ex10: First 3 numbers greater than 5: [11, 8, 10]
```