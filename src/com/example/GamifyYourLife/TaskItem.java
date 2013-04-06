package com.example.GamifyYourLife;

import android.widget.ImageButton;

public class TaskItem {


    private int value;
    private String displayName;
    private String taskDesc; //freeText
    private boolean isRecurring = false;
    ImageButton imageButton; //Image icon or something? how does checks and stuff work?

    public TaskItem(){

    }

    public TaskItem(String name, int points, String description, boolean isRecurring /* recurringItems class here*/) {
        this.displayName = name;
        this.value = points;
        this.taskDesc = description;
        this.isRecurring = isRecurring;
    }

    public TaskItem(String name, int points) {
        this(name, points, null, false);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public boolean isRecurring() {
        return isRecurring;
    }

    public void setRecurring(boolean recurring) {
        isRecurring = recurring;
    }

    public ImageButton getImageButton() {
        return imageButton;
    }

    public void setImageButton(ImageButton imageButton) {
        this.imageButton = imageButton;
    }


}
