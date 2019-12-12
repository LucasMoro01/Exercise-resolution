public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    public double getFirstNumber() {
        return this.firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double sum;
        sum = this.firstNumber + this.secondNumber;
        return sum;
    }

    public double getSubtractionResult() {
        double sub;
        sub = this.firstNumber - this.secondNumber;
        return sub;
    }

    public double getMultiplicationResult() {
        double mul;
        mul = this.firstNumber * this.secondNumber;
        return mul;
    }

    public double getDivisionResult() throws Exception {
        double div;
        if (this.secondNumber == 0) {
            throw new Exception("Second number cannot be 0");
        }else {
            div = this.firstNumber / this.secondNumber;
        }
        return div;
    }




}