abstract public class StaffMember implements Payable, Comparable<StaffMember>{
    protected String name;
    protected String address;
    protected String phone;
    public StaffMember(String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    public String toString(){
        String result = "Name: " + name + "\n";
        result += "Address: " + address + "\n";
        result += "Phone: " + phone;
        return result;
    }
    public String getName(){
        return name;
    }
    public int compareTo(StaffMember otherMember){
        if(pay() == otherMember.pay()){
            return 0;
        }else if(pay() > otherMember.pay()){
            return 1;
        }else{
            return -1;
        }
    }
    public abstract int vacation();
}