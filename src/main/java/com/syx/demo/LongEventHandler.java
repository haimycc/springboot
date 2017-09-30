package com.syx.demo;

import com.lmax.disruptor.EventHandler;
/**
 * Created by shao_yx on 2017/9/28.
 */

public class LongEventHandler implements EventHandler<LongEvent> {
    @Override
    public void onEvent(LongEvent longEvent, long l, boolean b) throws Exception {
        System.out.println(longEvent.getValue());
    }
}
