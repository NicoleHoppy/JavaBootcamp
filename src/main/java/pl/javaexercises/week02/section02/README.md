### Week 2 / Section 02 — Validation & Parsing

**Focus:** Building utility methods for validating and parsing user input.  
This section demonstrates how to apply **regular expressions, string operations, and conditional logic** to ensure data correctness and extract structured information.

**🎯 Key exercises:**
1. **Task description validation** → ensured the description:
    - has between 5 and 100 characters,
    - contains only letters, digits, spaces, dots, and commas,
    - does not start or end with a space.
2. **Email validation** → checked strings against a regular expression for email format (`[a-zA-Z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}`).
3. **Password validation** → verified that a password is at least 8 characters long, includes a digit, an uppercase letter, and a special character.
4. **String parsing** → split structured strings like `"name:surname:age"` into individual fields.
5. **Word counter** → counted words in a task description.
6. **Character frequency** → counted occurrences of a given character (e.g., number of commas in a text).

**🏋️ Skills demonstrated:**
- Applying **regular expressions** for input validation.
- Using `String.split`, `matches`, and iteration for parsing and checking rules.
- Creating **robust validation utilities** for descriptions, emails, and passwords.
- Performing text analysis (word count, character frequency).
- Gaining experience in **data sanitization and verification**, essential for real-world applications.

**💻 Terminal output:**

```
Class name: Ex01DescriptionValidator 
Input: Update login page design, Result: true
Input:  Fix user login bug, Result: false

Class name: Ex02EmailValidator 
Input: email@mail.com, Result: true
Input: somebodymail.com, Result: false

Class name: Ex03PasswordValidator 
Input: P@ssword123, Result: true
Input: mybirthdayday0101, Result: false

Class name: Ex04StringParser 
Input: John:Smith:38, Result: John, Smith, 38
Input: Steve:Norris25, Result: This name doesn't match the pattern! Please, correct it.

Class name: Ex05WordCounterInDescription 
Input:  Design a text parser that validates input format., Result: This description contains 8 words.
Input: Exercise now!, Result: This description contains 2 words.

Class name: Ex06CharCounter 
Input: I have a dog, Result: The occurrence of characters is as follows: { =3, a=2, d=1, e=1, v=1, g=1, h=1, I=1, o=1}
Input: Here I am, Result: The occurrence of characters is as follows: { =2, a=1, r=1, e=2, H=1, I=1, m=1}
```