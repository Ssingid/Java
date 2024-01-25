package objectarrays;

public class person {

    private double height;
    private int weight;
    private String ssn;
    private String phone_number;

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public int getWeight() {

        return weight;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {

        this.ssn = ssn;
    }

    public String getPhone_number() {

        return phone_number;
    }

    public void setPhone_number(String phone_number) {

        this.phone_number = phone_number;
    }
    person(double height, int weight, String ssn, String phone_number){
        this.height=height;
        this.weight=weight;
        this.ssn=ssn;
        this.phone_number=phone_number;
    }


    // Override equals method to match based on ssn
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        person person = (person) obj;
        return ssn.equals(person.ssn);
    }





    public static void main(String[] arg){
        // Create an unsorted array of Person objects
        person[] persons_List = {
                new person(7.5, 70, "123-45-6789", "913-555-1234"),
                new person(6.0, 65, "987-65-4321", "913-555-5678"),
                new person(6.5, 68, "123-45-6789", "913-555-9999")
        };//object creation

        person targetPerson = new person(6.5, 68, "123-45-6789", "913-555-9999");


        boolean found = false;
        for (person person : persons_List) {
            if (person.equals(targetPerson)) {
                found = true;
                break;
            }//end of if cond
        }//end of for loop

        System.out.println("Person with matching SSN found in the unsorted array: " + found);




        }//main


}
