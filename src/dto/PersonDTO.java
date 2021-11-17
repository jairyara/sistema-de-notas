package dto;

public class PersonDTO {

    private String name;
    private String lastName;
    private String birthDate;
    private boolean gender;
    private long dni;


    public PersonDTO(String name, String lastName, String birthDate, boolean gender, long dni) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
}
