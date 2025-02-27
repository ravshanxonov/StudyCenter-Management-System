package org.example.study.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.example.study.entity.abs.BaseEntity;
import org.example.study.entity.enums.LessonPlan;
import org.example.study.entity.enums.TimeTableStatus;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
public class TimeTable extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private LessonPlan lessonPlan;
    @Enumerated(EnumType.STRING)
    private TimeTableStatus status;
    private String name;
    @ManyToOne
    private Group group;
    private Integer price;
}
