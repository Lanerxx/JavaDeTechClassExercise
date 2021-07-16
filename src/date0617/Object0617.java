package date0617;

import java.util.Objects;

public class Object0617 {
    private Integer id;
    private String detail;

    public String toString() {
        return "id:" + this.id +
                " detail:" + this.detail;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Object0617 object0617 = (Object0617)o;
        return Objects.equals(this.id, object0617.id) && Objects.equals(this.detail, ((Object0617) o).detail);
    }

    public void finalize(){
        System.out.println("finalize");
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Object0617 that = (Object0617) o;
//        return Objects.equals(id, that.id) &&
//                Objects.equals(detail, that.detail);
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
