package com.lifeassistance.Database;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import java.time.LocalDateTime;

@TypeConverters({LocalDateTimeConverter.class})
@Entity(tableName = "tasks_table")
public class Task {
    public static final int TIMED = 0;
    public static final int PROGRESSIVE = 1;

    @PrimaryKey(autoGenerate = true)
    private int _id;

    private String title, details;
    private float progress;
    private int duration, type;
    private LocalDateTime date;
    private boolean isPlaying = false, icCompleted = false;

    public Task(String title, String details, int type, float progress, int duration, LocalDateTime date) {
        this.title = title;
        this.details = details;
        this.type = type;
        this.progress = progress;
        this.duration = duration;
        this.date = date;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public boolean isIcCompleted() {
        return icCompleted;
    }

    public void setIcCompleted(boolean icCompleted) {
        this.icCompleted = icCompleted;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int get_id() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public float getProgress() {
        return progress;
    }

    public void setProgress(float progress) {
        this.progress = progress;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}