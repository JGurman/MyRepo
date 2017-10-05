package my;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "DBUSER")
public class DBUser implements java.io.Serializable{
    private int userId;
    private String username;
    private String createdBy;
    private Date createdDate;

    public DBUser(){

    }
    public DBUser(int userId, String username, String createdBy, Date createdDate){
        this.userId = userId;
        this.username = username;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
    }

    @Id
    @Column(name = "USER_ID", unique = true, nullable = false, precision = 5, scale = 0)
    public int getUserId(){
        return this.userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    @Column(name = "USERNAME", nullable = false, length = 30)
    public String getUsername(){
        return username;
    }


}
