/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author admin
 */
public class InterviewSchedule {
    private int interviewschedule_id;
    private String sender_id;
    private String mentor_id;
    private String project_code;
    private String message;
    private String title;
    private Time time;
    private Date date_start;
    private String room;

    public InterviewSchedule() {
    }

    public InterviewSchedule(int interviewschedule_id, String sender_id, String mentor_id, String project_code, String message, String title, Time time, Date date_start, String room) {
        this.interviewschedule_id = interviewschedule_id;
        this.sender_id = sender_id;
        this.mentor_id = mentor_id;
        this.project_code = project_code;
        this.message = message;
        this.title = title;
        this.time = time;
        this.date_start = date_start;
        this.room = room;
    }

    public int getInterviewschedule_id() {
        return interviewschedule_id;
    }

    public void setInterviewschedule_id(int interviewschedule_id) {
        this.interviewschedule_id = interviewschedule_id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getMentor_id() {
        return mentor_id;
    }

    public void setMentor_id(String mentor_id) {
        this.mentor_id = mentor_id;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    
    
}
