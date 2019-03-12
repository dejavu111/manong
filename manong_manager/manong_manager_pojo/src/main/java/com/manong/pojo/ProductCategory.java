package pojo;

public class ProductCategory {
    private Short id;

    private String name;

    private Short sorderorder;

    private Byte status;

    private Byte parentId;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Short getSorderorder() {
        return sorderorder;
    }

    public void setSorderorder(Short sorderorder) {
        this.sorderorder = sorderorder;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getParentId() {
        return parentId;
    }

    public void setParentId(Byte parentId) {
        this.parentId = parentId;
    }
}