package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Section {
    private String name;
    private String description;
    @SerializedName(value = "parent_id")
    private Integer parentID;
    @SerializedName(value = "suite_id")
    private Integer suiteID;
}
