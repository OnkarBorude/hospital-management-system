package patient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchPatientRequest {
	
	private Integer patientId;
	private String patientNameEng;
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public String getPatientNameEng() {
		return patientNameEng;
	}
	public void setPatientNameEng(String patientNameEng) {
		this.patientNameEng = patientNameEng;
	}
	

}
