import java.time.LocalDate;

class Professor extends DeptEmployee {

    private int numberOfPublications;
    public Professor(String name, double salary, int year,int month,int day){
        super(name,salary,year,month,day);
    }

    public void setNumberOfPublications(int numberOfPublications){
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications(){
        return numberOfPublications;
    }
}
