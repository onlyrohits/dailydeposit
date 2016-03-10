package com.smilingbuddha.dailydeposit.Activity.Model;

/**
 * Created by Sani on 3/7/16.
 */
public class ReceiptModel {

    public String branch_code;
    public String account_no;
    public String customer_no;
    public String customer_name;
    public int opening_balance;
    public int deposit_amount;
    public int agent_code;
    public String current_collection_date;
    public String maturity_date;
    public String previous_collection_date;

    public String getPrevious_collection_date() {
        return previous_collection_date;
    }

    public void setPrevious_collection_date(String previous_collection_date) {
        this.previous_collection_date = previous_collection_date;
    }

    public String getMaturity_date() {
        return maturity_date;
    }

    public void setMaturity_date(String maturity_date) {
        this.maturity_date = maturity_date;
    }

    public String getCurrent_collection_date() {
        return current_collection_date;
    }

    public void setCurrent_collection_date(String current_collection_date) {
        this.current_collection_date = current_collection_date;
    }

    public int getAgent_code() {
        return agent_code;
    }

    public void setAgent_code(int agent_code) {
        this.agent_code = agent_code;
    }

    public int getDeposit_amount() {
        return deposit_amount;
    }

    public void setDeposit_amount(int deposit_amount) {
        this.deposit_amount = deposit_amount;
    }

    public int getOpening_balance() {
        return opening_balance;
    }

    public void setOpening_balance(int opening_balance) {
        this.opening_balance = opening_balance;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_no() {
        return customer_no;
    }

    public void setCustomer_no(String customer_no) {
        this.customer_no = customer_no;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }

    public String getBranch_code() {
        return branch_code;
    }

    public void setBranch_code(String branch_code) {
        this.branch_code = branch_code;
    }
}
