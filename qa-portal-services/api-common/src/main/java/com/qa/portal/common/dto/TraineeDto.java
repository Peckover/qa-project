package com.qa.portal.common.dto;

public final class TraineeDto extends QaUserDto {

    private QaCohortDto cohort;

    public QaCohortDto getCohort() {
        return cohort;
    }

    public void setCohort(QaCohortDto cohort) {
        this.cohort = cohort;
    }

//	@JsonCreator
//	public QaTraineeDto(@JsonProperty Integer id, @JsonProperty String userName, @JsonProperty QaCohortDto cohort) {
//		super(id, userName);
//		this.cohort = cohort;
//	}

    public TraineeDto() {

    }

}
