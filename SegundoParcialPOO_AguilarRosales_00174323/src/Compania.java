public abstract class Compania extends Adapter{
    private String password;
    private String user;

    public Compania(String password, String user) {
        this.password = password;
        this.user = user;
    }

    public Compania() {
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
