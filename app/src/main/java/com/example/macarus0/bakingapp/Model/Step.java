package com.example.macarus0.bakingapp.Model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;


@Entity(foreignKeys = @ForeignKey(entity = BaseRecipe.class,
        parentColumns = "id", childColumns = "recipeId"))
public class Step {
    @PrimaryKey(autoGenerate = true)
    int stepId;

    public void setStepNumber(int stepNumber) {
        this.id = stepNumber;
    }

    @ColumnInfo(name = "stepNumber")
    int id;
    int recipeId;
    String shortDescription;

    public void setDescription(String description) {
        this.description = description;
    }

    String description;

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    String videoURL;

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    String thumbnailUrl;
    @Ignore
    public int getRecipeId() {
        return recipeId;
    }
    @Ignore
    public int getStepId() {
        return stepId;
    }
    @Ignore
    public String getShortDescription() {
        return shortDescription;
    }
    @Ignore
    public String getDescription() {
        return description;
    }
    @Ignore
    public String getVideoUrl() {
        return videoURL;
    }
    @Ignore
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }
    @Ignore
    public int getStepNumber() {
        return id;
    }
}