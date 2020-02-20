# CMPSC 100-02 Lab Session 6: G. Wiz and the magical test generator

* Assigned: 20 February 2020
* Due: 27 February 2020 by 2:30 PM
* Point value: 35

This lab combines learning about the `Scanner` and `Random` classes in order to solve a problem using `String`s, `int`s, and other concepts we continue to practice such as `git`, and basic Java programming. In addition to basic technical skills, this lab also practices _design thinking_.

* [Slack](https://cmpsc-100-02-sp-2020.slack.com)
* [GitHub](https://www.github.com)
* git
* Markdown
* [Atom](https://atom.io)
* [Docker](https://www.docker.com/products/docker-desktop)
* GatorGrader
* gradle

## Table of Contents

* [Accepting the assignment](#accepting-the-assignment)
* [Activity: G. Wiz and the magical test generator](#g-wiz-and-the-magical-test-generator)
* [Evaluation](#evaluation)
* [GatorGrader](#gatorgrader)

## General guidelines for laboratory sessions

* **Follow steps carefully.** Laboratory sessions often get a bit more complicated than their preceeding Practical sessions. Especially for early sessions which expose you to platforms with which you may not be familiar, take notes on `command`s you run and their corresponding effects/outputs. If you find yourself stuck on a step, let a TL or the professor know! Laboratory sessions do not mean that we won't help you in the same way we do during Practicals.
* **Regularly ask and answer questions.** Some of you may have more experience with the topics we're discussing than others. We can use this knowledge to our advantage. But, like in Practicals, let students try things for a while before offering help (**always _offer_ first**). To ask questions, use our [Slack](https://cmpsc-100-02-sp-2020.slack.com)'s `#labs` channel.
* **Store and transfer files using GitHub.** Various forms of file storage are more or less volatile. *You* are responsible for backing up and storing files. If you're unsure of files which have been changed, you can always type `git status` in the terminal for your working folder to determine what you need to back up.
* **Keep all of your files.** See above, but also remember that you're responsible for the files you create.
* **Back up your files regularly.** See above (and above-above).
* **Review the [Honor Code](https://sites.allegheny.edu/about/honor-code/) regularly when working.** If you're taking a solution from another student or the Internet at-large (_especially_ [Stack Overflow](https://stackoverflow.com)), bear in mind that using these solutions _can_ constitute a form of plagiarism that violates the Allegheny Honor Code. While it may seem easy and convenient to use these sources, it is equally easy and convenient to rely on them and create bad habits which include not attributing credit or relying exclusively on others to solve issues. Neither are productive uses of your intellect. Really.

## Further helpful reading for this assignment

I recommend reading the [GitHub Guides](https://guides.github.com) which GitHub makes available. In particular, the guides:

* [Mastering Markdown](https://guides.github.com/features/mastering-markdown/)
* [Documenting your projects on GitHub](https://guides.github.com/features/wikis/)
* [GitHub Handbook](https://guides.github.com/introduction/git-handbook/)

## G. Wiz and the magical test generator

![KABOOM](https://raw.githubusercontent.com/allegheny-college-sandbox/cmpsc-100-spring-2020-lab-06/media/media/g-wiz-test-explosion.png)

As a side job to his current gig as an adjunct professor in the wizard department at Reptile State ("2-4-6-8 We've Even Got Invertebrates!"), G. Wiz joined the Wizard Animal Certification (WAC) examination board. Part of their responsibilities involves writing test questions for the annual licensure and certification test. G. Wiz is responisble for the potion word problems.

While it takes _some_ work, most members don't find that it takes too much of their time. However, G. Wiz wants to spend _as little time as possible_ in order to focus the income on buying hats, books, and the newest kingdom craze: playing _HumanQuest_. In order to do this, they need a test generator that can generate new questions and answers on demand. 

That's where you come in.

G. Wiz's question format looks like this (provided for you in a file):

```
In {PLACE}, {JOB}s are going wild over {POTION} potions. In order to meet the demand, you need to make more of them. Among other ingredients, the recipe requires {OUNCES} ounces of {INGREDIENT}. If the recipe makes {QUANTITY} potions, how many potions does {AMOUNT} ounces make?
```

Your job is to fill in each of the _tokenized_ parts of the string (e.g. `{PLACE}`) with a combination user input and random numbers.

| Token      | Type  | Source | Limit |
|------------|-------|--------|-------|
|{PLACE}     |String |Input   |       |
|{JOB}       |String |Input   |       |
|{POTION}    |String |Input   |       |
|{OUNCES}    |Double |Random  | 50    |
|{INGREDIENT}|String |Input   |       |
|{QUANTITY}  |Integer|Random  | 10    |
|{AMOUNT}    |Double |Random  | 100   |

A successful generation should look like the following:

```
WIZARD TEST QUESTION GENERATOR

Enter the name of a fictional place: Gatortown
Enter the singular form of a type of job: wizard
Enter the title of a potion: thumb acquisition
Enter the name of an ingredient: crushed beetle

In Gatortown, wizards are going wild over thumb acquisition potions. In order to meet the demand, you need to make more of them. Among other ingredients, the recipe requires 4.302752163991519 ounces of crushed beetle. If the recipe makes 5 potions, how many potions does 75.93142876469676 ounces make?

> 85
```

### Note

Given the random nature of `Random`, it is possible that your generator will create questions where the answer is `0`. This is valid, as G. Wiz wants to be tricky on occasion. However, your problem shouldn't generate any _negative_ numbers.

## Evaluation

### `WizardTest.java`

- [ ] Contains no:
    * `TODO` markers
    * `{Your Name Here}` markers
- [ ] Use of a `Scanner` to take input from the keyboard
- [ ] Use of the `nextLine` method to process user input at prompts
- [ ] Use of at least one instance of `Random` to generate numbers
- [ ] Use of the `nextDouble` and `nextInt` methods of `Random` to provide an appropriate amount and type of numbers
- [ ] Use of the `String` methods `replace` and `valueOf`
- [ ] Correct math to print the answer to the problem below the prompt
- [ ] Use of at least one `cast`
    * Hint #1: the correct type to cast has to do with the data type of the answer and that of the data generated by `nextDouble`
    * Hint #2: remember that, unless we do some complicated magic that we haven't seen yet, Java _does not_ round (and we don't need to here)
- [ ] Single-line comments marking each part of the program (minimum `10`)
- [ ] Output similar to that pictured above

### `reflection.md`

- [ ] Contains no:
    * `TODO` markers
    * `{Your Name Here}` markers
- [ ] Contains 350 words
- [ ] Written in correct markup (passes `mdl`)
- [ ] Responds to all questions

### Repository

- [ ] Has at least 3 `commit`s

## Accepting the assignment

- [ ] Log into the `#labs` channel in our class [Slack](https://cmpsc-100-02-sp-2020.slack.com)
- [ ] Click the link provided for the lab assignment and accept it in GitHub classroom
- [ ] Once the assignment finishes building, click the link to go to your personal repository assignment

## "Cloning" a repository

### Using the correct download link

- [ ] On this repository's page, click the `Clone or download` button in the upper right hand corner
* You may need to scroll up to see it
- [ ] In the upper right corner of the box that appears, click `Use SSH`
- [ ] Copy the link that appears in the textbox below the phrase "Use a password with a protected key."

### Cloning

- [ ] Type `ls` in your terminal window
* You should be in your `CMPSC100` directory
- [ ] Change directories (`cd`) to your `Labs` folder
- [ ] Once in the labs folder, "clone" the repository using the link copied above
* If I (the instructor) were to clone my own repository, I'd enter (your link will look different):
```
git clone git@github.com:allegheny-college-cmpsc-100-spring-2020/cmpsc-100-spring-2020-lab-06-dluman
```

## GatorGrader

### A note about `gradle`

`gradle` is a program which manages our program's many moving parts. It coordinates building, testing, compiling, and running our code -- tasks that will become more complex over the course of the semester in direct proportion to the complexity of our programs. There are three "tasks" that we will use extensively in this course.

#### `gradle build`

`gradle build` compares code against a set of convetions ("best practices") for creating legible code. There are many different standards for doing this, but our department chooses to follow the [Google Style Guide for the Java language](https://google.github.io/styleguide/javaguide.html). This includes such rules as:

* Each "level" of code being indented by 2 spaces
* Not using single-letter identifiers
* Enforcing consistent use of "Javadoc" (and other) comments
* ... and more!

These kinds of standard make reading code much easier, and help folks like our Technical Leaders (and me) read your code to figure out where something isn't going as planned.

#### `gradle run` (and its variants)

`gradle run` (and its counterpart `gradle -q --console plain run`) compile and run our Java programs. Once again, this will become more handy when we start to build projects that require _multiple_ files.

#### `gradle grade`

`gradle grade` runs the GatorGrader application. This application uses grading standards _specific to an assignment_. This means that the grading files created when you accept an assignment are the same ones by which I will evaluate your work: _once you've cloned an assignment, they do not change_.

You will use this command to grade your work before you turn it in, enabling you to know before I grade it what your grade will be.

#### Running GatorGrader directly on `container` start

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-06` folder and `cd` to it.
    * Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
- [ ] To make sure you're in the right repository, type `pwd` and press `Enter`
    * If you recieve the expected path, you're in the right place!

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key.
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key.

## Submitting the assignment/saving progress

The GitHub platform is a place to store your work. So, it makes some sense that should be able to _clone_ (download) from it, and push back (upload) to it. Here, we'll learn this second part.

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-lab-06` folder and `cd` to it.

Once in this folder, we need to tell git that there have been changes.

- [ ] Type `git add .` and press `Enter`
* This tells git to look through the _entire_ folder structure for new changes and "stage" them

- [ ] Type `git commit -m "{Commit message}"` to "label" the commit
* This is typically something like `git commit -m "Fixing a typo"` -- the message in quotes should be as descriptive as possible, while still remaining somewhat short

- [ ] To send all changes to the server, type `git push`
- [ ] At the prompt, input the password associated with the `SSH Key` you created earlier in this exercise (yesterday)

Once the process finishes successfully, we're done!
