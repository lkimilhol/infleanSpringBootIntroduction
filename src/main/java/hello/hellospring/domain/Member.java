package hello.hellospring.domain;

import javax.persistence.*;

@Entity
public class Member {

    //아이텐티티는 db에서 값을 주는것을 뜻함
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
