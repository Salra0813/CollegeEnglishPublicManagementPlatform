package sicnu.sixteam.englishbackstage.model;




public class Permissions {

    private String permisid;

    private String permisname;

    public String getPermisid() {
        return permisid;
    }

    public Permissions(String permisid, String permisname) {
        this.permisid = permisid;
        this.permisname = permisname;
    }

    public void setPermisid(String permisid) {
        this.permisid = permisid;
    }

    public String getPermisname() {
        return permisname;
    }

    public void setPermisname(String permisname) {
        this.permisname = permisname;
    }
}
