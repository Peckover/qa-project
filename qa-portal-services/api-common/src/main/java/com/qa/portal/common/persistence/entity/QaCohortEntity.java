package com.qa.portal.common.persistence.entity;

import java.sql.Date;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(schema = "training", name = "qa_cohort")
public class QaCohortEntity extends QaBaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "qa_cohort_sequence")
    @SequenceGenerator(name = "qa_cohort_sequence",
            sequenceName = "training.qa_cohort_sequence",
            allocationSize = 1)
    private Integer id;

    @Column(name = "cohort_name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @OneToMany(mappedBy = "cohort", fetch = FetchType.LAZY)
    private Set<TraineeEntity> trainees;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private TrainerEntity trainer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<TraineeEntity> getTrainees() {
        return trainees;
    }

    public void setTrainees(Set<TraineeEntity> trainees) {
        this.trainees = trainees;
    }

    public TrainerEntity getTrainer() {
        return trainer;
    }

    public void setTrainer(TrainerEntity trainer) {
        this.trainer = trainer;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
