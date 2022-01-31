package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cases {
    private String title;
    @SerializedName(value = "milestone_id")
    private int milestoneID;
    @SerializedName(value = "priority_id")
    private int priorityID;
    private String refs;
    @SerializedName(value = "section_id")
    private int sectionID;
    @SerializedName(value = "template_id")
    private int templateID;
    @SerializedName(value = "type_id")
    private int typeID;
    private String estimate;
    @SerializedName(value = "suite_id")
    private int suiteID;
}
