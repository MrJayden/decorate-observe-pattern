package com.learn.gupao.observeablepattern.events;


import com.learn.gupao.observeablepattern.events.mouseevent.Mouse;
import com.learn.gupao.observeablepattern.events.mouseevent.MouseEventCallback;
import com.learn.gupao.observeablepattern.events.mouseevent.MouseEventType;

import static com.learn.gupao.observeablepattern.events.mouseevent.MouseEventType.*;

/**
 * Created by Tom on 2019/3/17.
 */
public class MouseEventTest {
    public static void main(String[] args) {

        MouseEventCallback callback = new MouseEventCallback();

        Mouse mouse = new Mouse();

        //@谁？  @回调方法
        mouse.addLisenter(ON_CLICK,callback);
        mouse.addLisenter(ON_FOCUS,callback);

        mouse.click();

        mouse.focus();


    }
}
