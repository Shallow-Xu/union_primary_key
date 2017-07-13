package shallow.xu.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Shallow Xu on 2017/7/12.
 */
@Entity
@Table(name = "order_info")
@IdClass(OrderEntity.class)
public class OrderEntity implements Serializable {
    @Id
    private String id;
    private String flag;
    private String memo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
