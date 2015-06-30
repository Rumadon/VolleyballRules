package ianto.solutions.volleyballrules.activies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import ianto.solutions.volleyballrules.R;
import ianto.solutions.volleyballrules.adapters.RuleListAdapter;
import ianto.solutions.volleyballrules.models.Rule;
import ianto.solutions.volleyballrules.util.RulePopulator;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
        ListView rulesList = (ListView) findViewById(R.id.rule_list);
        TextView rulesHeader = (TextView) findViewById(R.id.list_header);
        rulesHeader.setText("FIVB Beach Volleyball Rules and Interpretations");
        ArrayList<Rule>rules = RulePopulator.getRules();
        RuleListAdapter adapter = new RuleListAdapter(rules, this);
        rulesList.setAdapter(adapter);
    }
}
