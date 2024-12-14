package Ramisa_2230651.user7;

import java.time.LocalDate;

public class OfficialMeetings {
    private int meetingId;
    private String meetingType;
    private float time;
    private LocalDate meetingDate;

    public OfficialMeetings() {
    }

    public OfficialMeetings(int meetingId, String meetingType, float time, LocalDate meetingDate) {
        this.meetingId = meetingId;
        this.meetingType = meetingType;
        this.time = time;
        this.meetingDate = meetingDate;
    }

    public int getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(int meetingId) {
        this.meetingId = meetingId;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }

    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        this.meetingDate = meetingDate;
    }

    @Override
    public String toString() {
        return "OfficialMeetings{" +
                "meetingId=" + meetingId +
                ", meetingType='" + meetingType + '\'' +
                ", time=" + time +
                ", meetingDate=" + meetingDate +
                '}';
    }
}
