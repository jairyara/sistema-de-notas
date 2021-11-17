package dto;

public class StudentDTO {

    private PersonDTO person;
    private String fatherName;
    private String motherName;

    public StudentDTO(PersonDTO person, String fatherName, String motherName) {
        this.person = person;
        this.fatherName = fatherName;
        this.motherName = motherName;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }
}
