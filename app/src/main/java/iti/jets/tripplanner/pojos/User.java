package iti.jets.tripplanner.pojos;

public class User {
    String userId;
    String fName;
    String lName;
    String email;
    String password;
    String image;

    public User() {
    }

    public User(String userId, String fName, String lName, String email, String password, String image) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
