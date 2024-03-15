# Test Plan for BalancedBrackets Class

## Test Cases added

1. **Only brackets return true:**
   - Input: "[]"
   - Expected Output: true

2. **Nested brackets are allowed:**
   - Input: "[[[]]]"
   - Expected Output: true

3. **Brackets must follow open close order:**
   - Input: "[[[]]"
   - Expected Output: false

4. **Empty input should return true:**
   - Input: ""
   - Expected Output: true

5. **Single pair of brackets:**
   - Input: "()"
   - Expected Output: true

6. **Multiple pairs of brackets:**
   - Input: "({})"
   - Expected Output: true

7. **Mismatched brackets:**
   - Input: "{[)}"
   - Expected Output: false

8. **Mixed characters with brackets:**
   - Input: "Hola[Hola]Hola{Hola}Hola(Hola)Hola"
   - Expected Output: true

9. **Brackets with other characters in between:**
   - Input: "[Hola{Hola}Hola]"
   - Expected Output: true

10. **Longer expression with balanced brackets:**
    - Input: "((())){{{}}}[[]]"
    - Expected Output: true

11. **Longer expression with mismatched brackets:**
    - Input: "((())){{}[]}[[[]]"
    - Expected Output: false

12. **Combination of brackets and characters:**
    - Input: "{Hola[Hola]Hola}Hola"
    - Expected Output: true

