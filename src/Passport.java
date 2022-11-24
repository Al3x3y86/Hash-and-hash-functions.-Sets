import java.util.Objects;

public class Passport {

    private int passportID;
    private String surname;
    private String name;
    private String middleName;
    private String dateOfBirth;

    public Passport(int passportID, String surname, String name, String middleName, String dateOfBirth) {
        if (passportID <= 0) {
            this.passportID = passportID;
        }
        if (surname != null && !surname.isEmpty() && !surname.isBlank()) {
                this.surname = surname;
        }
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        }
        if (dateOfBirth != null && !dateOfBirth.isEmpty() && !dateOfBirth.isBlank()) {
            this.dateOfBirth = dateOfBirth;
        }
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "Паспорт №: " + passportID + ", Фамилия: " + surname + ", Имя: " + name +
                ", Отчетство" + middleName + ", Дата рождения: " + dateOfBirth;
    }

    public int getPassportID() {
        return passportID;
    }

    public void setPassportID(int passportID) {
        this.passportID = passportID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportID == passport.passportID && Objects.equals(surname, passport.surname) && Objects.equals(name, passport.name) && Objects.equals(middleName, passport.middleName) && Objects.equals(dateOfBirth, passport.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportID, surname, name, middleName, dateOfBirth);
    }
}
