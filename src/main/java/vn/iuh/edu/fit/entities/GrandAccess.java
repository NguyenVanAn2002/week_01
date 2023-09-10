package vn.iuh.edu.fit.entities;

public class GrandAccess {
    private String role_id;
    private String accout_id;
    private Enum is_grant;
    private  String note;

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getAccout_id() {
        return accout_id;
    }

    public void setAccout_id(String accout_id) {
        this.accout_id = accout_id;
    }

    public Enum getIs_grant() {
        return is_grant;
    }

    public void setIs_grant(Enum is_grant) {
        this.is_grant = is_grant;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public GrandAccess() {
    }

    public GrandAccess(String role_id, String accout_id, Enum is_grant, String note) {
        this.role_id = role_id;
        this.accout_id = accout_id;
        this.is_grant = is_grant;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Grant_Access{" +
                "role_id='" + role_id + '\'' +
                ", accout_id='" + accout_id + '\'' +
                ", is_grant=" + is_grant +
                ", note='" + note + '\'' +
                '}';
    }
}
