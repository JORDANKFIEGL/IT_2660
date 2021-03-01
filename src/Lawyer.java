public class Lawyer {
    // Defining data members
    private String lawyerName;
    private int salary;
    private int yearsOfExperience;

    // Defining member methods
    public String getLawyerName(){
        return lawyerName;
    }

    public int getSalary(){
        return salary;
    }

    public int getYearsOfExperience(){
        return yearsOfExperience;
    }

    public void setLawyerName(String name){
        lawyerName = name;
    }


    public void setSalary(int sal){
        salary = sal;
    }

    public void setYearsOfExperience(int yoe){
        yearsOfExperience = yoe;
    }

// Overloading constructor
    public Lawyer(String name, int sal, int yoe){
        lawyerName = name;
        salary = sal;
        yearsOfExperience = yoe;
    }

    public Lawyer(){
        lawyerName = "default";
        salary = 0;
        yearsOfExperience = -1;
    }



    public Lawyer deepCopy(){
        Lawyer l = new Lawyer(lawyerName, salary, yearsOfExperience);
        return l;
    }




}
