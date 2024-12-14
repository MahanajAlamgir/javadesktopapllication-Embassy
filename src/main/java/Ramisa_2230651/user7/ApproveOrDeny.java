package Ramisa_2230651.user7;

import java.time.LocalDate;

public class ApproveOrDeny {
    private int id;
    private String name,email,visaType,approveOrDeny;
    private float time;
    private LocalDate interviewDate;

    public ApproveOrDeny() {
    }

    public ApproveOrDeny(int id, String name, String email, String visaType, String approveOrDeny, LocalDate interviewDate, float time) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.visaType = visaType;
        this.approveOrDeny = approveOrDeny;
        this.interviewDate = interviewDate;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVisaType() {
        return visaType;
    }

    public void setVisaType(String visaType) {
        this.visaType = visaType;
    }

    public String getApproveOrDeny() {
        return approveOrDeny;
    }

    public void setApproveOrDeny(String approveOrDeny) {
        this.approveOrDeny = approveOrDeny;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    @Override
    public String toString() {
        return "ApproveOrDeny{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", visaType='" + visaType + '\'' +
                ", approveOrDeny='" + approveOrDeny + '\'' +
                ", time=" + time +
                ", interviewDate=" + interviewDate +
                '}';
    }
}
