package me.myProjects.lottyMock.algorithms;

import me.myProjects.lottyMock.bean.LotteryTicket;
import me.myProjects.lottyMock.excel.Processor;

import java.util.List;

/**
 * Created by chendong on 2017/2/16.
 * <p>
 * normal algorithm
 */
public class Normal extends Algorithm {

    public Normal() {
        super();
    }

    public Normal(List<LotteryTicket> dataList) {
        super(dataList);
    }

    public Normal(List<LotteryTicket> dataList, int fetchSize) {
        super(dataList, fetchSize);
    }

    @Override
    public LotteryTicket calculation(boolean mock, int fetchSize) {
        if (mock) {

        }
        this.dataList = this.dataList.subList(this.dataList.size() - fetchSize, this.dataList.size());
        this.blue = Processor.getBlueLotty(dataList);
        this.red = Processor.getRedLotty(dataList);
        return null;
    }


}
