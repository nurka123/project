public class FitnessApp {
    private double weight;
    private double height;
    private double bmi;

    public FitnessApp(double weight, double height) {
        this.weight = weight;
        this.height = height;
        this.bmi = calculateBMI();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
        this.bmi = calculateBMI();
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        this.bmi = calculateBMI();
    }

    public double getBmi() {
        return bmi;
    }

    private double calculateBMI() {
        return weight / (height * height);
    }


    public String toString() {
        return "FitnessApp{" +
                "weight=" + weight +
                ", height=" + height +
                ", bmi=" + bmi +
                '}';
    }

    public static void main(String[] args) {
        FitnessApp user1 = new FitnessApp(75.0, 1.75);
        System.out.println(user1);
        user1.setWeight(80.0);
        System.out.println("Updated info: " + user1);
    }
}


