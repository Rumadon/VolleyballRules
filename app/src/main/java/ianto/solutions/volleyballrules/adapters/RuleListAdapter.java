package ianto.solutions.volleyballrules.adapters;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import ianto.solutions.volleyballrules.R;
import ianto.solutions.volleyballrules.models.Rule;

public class RuleListAdapter extends BaseAdapter {
    ArrayList<Rule> rules;
    Context context;


    public RuleListAdapter(ArrayList<Rule> rules, Context context) {
        this.rules = rules;
        this.context = context;
    }

    @Override
    public int getCount() {
        return rules.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item_rule, parent, false);
        TextView ruleNumber = (TextView)view.findViewById(R.id.rule_number);
        TextView ruleTitle = (TextView)view.findViewById(R.id.rule_title);
        final Rule rule = rules.get(position);
        ruleNumber.setText(rule.getRuleNumber());
        ruleTitle.setText(rule.getRuleTitle());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setTitle(rule.getRuleNumber()+ "-" + rule.getRuleTitle());
                builder.setMessage(rule.getRuleText());
                builder.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.show();
            }
        });
        return view;
    }
}
