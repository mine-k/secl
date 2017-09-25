package secl.common;

public enum FileType {

    HomeProject("_project_result.xlsx"),
    HomeSchedule("_schedule_result.xlsx"),
    HomeSync("_sync_s_to_h_result.xml"),
    HomeSyncLog("_sync_result.log"),
    SiteProject("_project.xlsx"),
    SiteSchedule("_schedule.xlsx"),
    SiteSyncHeadOfficeToSite("_sync_h_to_s.xml"),
    SiteSyncSiteToHeadOffice("_sync_s_to_h.xml");

    private String pattern;

    FileType(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}