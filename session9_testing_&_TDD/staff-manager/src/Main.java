public class Main {
    public static void main(String[] args) {
        Staff[] staff = new Staff[6];
        staff[0] = new FulltimeStaff("01", "Nguyen A", 26, "0981234567", "aaa@gmail.com",
                1000000, 0, 10000000);
        staff[1] = new FulltimeStaff("02", "Tran B", 27, "0329876543", "tb@gmail.com",
                500000, 100000, 6000000);
        staff[2] = new FulltimeStaff("03", "Ngo D", 30, "0972345678", "ddd@gmail.com",
                2000000, 0, 11000000);
        staff[3] = new ParttimeStaff("04", "Le H", 32, "0123456789", "haha@gmail.com", 30);
        staff[4] = new ParttimeStaff("05", "Dinh M", 25, "0321456789", "dinh@gmail.com", 25);
        staff[5] = new ParttimeStaff("06", "Ly P", 26, "0213456789", "lyp@gmail.com", 30);
        double averageSalary = getAverageSalary(staff);
        System.out.println("Luong trung binh la: " + averageSalary);
        System.out.println("Cac nhan vien full time co muc luong duoi trung binh: ");
        getFTUnderAverageSalary(staff);
        System.out.println("Tong tien luong tra cho nhan vien part time: " + getTotalPartTimeSalary(staff));
        sortFullTimeBySalary(staff);
        System.out.println("Sap xep nhan vien full time theo muc luong tang dan: ");
        getFTSSortBySalary(staff);
    }

    private static void getFTSSortBySalary(Staff[] staff) {
        for(Staff staff1 : staff){
            if(staff1 instanceof FulltimeStaff fullTimeStaff){
                System.out.println(fullTimeStaff.getName() + ", luong: " + fullTimeStaff.getSalary());
            }
        }
    }

    private static void sortFullTimeBySalary(Staff[] staff) {
        for (int i = 0; i < staff.length -1; i++) {
            for (int j = 0; j < staff.length - i -1; j++) {
                if(staff[i] instanceof FulltimeStaff && staff[j] instanceof FulltimeStaff) {
                    FulltimeStaff fulltimeStaff1 = (FulltimeStaff) staff[i];
                    FulltimeStaff fulltimeStaff2 = (FulltimeStaff) staff[j];
                    if(fulltimeStaff1.getSalary() < fulltimeStaff2.getSalary()) {
                        Staff temp = staff[i];
                        staff[i] = staff[j];
                        staff[j] = temp;
                    }
                }
            }
        }
    }

    private static double getTotalPartTimeSalary(Staff[] staff){
        double totalPartTimeSalary = 0;
        for (Staff staff1 : staff) {
            if (staff1 instanceof ParttimeStaff) {
                ParttimeStaff parttimeStaff = (ParttimeStaff) staff1;
                totalPartTimeSalary += parttimeStaff.getSalary();
            }
        }
        return totalPartTimeSalary;
    }

    private static void getFTUnderAverageSalary(Staff[] staff) {
        for(Staff staff1 : staff) {
            if(staff1 instanceof FulltimeStaff fullTimeStaff) {
                if(fullTimeStaff.getSalary() < getAverageSalary(staff)) {
                    System.out.println(fullTimeStaff.getName() + ", ma nhan vien " + fullTimeStaff.getId());
                }
            }
        }
    }

    private static double getAverageSalary(Staff[] staff) {
        double averageSalary = 0;
        double totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            totalSalary += staff[i].getSalary();
        }
        averageSalary = totalSalary / staff.length;
        return averageSalary;
    }
}