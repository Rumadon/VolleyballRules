package ianto.solutions.volleyballrules.models;

public class Rule {
    private String ruleNumber;
    private String ruleTitle;
    private String ruleText;

    public Rule(String ruleNumber, String ruleTitle, String ruleText) {
        this.ruleNumber = ruleNumber;
        this.ruleTitle = ruleTitle;
        this.ruleText = ruleText;
    }

    public String getRuleNumber() {
        return ruleNumber;
    }

    public String getRuleText() {
        return ruleText;
    }

    public String getRuleTitle() {
        return ruleTitle;
    }
}
