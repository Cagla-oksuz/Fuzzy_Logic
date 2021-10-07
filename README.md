# Fuzzy_Logic

# summary
To create a fuzzy model of the selected data set, to create member functions,
to choose the rinse method according to the data, 
to write a rule and to reduce the error value of the model to the error value specified in the homework document.
To print the outputs and error percentage on the screen and draw the functions.

# DEVELOPED SOFTWARE
I chose the first dataset. https://archive.ics.uci.edu/ml/datasets/Blood+Transfusion+Service+Center
The data set I have chosen is based on certain criteria, whether people donate blood on the specified date or not.
inspecting. When I first downloaded the dataset, Recency (months), Frequency (times), Monetary (c.c. blood) and
there was a result.
250 c.c. each time blood is drawn. Since blood is drawn, Monetary field and Frequency field results are always the same.
i.e. their correlations were equal and i deleted the Monetary field. In this case recency, frequency and time
Three attempts remained.
Immediately after, I created the graphs of each attempt using excel and I broke down from these graphs.
I set the points. According to the breakpoints I have determined, come to my model.fcl file and become a member.
I wrote my functions.
I wrote the rules using my member functions with the help of Cartesian multiplication.
I determined it using excel. For example, the frequency is too_high, the recency is low, and the time is old.
I set the limits, it gives or does not count the outputs, namely zero and one, according to the number that is more
I did the calculation as soon as I gave it.
After I wrote my rules, I created my fis file as we did in the lesson. This file result is calculated and sent with the getResultD function.
In the getResult function, return true if 1 according to the calculated value, false if 0.
It reads line by line in csvReader and assigns it to a list and calculates the BloodOutputModel.java file and sends the actual output.
In the BulanikOdev_1 file, there is the main method, in which the calculated output, actual output and values are displayed prints.
It calculates the error according to the map.
Since my outputs should be 0 and 1 and there can be no division by 0, the divided value is accepted as 1 and calculated.
And print it to the screen. I drew member functions and graphs.







