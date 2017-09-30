package com.syx.demo;

import com.lmax.disruptor.EventFactory;

/**
 * Created by shao_yx on 2017/9/28.
 */
public class LongEventFactory implements EventFactory {
    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
