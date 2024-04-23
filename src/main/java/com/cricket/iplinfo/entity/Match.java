package com.cricket.iplinfo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="STUDENT")
public class Match{
    @Id
    @Column(name = "fingerprint", unique = true)
    private String fingerprint;

    @Column
    private String name;

    @Column
    private String usn;
}
