# ExerciseSheet05
After you have implemented all that stuff from ExerciseSheet04, you think about it for a while (and learn some cool new Stuff about Generics). You recognize that you have implemented nearly the same thing for Tracks and Artists when it comes to Formatters and Comparators.
To improve your code, you decide to change these using the concept of Generics.
For the comparators, you additionally decide to use the already existing Comparator interface
located in java.util package.
After that, the manager comes back to you again and asks for a possibilty to store all the tracks of his Artists in a list. (Really, he didn’t ask for that before, although all requests had this aim :-) ) Here we start with a newly created class called MyTrackContainer.
He would love to sort the lists within this container, but additionally, he wants to be able to filter tracks by the duration of a Track or the title of a Track. For this task, you decide to implement a so called “Matcher”, using again the concepts of abstract classes, inheritance and generics.
