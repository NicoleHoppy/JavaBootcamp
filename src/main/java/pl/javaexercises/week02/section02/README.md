Terminal output: 

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