public class Employee {
    String name;
    Double salary;
    int workHours;
    int hireYear;

    public Employee(String name, Double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
//if salary less than 1000TL, calculates no tax
    public double tax() {
        if (this.salary < 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }
    }
//bonus calculation
    public double bonus() {
        int extraHours = this.workHours - 40;
        double bonus = 0;
        if (this.workHours > 40) {
            bonus = extraHours * 30;
        }
        return bonus;
    }
//salary raise calculation
    public double raiseSalary() {
        int serviceTime = 2021 - this.hireYear;
        if (serviceTime < 10) {
            return this.salary * 0.05;
        } else if (serviceTime > 9 && serviceTime < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }
        public String toString() {
            double tax, bonus, raiseSalary, salarywithbonusses, totalsalary;
            tax = tax();
            bonus = bonus();
            raiseSalary = raiseSalary();
            salarywithbonusses = this.salary + tax + bonus;
            totalsalary = this.salary + tax + bonus + raiseSalary;

            return ("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma Saati : " + workHours
                    + "\nBaşlangıç Yılı : " + hireYear + "\nVergi : " + tax + "\nBonus : " + bonus + "\nMaaş Artışı : " + raiseSalary
                    + "\nVergi ve Bonuslar ile birlikte maaş : " + salarywithbonusses + "\nToplam Maaş : " + totalsalary);
        }
    }



