# SSMU MiniCourses - Introduction to Python

## Lists and loops I

### A. Creating and manipulating lists

#### Short questions

Determine if each of the following is true or false, and in either case, explain your reasoning.

- Lists in Python, just like arrays in Java, are __fixed in length__.
- List indexing is a __1-based system__.
- `myList = []` and `myList = list()` are two __equivalent__ ways to create an empty list.
- You can remove an item from a list using its __index__ and the function `remove(...)`.
- `pop(...)` will remove the __first__ element from the list and print it.
- You can provide an index to `append(...)` to add a given element at a given position inside a list.

#### Code analysis questions

Given the snippet of code below, what happens after each of the following statements are executed?

- `listA.append("Lucy")
- `listA.pop(0)`
- `print(listA[2])`
- `listB.append(listC.pop())`
- `listC.append(listB[listA[4]])`
- `print(listA.pop())`

```python
listA = [1,2,3,4,5,6]
listB = [7,6,5,4,3,2]
listC = ["Apple", "Sauce", "Pizza"]
```

### B. For loops

#### Short questions

Determine if each of the following is true or false, and in either case, explain your reasoning.

- Python provides 4 built-in types of loops: __for loops__, __while loops__, __do...while loops__ and __do...until loops__.
- When using the `range(...)` function to get a range of numbers, the only necessary parameter is the upper limit of the range, and it is __included__ in the range.
- Instead of a call to `range(...)`, you can provide a list of elements to your for loop to iterate on.
- The correct form of a for loop declaration is `for x until condition:` where `x` is the counter and `condition`, the condition that must be satisfied for the loop to end.

#### Code analysis questions

The following snippet of code may contain errors that prevents it from running. Identify and correct the mistakes.

Once all the errors have been corrected, read the code again and explain what it does. What will the final print statement print? 

```python
myList = (1,2,3,4,5)
myOtherList = list()

for i in length(myList) do
  myOtherList.append(myList[i])
  
print(myOtherList)
```

#### Programming questions

__Problem 1__

Write a script that computes the sum of all numbers from 0 to 100.
Can you modify your program so that it only adds up the __even__ numbers?
Can you modify your program so that it only adds up the __odd__ numbers?

_Hint: You may have to do some pen-and-paper mathematics to figure out how to do the last two tasks. Later, we'll discuss conditional statements, which will make your life easier for that kind of problem._

__Problem 2__

Given the following list of numbers, `[55,60,75,43,10,75,23]`, write a script that will calculate its average value and its standard deviation.
Can you make it into functions that could potentially work on __any__ list you give them as input?

In the second case, make sure that your functions __return__ the result and that you print it after saving it to a variable.
