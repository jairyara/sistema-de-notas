package dto;

public class TeacherDTO {

    private PersonDTO person;
    private long phoneNumber;
    private String email;
    private String career;
    private String yearsExperience;

    public TeacherDTO(PersonDTO person, long phoneNumber, String email, String career, String yearsExperience) {
        this.person = person;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.career = career;
        this.yearsExperience = yearsExperience;
    }

    public PersonDTO getPerson() {
        return person;
    }

    public void setPerson(PersonDTO person) {
        this.person = person;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
}
