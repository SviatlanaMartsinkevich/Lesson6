package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Milestone {
    private String name;
    private String description;
    @SerializedName(value = "is_completed")
    private boolean isCompleted;
    @SerializedName(value = "is_started")
    private boolean isStarted;
    @SerializedName(value = "parent_id")
    private Integer parentId;
    private String refs;
    @SerializedName(value = "due_on")
    private int dueOn;
    @SerializedName(value = "start_on")
    private int startOn;
}
