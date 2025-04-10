class Students {
    String name;
    double percentage;
    public Students(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    void getEligibility() {
        System.out.println(name + " is eligible for admission.");
    }
}
class UG extends Students {
    public UG(String name, double percentage) {
        super(name, percentage);
    }
    @Override
    void getEligibility() {
        if (percentage >= 60) {
            System.out.println(name + " is eligible for UG admission.");
        } else {
            System.out.println(name + " is not eligible for UG admission.");
        }
    }
}
class PG extends Students {
    public PG(String name, double percentage) {
        super(name, percentage);
    }
    @Override
    void getEligibility() {
        if (percentage >= 70) {
            System.out.println(name + " is eligible for PG admission.");
        } else {
            System.out.println(name + " is not eligible for PG admission.");
        }
    }
}
public class CollegeAdmission {
    public static void main(String[] args) {
        UG ugStudent = new UG("Sravya", 65);  
        PG pgStudent = new PG("Joshita", 75); 
        ugStudent.getEligibility();  
        pgStudent.getEligibility(); 
    }
}

    
    

