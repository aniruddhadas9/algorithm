# algorithm

Writing an algorithm is one of the most important task in the interview for a software engineering position.
 And only writing a good algorithm does not always gives good result as interviewer expection is is much more then the result.
 
 Most importantly the entire writing code session or while board session is the time or opportunity for interviewer to understand you 
 and how you are attacking a software engineering problem

#### Before attacking a problem
Make sure you understood the problem correctly and made a perfect high performace (Big O) plan to write your code. This is more important then writing the code because interviewer will see how you are thinking and trying to resolve a problem.
So you have to think loud so that interviewer will understand what you are think. And finally testing your code important. right? The interviewer will make sure the code you written is also working and performing.

So below steps will help a lot to plan your algorithm


 - understood the problem by asking all the question arises in mind
 - made all enquiries before writing the code
 - think loudly so that other person will know what is going on in your mind
 - make the plan what you are going to write
 - got the go ahead from the interviewer or else ask what he thinks about the plan
 - analyze the algorithn on Big O terms to measure time and space complexity
 - write the code --finally! :)
 - verify everything is is implemented and no scope of improvement
 - test the code properly
 - make sure everything implemented and there is no scope of improvement

#### Big O

Normally the time and space complexity of an algorithm is measured with a notation called Big O.

 - O(1)
 - O(n)
 - O(log n)
 - O(n log n)
 - O(n^2)
 - O(n^3)
 
### Life saving tools ###

##### Algorithm Complexity: #####
you need to know Big-O. It's a must. If you struggle with basic big-O complexity analysis, then you are almost guaranteed not to get hired. It's, like, one chapter in the beginning of one theory of computation book, so just go read it. You can do it.

##### Sorting: #####
know how to sort. Don't do bubble-sort. You should know the details of at least one n*log(n) sorting algorithm, preferably two (say, quicksort and merge sort). Merge sort can be highly useful in situations where quicksort is impractical, so take a look at it.

For God's sake, don't try sorting a linked list during the interview.

##### Hashtables: #####
hashtables are arguably the single most important data structure known to mankind. You absolutely have to know how they work. Again, it's like one chapter in one data structures book, so just go read about them. You should be able to implement one using only arrays in your favorite language, in about the space of one interview.
 
##### Trees: #####
you should know about trees. I'm tellin' ya: this is basic stuff, and it's embarrassing to bring it up, but some of you out there don't know basic tree construction, traversal and manipulation algorithms. You should be familiar with binary trees, n-ary trees, and trie-trees at the very very least. Trees are probably the best source of practice problems for your long-term warmup exercises.

You should be familiar with at least one flavor of balanced binary tree, whether it's a red/black tree, a splay tree or an AVL tree. You should actually know how it's implemented.

You should know about tree traversal algorithms: BFS and DFS, and know the difference between inorder, postorder and preorder.

You might not use trees much day-to-day, but if so, it's because you're avoiding tree problems. You won't need to do that anymore once you know how they work. Study up!

##### Graphs #####

Graphs are, like, really really important. More than you think. Even if you already think they're important, it's probably more than you think.

There are three basic ways to represent a graph in memory (objects and pointers, matrix, and adjacency list), and you should familiarize yourself with each representation and its pros and cons.

You should know the basic graph traversal algorithms: breadth-first search and depth-first search. You should know their computational complexity, their tradeoffs, and how to implement them in real code.

You should try to study up on fancier algorithms, such as Dijkstra and A*, if you get a chance. They're really great for just about anything, from game programming to distributed computing to you name it. You should know them.

Whenever someone gives you a problem, think graphs. They are the most fundamental and flexible way of representing any kind of a relationship, so it's about a 50-50 shot that any interesting design problem has a graph involved in it. Make absolutely sure you can't think of a way to solve it using graphs before moving on to other solution types. This tip is important!

##### Other data structures #####
 You should especially know about the most famous classes of NP-complete problems, such as traveling salesman and the knapsack problem, and be able to recognize them when an interviewer asks you them in disguise.
 
 You should find out what NP-complete means.

##### Math #####

Some interviewers ask basic discrete math questions. We're surrounded by counting problems, probability problems, and other Discrete Math 101 situations, and those innumerate among us blithely hack around them without knowing what we're doing.

Don't get mad if the interviewer asks math questions. Do your best. Your best will be a heck of a lot better if you spend some time before the interview refreshing your memory on (or teaching yourself) the essentials of combinatorics and probability. You should be familiar with **n-choose-k problems and their il**k – the more the better.

##### Operating Systems #####

This is just a plug, from me, for you to know about processes, threads and concurrency issues. 
A lot of interviewers ask about that stuff, and it's pretty fundamental, so you should know it. 
Know about locks and mutexes and semaphores and monitors and how they work. 
Know about deadlock and livelock and how to avoid them. 
Know what resources a processes needs, and a thread needs, and how context switching works, and how it's initiated by the operating system and underlying hardware. Know a little about scheduling. 
The world is rapidly moving towards multi-core, and you'll be a dinosaur in a real hurry if you don't understand the fundamentals of "modern" (which is to say, "kinda broken") concurrency constructs.

#### Attacking a problem ####
Below are few ways you should think of the problem 

##### Explain: #####
We want to understand how you think, so explain your thought process and decision making throughout the interview. Remember we’re not only evaluating your technical ability, but also how you approach problems and try to solve them. Explicitly state and check assumptions with your interviewer to ensure they are reasonable.
##### Clarify: #####
Many of the questions will be deliberately open-ended to provide insight into what categories and information you value within the technological puzzle. We’re looking to see how you engage with the problem and your primary method for solving it. Be sure to talk through your thought process and feel free to ask specific questions if you need clarification.
##### Improve: #####
Think about ways to improve the solution you present.It’s worthwhile to think out loud about your initial thoughts to a question. In many cases, your first answer may need some refining and further explanation.  If necessary, start with the brute force solution and improve on it — just let the interviewer know that's what you're doing and why.
##### Practice: #####
You won’t have access to an IDE or compiler during the interview so practice writing code on paper or a whiteboard. Be sure to test your code and ensure it’s easily readable without bugs. Don’t stress about small syntactical errors like which substring to use for a given method (e.g. start, end or start, length) — just pick one and let your interviewer know.
 

#### The Technical Phone Interviews ####
Your phone interview will cover data structures and algorithms. Be prepared to write around 20-30 lines of code in your strongest language. Approach all scripting as a coding exercise — this should be clean, rich, robust code.

1. You will be asked an open ended question. Ask clarifying questions, devise requirements.
2. You will be asked to explain it in an algorithm.
3. Convert it to a workable code.(Hint: Don't worry about getting it perfect because time is limited.
Write what comes but then refine it later. Also make sure you consider corner cases and edge
cases, production ready.)
4. Optimize the code, follow it with test cases and find any bugs.


#### The Coding and Algorithm Interviews ####

#### Coding: ####
You should know at least one programming language really well, preferably C++, Java, Python, Go, or C. You will be expected to know APIs, Object Orientated Design and Programming, how to test your code, as well as come up with corner cases and edge cases for code. Note that we focus on conceptual understanding rather than memorization.
#### Algorithms: ####
 Approach the problem with both bottom-up and top-down algorithms. You will be expected to know the complexity of an algorithm and how you can improve/change it. Algorithms that are used to solve Google problems include sorting (plus searching and binary search), divide-and-conquer, dynamic programming/memoization, greediness, recursion or algorithms linked to a specific data structure. Know Big-O notations (e.g. run time) and be ready to discuss complex algorithms like Dijkstra and A*. We recommend discussing or outlining the algorithm you have in mind before writing code.
#### Sorting: ####
 Be familiar with common sorting functions and on what kind of input data they’re efficient on or not. Think about efficiency means in terms of runtime and space used. For example, in exceptional cases insertion-sort or radix-sort are much better than the generic QuickSort/MergeSort/HeapSort answers.
#### Data Structures: ####
 You should study up on as many data structures as possible. Data structures most frequently used are arrays, linked lists, stacks, queues, hash-sets, hash-maps, hash-tables, dictionary, trees and binary trees, heaps and graphs. You should know the data structure inside out, and what algorithms tend to go along with each data structure.
#### Mathematics: ####
 Some interviewers ask basic discrete math questions. This is more prevalent at Google than at other companies because counting problems, probability problems and other Discrete Math 101 situations surround us. Spend some time before the interview refreshing your memory on (or teaching yourself) the essentials of elementary probability theory and combinatorics. You should be familiar with n-choose-k problems and their ilk.
#### Graphs: ####
Consider if a problem can be applied with graph algorithms like distance, search, connectivity, cycle-detection, etc. There are three basic ways to represent a graph in memory (objects and pointers, matrix, and adjacency list) — familiarize yourself with each representation and its pros and cons. You should know the basic graph traversal algorithms, breadth-first search and depth-first search. Know their computational complexity, their tradeoffs and how to implement them in real code.
#### Recursion: ####
 Many coding problems involve thinking recursively and potentially coding a recursive solution. Use recursion to find more elegant solutions to problems that can be solved iteratively.

#### some life saving tips ####
 - So ask. Ask if they care about syntax, and if they do, try to get it right. Look over your code carefully from different angles and distances. Pretend it's someone else's code and you're tasked with finding bugs in it. You'd be amazed at what you can miss when you're standing 2 feet from a whiteboard with an interviewer staring at your shoulder blades.
 - Some interviewers will mark you down if you just jump up and start coding, even if you get the code right. They'll say you didn't think carefully first, and you're one of those "let's not do any design" type cowboys. So even if you think you know the answer to the problem, ask some questions and talk about the approach you'll take a little before diving in.
 - On the flip side, don't take too long before actually solving the problem, or some interviewers will give you a delay-of-game penalty. Try to move (and write) quickly, since often interviewers want to get through more than one question during the interview, and if you solve the first one too slowly then they'll be out of time. They'll mark you down because they couldn't get a full picture of your skills. The benefit of the doubt is rarely given in interviewing.



#### Interview Anti-Loop ####

Beware of the Interview Anti-Loop
The Interview Anti-Loop as described by Steve Yegge:

when I was at Amazon … We eventually concluded that every single employee E at Amazon has at least one “Interview Anti-Loop”: a set of other employees S who would not hire E. The root cause is important for you to understand when you’re going into interviews, so I’ll tell you a little about what I’ve found over the years.

First, you can’t tell interviewers what’s important … they believe they are a “good interviewer” and they don’t need to change their questions, their question styles, their interviewing style, or their feedback style, ever again. …

Second problem: every “experienced” interviewer has a set of pet subjects and possibly specific questions that he or she feels is an accurate gauge of a candidate’s abilities. The question sets for any two interviewers can be widely different and even entirely non-overlapping. …

The bottom line is, if you go to an interview at any software company, you should plan for the contingency that you might get genuinely unlucky, and wind up with one or more people from your Interview Anti-Loop on your interview loop. If this happens, you will struggle, then be told that you were not a fit at this time, and then you will feel bad. …

And then you should wait 6-12 months and re-apply. That’s pretty much the best solution we (or anyone else I know of) could come up with for the false-negative problem. – Get that job at Google

#### more links ####
The below link will help you to understand some more interview related problems. 
Most of the thinks I copied from there as this is my github page and i am using them to prepare my self.
 As you are here and github is public, you got it and also that is a blog and material for public. So home no body minds :)

http://steve-yegge.blogspot.com/2008/03/get-that-job-at-google.html
