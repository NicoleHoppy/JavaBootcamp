### Week 3 / Section 01 — Equality, Hashing & Sorting

**Focus:** Understanding how objects are compared, how uniqueness is enforced in collections, and how to implement sorting using `Comparable`, `Comparator`, and utility methods.

**🎯 Key exercises:**
1. **Book equality with HashSet** → created a `Book` class (`title`, `author`, `year`) and implemented `equals()` and `hashCode()` so that two books are considered equal if they share the same title and author. Verified that duplicates are ignored in a `HashSet`.
2. **Student sorting by grades (Comparable)** → implemented `Comparable<Student>` to sort students in descending order of average grade using `Collections.sort()`.
3. **Student sorting by name (Comparator)** → defined a custom `Comparator<Student>` to sort students alphabetically by name.
4. **Employee uniqueness by ID** → created an `Employee` class with `id`, `name`, and `position`. Implemented `equals()` and `hashCode()` so uniqueness is based solely on `id`, ensuring no duplicate employees are added to a `HashSet`.
5. **Product multi-level sorting** → used a chain of comparators to sort `Product` objects first by ascending price, then by descending rating if prices are equal.
6. **Sorting integers** → read five integers from input, stored them in an array, and sorted them with `Arrays.sort()`.
7. **Sorting people by age** → built a `Person` class (`name`, `age`) and sorted a list of objects by ascending age using a `Comparator`.
8. **Alphabetical string sorting** → sorted a list of names (`String`) in alphabetical order.

**🏋️ Skills demonstrated:**
- Implementing **`equals()` and `hashCode()`** correctly to ensure consistent object equality and uniqueness in sets.
- Using the **Comparable interface** for natural ordering of objects.
- Applying **Comparator** for custom and multi-level sorting logic.
- Sorting both **primitive types** (arrays) and **objects** (lists).
- Understanding the role of **collections (`HashSet`, `List`)** in managing data with uniqueness and order.

**💻 Terminal output:**

```
Ex01BookComparer: 
  - Harry Potter    | by J.K. Rowling        
  - The Witcher     | by Andrzej Sapkowski   
  - Harry Potter    | by Anonymous           

Ex02Student: 
  - Sam Potter      | avg: 3,59
  - Kate Williams   | avg: 3,98
  - Tom Smith       | avg: 4,22
  - Peter Johnson   | avg: 4,82

Ex03Student: 
  - John Bale       | avg: 4,79
  - Martha Smith    | avg: 4,79
  - Mary Benn       | avg: 4,79
  - Sam Garry       | avg: 4,79

Ex04Employee: 
  - John Smith      | position: 3
  - Emily Johnson   | position: 5
  - Sarah Davis     | position: 4

Ex05Product: 
  - Phone           | price: 999,99 | rating: 8,00
  - Laptop          | price: 499,99 | rating: 7,00
  - Tablet          | price: 499,99 | rating: 5,00

Ex06IntegersSorter: 
  [1, 2, 4, 7, 8]

Ex07Person: 
  - Mary            | age: 21
  - Peter           | age: 23
  - Ann             | age: 25

Ex08NamesSorter: 
  Ann   Barry   Bob   Sam   Tom 
```