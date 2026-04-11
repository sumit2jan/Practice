# Java_practice

Java_practice is a collection of Java practice programs, interview preparation problems, data structure exercises, sorting/searching algorithms, string problems, and pattern-printing examples.

The repository is intentionally simple: most files are standalone Java classes that can be opened, compiled, and run independently while practicing core Java and problem-solving.

## Contents

- `InterviewPrepQuetions/` - common interview warm-up problems such as palindrome checks, Fibonacci, factorial, FizzBuzz, prime checks, Armstrong numbers, string reversal, and swaps.
- `Notout150/` - topic-wise coding practice inspired by common DSA patterns, including arrays and hashing, two pointers, sliding window, and linked lists.
- `Sorting/` - sorting algorithm implementations such as bubble sort, insertion sort, selection sort, merge sort, and quick sort.
- `Searhing/` - searching algorithm examples, including linear search and binary search.
- `StringManipulation/` - string-focused problems such as brackets, reverse vowels, repeated substring checks, and longest common prefix.
- `StringBuilder/` - examples using Java string builder and buffer APIs.
- `StarPatterns/` - pattern-printing exercises.
- `ExceptionHandling/` - basic exception handling practice.
- `ExtraPractice/` and `PractriceQuetions/` - additional practice problems and experiments.

## Requirements

- Java JDK 8 or newer
- Any Java-friendly editor or IDE, such as IntelliJ IDEA, VS Code, or Eclipse

## Running a Program

Most programs are standalone. From the repository root, compile and run the file you want to test.

Example:

```powershell
javac Sorting/Bubble.java
java Sorting.Bubble
```

Some files may not declare a package even when stored inside folders. For those files, run the compiled class from the same directory as the source file.

Example:

```powershell
cd Sorting
javac Bubble.java
java Bubble
```

## Suggested Practice Flow

1. Start with basic interview questions in `InterviewPrepQuetions/`.
2. Review searching and sorting implementations.
3. Move into `Notout150/` topic folders for DSA pattern practice.
4. Revisit each solution and try to improve time complexity, space complexity, and code readability.

## Notes

- Compiled `.class` files may appear after running examples locally.
- Folder names reflect the current repository structure.
- This repository is meant for hands-on practice, so small experiments and repeated implementations are expected.
