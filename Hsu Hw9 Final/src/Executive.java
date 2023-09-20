public class Executive extends Employee{
    private double bonus;
    private int extraVacation = 0;
    public Executive (String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
    }
    public Executive (String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, int compVacation){
        super (eName, eAddress, ePhone, socSecNumber, rate);
        bonus = 0;
        extraVacation = compVacation;
    }
    public void awardBonus (double execBonus){
        bonus = execBonus;
    }
    public double pay(){
        double payment = super.pay() + bonus;
        return payment;
    }
    public int vacation(){
        return STANDARD_VACATION + extraVacation;
    }
}
