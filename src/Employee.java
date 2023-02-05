public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary =salary;
        this.workHours =workHours;
        this.hireYear =hireYear;
    }
    double tax (){
        double tax = 0;
        if (salary >= 1000){
            tax = salary * (0.03);
        }
        return tax;
    }
    double bonus (){
        double bonus =0;
        if (workHours > 40){
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }
    double raiseSalary(){
        double raise = 0;
        if ((2021 - hireYear) < 10){
            raise = salary * 0.05;
        }else if ((2021 - hireYear) >= 10) {
            if ((2021 - hireYear ) < 20) {
                raise = salary * 0.1;
            } else if ((2021 - hireYear) >= 20) {
                raise = salary * 0.15;
            }
        }
        return raise;
    }
    public String toString() {
        return "Adı :" + this.name + "\nMaaşı: " + this.salary + "\nÇalışma Saati : " + this.workHours +
                "\nİşe Başlama Tarihi : " + this.hireYear + "\nVergi :" + this.tax() + "\nBonus : " + this.bonus() +
                "\nMaaş Artışı :" + this.raiseSalary() + "\nVergi ve bonuslar ile birlikte maaşı :" + (this.salary - this.tax() + this.bonus() + this.raiseSalary()) ;
    }
}
