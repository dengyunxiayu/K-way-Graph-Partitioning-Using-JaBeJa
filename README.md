# K-way-Graph-Partitioning-Using-JaBeJa
* Task 1
  * In the first task, you are to implement the Ja-Be-Ja algorithm. We provide a scaffolding source code for Ja-Be-Ja simulation for one-host-one-node model. The source code is available on github. The simulator is written in Java. To compile the results you need gnuplot (Links to an external site.), a portable command-line driven graphing utility. 
* Task 2
  * In the second task you will tweak different JaBeJa configurations in order to find the smallest edge cuts for the given graphs. 
  * In this task, you are to analyze how the performance of the algorithm is affected when different parameters are changed, specially the effect of simulated annealing. Currently, Ja-Be-Ja uses a linear function to decrease the temperature (lines 9 - 13 of the Ja-Be-Ja algorithm) and the temperature is multiplied to the cost function (line 26 of the Ja-Be-Ja algorithm). You will now analyze how changing the simulated annealing parameters and the acceptance probability function affects the performance of Ja-Be-Ja.
