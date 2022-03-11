# **Week 10 Lab Report #5** 

*Created by: Erwin Madjus*

*Last Edited: March 10, 2022*

---

***Background Information:*** 
 
Choose any 2 tests from the 652 commonmark-spec tests where your implementation (or a representative implementation from your group) had different answers than the implementation that was provided in Lab 9. 

From the implementation that was found in the following repository: [mark-down-parse](https://github.com/ucsd-cse15l-w22/markdown-parse)

---
## ***Explain:***

How you found the tests with different results (Did you use ```diff``` on the results of running a bash for loop? Did you search through manually? Did you use some other programmatic idea?)

**Answer:** To find the tests with different results with one being ran on my repository ```actual-markdown-parse``` repository and the other being ran on the ```markdown-parse``` repository (created by the professor), I did the following:

[MyRepository](https://github.com/erwinmadjus/actual-markdown-parse)
[ProfessorRepository](https://github.com/ucsd-cse15l-w22/markdown-parse)

1. First, open up the ProfessorRepository on VSCode. The directory ```test-files/``` in the professor's respository had 1000 files and 650 test input ```.md``` files which did not have any names. (Difficult to keep track of the test files.) To fix that we had to fix the code in the ```script.sh```. Add the following: 

```

for file in test-files/*.md;
do
  echo $file
  java MarkdownParse $file
done

```
Run the command ```bash script.sh``` and you will now see the output with a name. 

2. The terminal gets filled up quick when running the ```bash script.sh``` command so to avoid that problem you can redirect the output to be displayed and outputted onto a ```.txt``` file. You run the following command: ```bash script.sh > results.txt```

After waiting for that command to fully run, you then type either one of these commands to see the output: ```vim results.txt``` or ```cat results.txt```

3. After that, you then have to log into ```ieng6```. There you copy the ```script.sh``` and ```test-files/``` into ***your*** ```markdown-parse``` directory. You do that by doing the following: 

```
cd ~ # go back to your home directory

git clone ... your-markdown-parse ...

# these commands assume that the provided course one is stored in
# cse15l-markdown-parse and yours was cloned to your-markdown-parse

cp -r cse15l-markdown-parse/test-files your-markdown-parse/
# The -r option above stands for "recursive", which means that files and other
# directories inside the given directory are copied recursively

cp cse15l-markdown-parse/script.sh your-markdown-parse/

```

Afterwards, you run the following command: ```bash script.sh > results.txt```

After waiting for that command to fully run, you then type either one of these commands to see the output: ```vim results.txt``` or ```cat results.txt```


4. After you have the 2 ```.txt``` files created with one having the output of the professor's program and the other with the output from your program, you can use the program ```diff```.

5. While logged into ```ieng6```, you run the following command:

```diff student-mdparse/results.txt markdown-parse/results.txt```

where the paths and filenames are the ones that are unique to your repository and the professor's repository. 





---

### ***Test #1:***

Describe which implementation is correct, or if you think neither is correct, by showing both actual outputs and indicating what the expected output is.


For the implementation that’s not correct (or choose one if both are incorrect), describe the _bug (the problem in the code). You don’t have to provide a fix, but you should be specific about what is wrong with the program, and show the code that should be fixed.


### ***Test #2:***

Describe which implementation is correct, or if you think neither is correct, by showing both actual outputs and indicating what the expected output is.


For the implementation that’s not correct (or choose one if both are incorrect), describe the _bug (the problem in the code). You don’t have to provide a fix, but you should be specific about what is wrong with the program, and show the code that should be fixed.
