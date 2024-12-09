class Student{
    private String name;
    private int[] score = new int[3];
    private double averageScore;
    
    public String getName(){
        return name;
    }

    public double getAverageScore(){
        return averageScore;
    }

    public void setAverageScore(double averageScore){
        this.averageScore = calculateAverage();
    }

    public Student(String name, int mathScores, int scienceScores, int englishScores){
        this.name = name;
        this.score[0] = mathScores;
        this.score[1] = scienceScores;
        this.score[2] = englishScores;
    }

    public double calculateAverage(){
        int sum = 0;
            for(int scores:score) {// convert array to the number{
                sum += scores; // sum everything in that row
            }
            
            this.averageScore = sum / score.length;
            return this.averageScore;
        }

    public void assignGrade(){

        double average = calculateAverage();

        if(average>= 90){
            System.out.println("The grade is A");
        }
        if(average>=80 && average <=89){
            System.out.println("The grade is B");
        }
        if(average>=70 && average <=79){
            System.out.println("The grade is C");
        }
        if(calculateAverage() >=60 && average <=69){
            System.out.println("The grade is D");
        }
        else{
            System.out.println("The grade is F");
        }
    }

}

public class StudentManagementSystem {
    public static void main(String[] args){
       Student[] studentDetails = new Student[5];
       studentDetails[0] = new Student("Amir", 90, 65, 88);
       studentDetails[1] = new Student("Adam" , 99, 75, 84);
       studentDetails[2] = new Student("Syida" , 100, 77, 90);
       studentDetails[3] = new Student("Fatah" , 99, 75, 84);
       studentDetails[4] = new Student("Dena" , 99, 75, 84);


        for(int i=0; i<studentDetails.length; i++){
            System.out.println("The student name is:" );

        }
    }
}
