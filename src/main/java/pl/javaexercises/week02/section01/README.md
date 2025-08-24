### Week 2 / Section 01 — String Manipulation

**Focus:** Practicing operations on `String` objects — transformations, searching, counting, and text filtering.  
This section demonstrates my ability to solve practical text-processing problems using loops, conditionals, and Java’s built-in methods.

**🎯 Key exercises:**
1. **Character replacement** → replaced special characters (`@` → `(at)`, `#` → `(hash)`) in a given string.
2. **Palindrome check** → verified whether a text is a palindrome, ignoring case sensitivity and whitespace.
3. **Vowel counter** → counted vowels (`a, e, i, o, u, y`) in a string, regardless of case.
4. **Initials generator** → extracted initials from full names, e.g., `"Jan Kowalski"` → `"J.K."`.
5. **Alternating case** → converted every second character in a string to uppercase, creating alternating letter patterns.
6. **Word counter** → counted words in a text based on spaces, tabs, and newlines.
7. **Duplicate letter remover** → removed repeating characters while keeping their first occurrence.
8. **Digit-to-word converter** → transformed digits (`0–9`) in text into word equivalents, e.g., `"2"` → `"two"`.
9. **Text censoring** → replaced forbidden words from a given list with `***`.

**🏋️ Skills demonstrated:**
- Applying **loops, conditionals, and switch/Map** to transform strings.
- Using built-in `String` methods (`toLowerCase`, `replace`, `split`, etc.).
- Combining iteration and conditions to implement **counters, filters, and transformations**.
- Designing small but practical utilities for real-world text-processing scenarios.


**💻 Terminal output:**

```
Class name: Ex01CharReplacer 
Input: nobody@mail.com ###, Result: nobody(at)mail.com (hash)(hash)(hash)
Input: @somebody @nobody @anybody, Result: (at)somebody (at)nobody (at)anybody

Class name: Ex02PalindromeCheck 
Input: Madam, Result: true
Input: cat, Result: false

Class name: Ex03VowelCounter 
Input: I have a cat, Result: There are 5 vowels in the sentence
Input: Hello world, Result: There are 3 vowels in the sentence

Class name: Ex04InitialsGenerator 
Input: Tom Smith, Result: The initials for Tom Smith are: T.S.
Input: Kate Jackson, Result: The initials for Kate Jackson are: K.J.

Class name: Ex05CaseConverter 
Input: programming, Result: pRoGrAmMiNg
Input: HELLO, Result: hElLo

Class name: Ex06WordCounter 
Input: There are no words, Result: 4
Input: Hello world, Result: 2

Class name: Ex07DuplicateLetterRemover 
Input: programming, Result: [p, r, o, g, a, m, i, n]
Input: crochet, Result: [c, r, o, h, e, t]

Class name: Ex08DigitWordConverter 
Input: I have 1 cat and 3 dogs, Result: I have one cat and three dogs
Input: My mum has 4 cats, Result: My mum has four cats

Class name: Ex09TextCensor 
Input: I am tired as fuck, Result: I am tired as ***
Input: It's so damn hot, Result: It's so *** hot
```