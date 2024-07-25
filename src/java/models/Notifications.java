/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;
import java.sql.Time;

/**
 *
 * @author khanh
 */
public class Notifications {

   private int notification_id;
    private String sender_id;
    private String project_code;
    private String position_code;
    private String message;
    private String title;
    private Time time;
    private Date date_start;
    private Date published_date;
    private String room;
    private String link;
    private String receiver_id;

    public Notifications() {
    }

    public Notifications(int notification_id, String sender_id, String project_code, String position_code, String message, String title, Time time, Date date_start, Date published_date, String room, String link, String receiver_id) {
        this.notification_id = notification_id;
        this.sender_id = sender_id;
        this.project_code = project_code;
        this.position_code = position_code;
        this.message = message;
        this.title = title;
        this.time = time;
        this.date_start = date_start;
        this.published_date = published_date;
        this.room = room;
        this.link = link;
        this.receiver_id = receiver_id;
    }

    public int getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(int notification_id) {
        this.notification_id = notification_id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getProject_code() {
        return project_code;
    }

    public void setProject_code(String project_code) {
        this.project_code = project_code;
    }

    public String getPosition_code() {
        return position_code;
    }

    public void setPosition_code(String position_code) {
        this.position_code = position_code;
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

    public Date getPublished_date() {
        return published_date;
    }

    public void setPublished_date(Date published_date) {
        this.published_date = published_date;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

   
  
}
