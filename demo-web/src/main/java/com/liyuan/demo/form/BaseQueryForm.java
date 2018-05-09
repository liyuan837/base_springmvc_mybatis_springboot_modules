//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.liyuan.demo.form;

import io.swagger.annotations.ApiModelProperty;
import java.util.List;

public class BaseQueryForm {
    @ApiModelProperty("分页每页条数")
    public Integer pageSize = Integer.valueOf(20);
    @ApiModelProperty("分页页码")
    public Integer pageNum = Integer.valueOf(0);
    @ApiModelProperty("排序字段")
    public List<SortInfo> sortInfos;

    public String toString() {
        StringBuilder sb = new StringBuilder("BaseForm{");
        sb.append("pageSize=").append(this.pageSize);
        sb.append(", pageNum=").append(this.pageNum);
        sb.append('}');
        return sb.toString();
    }

    public BaseQueryForm() {
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public Integer getPageNum() {
        return this.pageNum;
    }

    public List<SortInfo> getSortInfos() {
        return this.sortInfos;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public void setSortInfos(List<SortInfo> sortInfos) {
        this.sortInfos = sortInfos;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BaseQueryForm)) {
            return false;
        } else {
            BaseQueryForm other = (BaseQueryForm)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label47: {
                    Object this$pageSize = this.getPageSize();
                    Object other$pageSize = other.getPageSize();
                    if (this$pageSize == null) {
                        if (other$pageSize == null) {
                            break label47;
                        }
                    } else if (this$pageSize.equals(other$pageSize)) {
                        break label47;
                    }

                    return false;
                }

                Object this$pageNum = this.getPageNum();
                Object other$pageNum = other.getPageNum();
                if (this$pageNum == null) {
                    if (other$pageNum != null) {
                        return false;
                    }
                } else if (!this$pageNum.equals(other$pageNum)) {
                    return false;
                }

                Object this$sortInfos = this.getSortInfos();
                Object other$sortInfos = other.getSortInfos();
                if (this$sortInfos == null) {
                    if (other$sortInfos != null) {
                        return false;
                    }
                } else if (!this$sortInfos.equals(other$sortInfos)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BaseQueryForm;
    }

    public int hashCode() {
        Object $pageSize = this.getPageSize();
        int result = 1 * 59 + ($pageSize == null ? 43 : $pageSize.hashCode());
        Object $pageNum = this.getPageNum();
        result = result * 59 + ($pageNum == null ? 43 : $pageNum.hashCode());
        Object $sortInfos = this.getSortInfos();
        result = result * 59 + ($sortInfos == null ? 43 : $sortInfos.hashCode());
        return result;
    }
}
