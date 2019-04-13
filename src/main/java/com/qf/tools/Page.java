package com.qf.tools;

/*初始化只需要设置currentPage,totalCount */
public class Page {
    private int currentPage = 1;
    private int totalPage;
    private int pageSize = 5;
    private int start;
    private int totalCount;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
        setStart((currentPage-1)*pageSize);
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
        setTotalPage(totalCount%pageSize==0?totalCount/pageSize:totalCount/pageSize+1);
    }

    @Override
    public String toString() {
        return "Page{" +
                "currentPage=" + currentPage +
                ", totalPage=" + totalPage +
                ", pageSize=" + pageSize +
                ", start=" + start +
                ", totalCount=" + totalCount +
                '}';
    }
}
