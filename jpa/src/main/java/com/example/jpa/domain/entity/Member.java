package com.example.jpa.domain.entity;

import com.example.jpa.domain.type.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "MEMBERS")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder @Getter
public class Member {
    @Id
    @GeneratedValue
    @Column(name = "MEMBER_ID")
    private UUID id;
    @Column(name = "MEMBER_NAME")
    private String name;
    @Column(name = "MEMBER_GENDER")
    @Enumerated(EnumType.ORDINAL)
    private Gender gender;
}
