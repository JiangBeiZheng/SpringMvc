package com.test.pojo;

/**
 * @Author:JIANGBEI
 * @Date:2020/5/29 21:42
 * @Version: 1.0
 */
public class Crm {
    private String dict_id;
    private String dict_enable;
    private String dict_item_Code;
    private String dict_memo;
    private String dict_sort;
    private String dict_type_Code;
    private String dict_type_Name;
    private String dict_item_Name;

    public String getDict_item_Name() {
        return dict_item_Name;
    }

    public void setDict_item_Name(String dict_item_Name) {
        this.dict_item_Name = dict_item_Name;
    }

    public String getDict_id() {
        return dict_id;
    }

    public void setDict_id(String dict_id) {
        this.dict_id = dict_id;
    }

    public String getDict_enable() {
        return dict_enable;
    }

    public void setDict_enable(String dict_enable) {
        this.dict_enable = dict_enable;
    }

    public String getDict_item_Code() {
        return dict_item_Code;
    }

    public void setDict_item_Code(String dict_item_Code) {
        this.dict_item_Code = dict_item_Code;
    }

    public String getDict_memo() {
        return dict_memo;
    }

    public void setDict_memo(String dict_memo) {
        this.dict_memo = dict_memo;
    }

    public String getDict_sort() {
        return dict_sort;
    }

    public void setDict_sort(String dict_sort) {
        this.dict_sort = dict_sort;
    }

    public String getDict_type_Code() {
        return dict_type_Code;
    }

    public void setDict_type_Code(String dict_type_Code) {
        this.dict_type_Code = dict_type_Code;
    }

    public String getDict_type_Name() {
        return dict_type_Name;
    }

    public void setDict_type_Name(String dict_type_Name) {
        this.dict_type_Name = dict_type_Name;
    }

    @Override
    public String toString() {
        return "Crm{" +
                "dict_id='" + dict_id + '\'' +
                ", dict_enable='" + dict_enable + '\'' +
                ", dict_item_Code='" + dict_item_Code + '\'' +
                ", dict_memo='" + dict_memo + '\'' +
                ", dict_sort='" + dict_sort + '\'' +
                ", dict_type_Code='" + dict_type_Code + '\'' +
                ", dict_type_Name='" + dict_type_Name + '\'' +
                ", dict_item_Name='" + dict_item_Name + '\'' +
                '}';
    }
}
