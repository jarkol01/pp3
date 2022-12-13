public class Family {
    private Person[] members;

    public Family(Person[] members) {
        this.members = members;
    }

    public int adults() {
        int count = 0;

        for (Person i : members) {
            if (i.getAge() >= 18) {
                count += 1;
            }
        }
        return count;
    }
    
}
