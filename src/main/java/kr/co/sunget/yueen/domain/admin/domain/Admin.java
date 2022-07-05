package kr.co.sunget.yueen.domain.admin.domain;

import kr.co.sunget.yueen.global.entity.BaseEntity;
import kr.co.sunget.yueen.global.enums.UserRole;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Table;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tbl_admin")
public class Admin extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(20)", nullable = false, unique = true)
    private String accountId;

    @Column(columnDefinition = "VARCHAR(60)", nullable = false)
    private String password;

    @Column(columnDefinition = "VARCHAR(5)", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @Builder
    public Admin(String accountId, String password, UserRole role) {
        this.accountId = accountId;
        this.password = password;
        this.role = role;
    }

}
