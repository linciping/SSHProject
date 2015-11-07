package com.llinciping.model;

/**
 * Created by Administrator on 2015/11/6 0006.
 */
public class AccountEntity {
    private int id;
    private String accountno;
    private int balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AccountEntity that = (AccountEntity) o;

        if (id != that.id) return false;
        if (balance != that.balance) return false;
        if (accountno != null ? !accountno.equals(that.accountno) : that.accountno != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (accountno != null ? accountno.hashCode() : 0);
        result = 31 * result + balance;
        return result;
    }
}
