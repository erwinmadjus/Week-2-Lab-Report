# **Week 8 Lab Report #4** 

*Created by: Erwin Madjus*

*Last Edited: February 25, 2022*
---

Link to my ```Markdown-Parse``` Repository:

[My Repository](https://github.com/erwinmadjus/actual-markdown-parse)

Link to the ```Markdown-Parse``` repository that I reviewed in Week 7: 

[Repository That I Reviewed](https://github.com/yih365/markdown-parse/blob/main/MarkdownParse.java)

---
### **Background Information:** 

This lab will involve working with the following 3 markdown snippets: 


```
`[a link`](url.com)

[another link](`google.com)`

[`cod[e`](google.com)

[`code]`](ucsd.edu)
```

 
```
[a [nested link](a.com)](b.com)

[a nested parenthesized url](a.com(()))

[some escaped \[ brackets \]](example.com)

```

 
```
[this title text is really long and takes up more than 
one line

and has some line breaks](
    https://www.twitter.com
)

[this title text is really long and takes up more than 
one line](
    https://ucsd-cse15l-w22.github.io/
)


[this link doesn't have a closing parenthesis](github.com

And there's still some more text after that.

[this link doesn't have a closing parenthesis for a while](https://cse.ucsd.edu/



)

And then there's more text

```


If you’re using a direct clone to ```ieng6```, you might find it useful to give an extra argument to ```git clone``` that specifies which directory to clone into, for example:


```
$ git clone https://github.com/ucsd-cse15l-w22/markdown-parse markdown-parse-target-directory
```

--- 

#### **Questions:**

1. Do you think there is a small (<10 lines) code change that will make your program work for snippet 1 and all related cases that use inline code with backticks? If yes, describe the code change. If not, describe why it would be a more involved change.

2. Do you think there is a small (<10 lines) code change that will make your program work for snippet 2 and all related cases that nest parentheses, brackets, and escaped brackets? If yes, describe the code change. If not, describe why it would be a more involved change.

3. Do you think there is a small (<10 lines) code change that will make your program work for snippet 3 and all related cases that have newlines in brackets and parentheses? If yes, describe the code change. If not, describe why it would be a more involved change. 