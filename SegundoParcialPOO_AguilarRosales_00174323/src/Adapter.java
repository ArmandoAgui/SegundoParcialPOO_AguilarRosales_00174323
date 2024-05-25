public class Adapter  implements CompanyInterface{
    @Override
    public String user() {
        String username = "";
        return username;
    }

    @Override
    public String pwd() {
        String pass = "";
        return pass;
    }

    @Override
    public String tokken() {

        String tok = user() + ":" + nombreEmpresa();
        return tok;
    }

    @Override
    public String nombreEmpresa() {
        String nombre = "";
        return nombre;
    }


}
