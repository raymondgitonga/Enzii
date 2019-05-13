package com.tosh.enzii;

import android.widget.ListView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(RobolectricTestRunner.class)


public class SelectionActivityTest {
    private SelectionActivity activity;
    private ListView mNewsView;

    @Before
    public void setup(){
        activity = Robolectric.setupActivity(SelectionActivity.class);
        mNewsView = (ListView)activity.findViewById(R.id.newsView);
    }
    @Test
    public void newsViewPopulates(){
        assertNotNull(mNewsView.getAdapter());
        assertEquals(mNewsView.getAdapter().getCount(), 10);
    }
}
