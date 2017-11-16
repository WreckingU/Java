package networkpm;

/**                  PROGRAM HEADER
 * PROGRAM NAME: Network
 * PROGRAM PURPOSE: Demonstrates a basic neural network
 * DATE WRITTEN: 11/17/15
 * @author heldmanb
 * @version 1.0
 */
public class NetworkPM 
{
    //<editor-fold defaultstate="collapsed" desc="Class-Level Variables">
    
    //The global error the training
    protected double globalError;
    
    //The number of input neurons
    protected int inputCount;
    
    //The number of hidden neurons
    protected int hiddenCount;
    
    //The number of output neurons
    protected int outputCount;
    
    //The total number of neurons in the network
    protected int neuronCount;
    
    //The number of weights in the network
    protected int weightCount;
    
    //The learning rate - LR
    protected double learnRate;
    
    //The outputs from the various levels
    protected double fire[];
    
    //The weight matrix plus the thresholds can be
    //thought of as the "memory" of the neural network
    protected double matrix[];
    
    //The errors from the last calculation
    protected double error[];
    
    //Accumulates matrix deltas for training
    protected double accMatrixDelta[];
    
    //The thresholds coupled with the weight matrix
    //make up the neural network's "memory"
    protected double thresholds[];
    
    //The changes that should be applied to the weight matrix
    protected double matrixDelta[];
    
    //The accumulation of threshold deltas
    protected double accThresholdDelta[];
    
    //The threshold delta
    protected double thresholdDelta[];
    
    //The momentum for training
    protected double momentum;
    
    //The changes in the errors
    protected double errorDelta[];
//</editor-fold>
    
    /** Constructor for the neural net
     * 
     * @param inputCount The number of input neurons
     * @param hiddenCount The number of hidden neurons
     * @param outputCount The number of output neurons
     * @param learnRate The learning rate to be used when training
     * @param momentum The momentum to be used when training
     */
    public NetworkPM (int inputCount, int hiddenCount, int outputCount, double learnRate, double momentum)
        {
            this.learnRate = learnRate;
            this.momentum = momentum;
            this.inputCount = inputCount;
            this.hiddenCount = hiddenCount;
            this.outputCount = outputCount;
            
            neuronCount = inputCount + hiddenCount + outputCount;
            weightCount = (inputCount * hiddenCount) + (hiddenCount * outputCount);
            
            fire = new double[neuronCount];
            matrix = new double[weightCount];
            matrixDelta = new double[weightCount];
            thresholds = new double[neuronCount];
            errorDelta = new double[neuronCount];
            error = new double[neuronCount];
            accMatrixDelta = new double[weightCount];
            thresholdDelta = new double[neuronCount];
            
            reset();
        } //end of ANN constructor
    
    /**
     * Returns the root mean square error for a complete training set.
     * 
     * @param len The length of a complete training set.
     * @return The current error for the neural network.
     */
    public double getError(int len)
    {
        double err = Math.sqrt(globalError / (len * outputCount));
        //zero out globalError
        globalError = 0; //clear the accumulator
        return err;
    }
    
    /**
     * The threshold method. 
     * 
     * @param sum The activation from the neuron. 
     * @return The activation applied to the threshold method.
     */
    public double threshold(double sum)
    {
        return 1.0 / (1 + Math.exp(-1.0 * sum));
    }
    
    /**
     * Compute the output for a given input to the neural network.
     * 
     * @param input The input that is provided to the ANN.
     * @return The results from the output neurons.
     */
    public double []computeOutputs(double input[])
    {
        int i, j;
        final int hiddenIndex = inputCount;
        final int outIndex = inputCount + hiddenCount;
        
        for(i = 0; i < inputCount; i++)
        {
            fire[i] = input[i];
        }
        
        //first layer
        int inx = 0;
        
        for(i = hiddenIndex; i < outIndex; i++)
        {
            double sum = thresholds[i];
            
            for(j = 0; j < inputCount; j++)
            {
                sum += fire[j] * matrix[inx++];
            }
            
            fire[i] = threshold(sum);
        }
        
        //hidden layer
        double result[] = new double[outputCount];
        
        for(i = outIndex; i < neuronCount; i++)
        {
            double sum = thresholds[i];
            
            for(j = hiddenIndex; j < outIndex; j++)
            {
                sum += fire[j] * matrix[inx++];
            }
            
            fire[i] = threshold(sum);
            result[i - outIndex] = fire[i];
        }
        
        return result;
        
    } //end of computeOutputs
    
    /**
     * Calculate the error for the recognition just done.
     * 
     * @param ideal What the output neurons should have yielded.
     */
    public void calcError(double ideal[])
    {
       int i, j;
       final int hiddenIndex = inputCount;
       final int outputIndex = inputCount + hiddenCount;
       
       //Clear out any prior hidden layer errors
       for(i = inputCount; i < neuronCount; i++)
       {
           error[i] = 0;
       }
       
       //Layer errors and deltas for output layer
       for(i = outputIndex; i < neuronCount; i++)
       {
           error[i] = ideal[i - outputIndex] - fire[i];
           globalError += error[i] * error[i];
           errorDelta[i] = error[i] * fire[i] * (1 - fire[i]);
       }
       
       //Hidden layer errors
       int winx = inputCount * hiddenCount;
       for(i = outputIndex; i < neuronCount; i++)
       {
           for(j = hiddenIndex; j < outputIndex; j++)
           {
               //Accumulator to count the matrix data
               accMatrixDelta[winx] += errorDelta[i] * fire[j];
               error[j] += matrix[winx] * errorDelta[i];
               winx++;
           }
           
           accThresholdDelta[i] += errorDelta[i];
       }
       
       //Hidden layer deltas
       for(i = hiddenIndex; i < outputIndex; i++)
       {
           errorDelta[i] = error[i] * fire[i] * (1 - fire[i]);
       }
       
       //Input layer errors
       winx = 0;  //Offset into weight array
       for(i = hiddenIndex; i < outputIndex; i++)
       {
           for(j = 0; j < hiddenIndex; j++)
           {
               accMatrixDelta[winx] += errorDelta[i] * fire[j];
               error[j] += matrix[winx] * errorDelta[i];
               winx++;
           }
           
           accThresholdDelta[i] += errorDelta[i];
       }
    }
    
    
    
    public static void main(String[] args) 
    {
        // My code goes here
    }

}
