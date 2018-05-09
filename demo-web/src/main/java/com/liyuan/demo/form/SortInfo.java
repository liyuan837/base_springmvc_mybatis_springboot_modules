package com.liyuan.demo.form;

public class SortInfo {
    public String field;
    public String sort;

    public String toString() {
        StringBuilder sb = new StringBuilder("SortInfo{");
        sb.append("field='").append(this.field).append('\'');
        sb.append(", sort='").append(this.sort).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public SortInfo() {
    }

    public String getField() {
        return this.field;
    }

    public String getSort() {
        return this.sort;
    }

    public void setField(String field) {
        this.field = field;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof SortInfo)) {
            return false;
        } else {
            SortInfo other = (SortInfo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$field = this.getField();
                Object other$field = other.getField();
                if (this$field == null) {
                    if (other$field != null) {
                        return false;
                    }
                } else if (!this$field.equals(other$field)) {
                    return false;
                }

                Object this$sort = this.getSort();
                Object other$sort = other.getSort();
                if (this$sort == null) {
                    if (other$sort != null) {
                        return false;
                    }
                } else if (!this$sort.equals(other$sort)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof SortInfo;
    }

    public int hashCode() {
        Object $field = this.getField();
        int result = 1 * 59 + ($field == null ? 43 : $field.hashCode());
        Object $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : $sort.hashCode());
        return result;
    }
}