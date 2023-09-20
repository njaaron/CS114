public class Firm {
    public static void main (String[] args){
        Staff personnel = new Staff();
        StaffMember[] staffList = personnel.getStaffList();
        int n = staffList.length;
        for (int i = 0; i < n-1; i++){
            int min = i;
            for (int j = i+1; j < n; j++)
                if (staffList[j].compareTo(staffList[min]) < 0){
                    min = j;
                }
            StaffMember temp = staffList[min];
            staffList[min] = staffList[i];
            staffList[i] = temp;
        }
        personnel.setStaffList(staffList);
        personnel.payday();
    }
}

