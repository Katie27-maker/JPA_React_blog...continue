package com.lec.bt70_JPA_KANBAN.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity(name = "authority")
public class Authority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // PK

    @Column(length = 40, nullable = false, unique = true)   // 제약조건
    private String name;  // 권한명 ex) "ROLE_MEMBER", "ROLE_ADMIN"
}











