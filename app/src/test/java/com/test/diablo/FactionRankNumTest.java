package com.test.diablo;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Diablo on 2016/12/23.
 */
public class FactionRankNumTest {

    private FactionRankNum factionRankNum;

    @Before
    public void setUp() throws Exception {
        factionRankNum = new FactionRankNum();
    }


    @Test
    public void getFactionNum_40() throws Exception {
        assertEquals("40", factionRankNum.getFactionNum(40));
    }

    @Test
    public void getFactionNum_100() throws Exception {
        assertEquals("小于100", factionRankNum.getFactionNum(100));
    }

    @Test
    public void getFactionNum_50() throws Exception {
        assertEquals("50", factionRankNum.getFactionNum(50));
    }

    @Test
    public void getFactionNum_105() throws Exception {
        assertEquals("小于200", factionRankNum.getFactionNum(105));
    }

    @Test
    public void getFactionNum_225() throws Exception {
        assertEquals("小于300", factionRankNum.getFactionNum(225));
    }

    @Test
    public void getFactionNum_385() throws Exception {
        assertEquals("小于400", factionRankNum.getFactionNum(385));
    }

    @Test
    public void getFactionNum_501() throws Exception {
        assertEquals("大于500", factionRankNum.getFactionNum(501));
    }

    @Test
    public void getFactionNum_0() throws Exception {
        assertEquals("wrong num", factionRankNum.getFactionNum(0));
    }
}