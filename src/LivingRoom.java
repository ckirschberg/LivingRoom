public class LivingRoom {
    private String name;
    private int numberOfPeople = 0;
    private Person personInChair;
    private Person personInCouchPosition1;
    private Person personInCouchPosition2;


    public LivingRoom(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPersonInChair() {
        return personInChair;
    }

    public void setPersonInChair(Person personInChair) {
        if (this.personInChair == null) {
            numberOfPeople++;
        }
        this.personInChair = personInChair;
    }

    public Person getPersonInCouchPosition1() {
        return personInCouchPosition1;
    }

    public Person getPersonInCouchPosition2() {
        return personInCouchPosition2;
    }

    public void setPersonInCouchPosition1(Person personInCouchPosition1) {

        if (personInCouchPosition1 == null) {
            numberOfPeople++;
        }
        //numberOfPeople = numberOfPeople +1;

        this.personInCouchPosition1 = personInCouchPosition1;
    }

    public void setPersonInCouchPosition2(Person personInCouchPosition2) {
        if (this.personInCouchPosition2 == null) {
            numberOfPeople++;
        }
        this.personInCouchPosition2 = personInCouchPosition2;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }
}
