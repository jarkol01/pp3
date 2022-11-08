public class test {
    public static void main(String[] args) {
        DrivingLicence d1 = new DrivingLicence();
        d1. setName("jaRek");
        d1. setYearOfIssue(2018);
        d1. setCategory("A, B");
        d1. setPostalCode("33-300");
        d1. setCity("Kraków");
        System.out.println(d1.getName());

        d1.setYearOfIssue(1979);
        System.out.println(d1.toString());
    }
}
