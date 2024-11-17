package com.gm.iot.hub.analyzer.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Table(name="data")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long sensorId;
    private LocalDateTime timestamp;
    private double measurement;
    @Column(name = "type")
    @Enumerated(value=EnumType.STRING)
    private MeasurementType measurementType;

}
