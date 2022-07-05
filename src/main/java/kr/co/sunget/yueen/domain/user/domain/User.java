package kr.co.sunget.yueen.domain.user.domain;

import kr.co.sunget.yueen.global.entity.BaseEntity;
import kr.co.sunget.yueen.global.enums.UserRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tbl_user")
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true)
    private String accountId;

    @Column(columnDefinition = "VARCHAR(45)", nullable = false, unique = true)
    private String email;

    @Column(columnDefinition = "CHAR(60)", nullable = false)
    private String password;

    @Column(columnDefinition = "VARCHAR(30)", nullable = false)
    private String name;

    private String imageUrl;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    private UserRole role;

    @Builder
    public User(String accountId, String email, String password, String name, String imageUrl, UserRole role) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.name = name;
        this.imageUrl = imageUrl;
        this.role = role;
    }

}
