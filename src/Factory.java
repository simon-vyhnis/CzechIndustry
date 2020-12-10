public class Factory {
    private String name;
    private String industryType;
    private String city;

    public Factory(String name, String industryType, String city) {
        this.name = name;
        this.industryType = industryType;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
