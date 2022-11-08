public class DrivingLicence {
    private String name;
    private String adress;
    private String postalCode;
    private String city;
    private String drivingLicenceNumber;
    private int yearOfIssue;
    private String category;

    public void displayDL() 
    {
        System.out.println(name);
        System.out.println(adress);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(drivingLicenceNumber);
        System.out.println(yearOfIssue);
        System.out.println(category);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDrivingLicenceNumber() {
        return drivingLicenceNumber;
    }

    public void setDrivingLicenceNumber(String drivingLicenceNumber) {
        this.drivingLicenceNumber = drivingLicenceNumber;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= 2022) {
            this.yearOfIssue = yearOfIssue;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    } 

    public String toString() {
        return getCategory() + " " + getYearOfIssue();
    }
}
