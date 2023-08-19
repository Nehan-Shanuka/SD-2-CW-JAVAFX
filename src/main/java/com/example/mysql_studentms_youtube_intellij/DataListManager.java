package com.example.mysql_studentms_youtube_intellij;

import java.util.ArrayList;
import java.util.List;

public class DataListManager {

    private static final DataListManager instance = new DataListManager();
    private List<Ticket> dataList = new ArrayList<>();

    public DataListManager() {
    }

    public static DataListManager getInstance(){
        return instance;
    }

    public void addData(Ticket data) {
        this.dataList.add(data);
    }

    public List<Ticket> getDataList() {
        return dataList;
    }
}
