package utils;

public class Endpoints {
    public static final String GET_ALL_USERS =  "/index.php?/api/v2/get_users";
    public static final String GET_USER =  "/index.php?/api/v2/get_user/{id}";
    public static final String GET_PROJECTS = "/index.php?/api/v2/get_projects";
    public static final String GET_PROJECT = "/index.php?/api/v2/get_project/";
    public static final String ADD_PROJECT = "/index.php?/api/v2/add_project";
    public static final String GET_MILESTONE = "/index.php?/api/v2/get_milestone/{milestone_id}";
    public static final String GET_EMPTY_MILESTONES = "/index.php?/api/v2/get_milestones/1&is_completed=0";
    public static final String GET_MILESTONES = "index.php?/api/v2/get_milestones/{project_id}";
    public static final String ADD_MILESTONE = "/index.php?/api/v2/add_milestone/{project_id}";
    public static final String UPDATE_MILESTONE = "/index.php?/api/v2/update_milestone/{milestone_id}";
    public static final String DELETE_MILESTONE = "/index.php?/api/v2/delete_milestone/{milestone_id}";
    public static final String GET_SECTION = "/index.php?/api/v2/get_section/{section_id}";
    public static final String GET_SECTIONS = "/index.php?/api/v2/get_sections/{project_id}&suite_id={suite_id}";
    public static final String ADD_SECTION = "/index.php?/api/v2/add_section/{project_id}";
    public static final String GET_CASE = "/index.php?/api/v2/get_case/{case_id}";
    public static final String GET_CASES = "/index.php?/api/v2/get_cases/{project_id}&suite_id={suite_id}";
    public static final String ADD_CASE = "/index.php?/api/v2/add_case/{section_id}";
    public static final String UPDATE_CASE = "/index.php?/api/v2/update_case/{case_id}";
    public static final String MOVE_CASES_TO_SECTION = "/index.php?/api/v2/move_cases_to_section/{section_id}";
    public static final String DELETE_CASE = "/index.php?/api/v2/delete_case/{case_id}";

}
