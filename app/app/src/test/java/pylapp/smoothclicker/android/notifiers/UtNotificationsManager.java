/*
    MIT License

    Copyright (c) 2016  Pierre-Yves Lapersonne (Mail: dev@pylapersonne.info)

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
 */
// ✿✿✿✿ ʕ •ᴥ•ʔ/ ︻デ═一

package pylapp.smoothclicker.android.notifiers;

import android.content.Context;

import pylapp.smoothclicker.android.AbstractTest;
import pylapp.smoothclicker.android.notifiers.NotificationsManager;

import org.junit.Test;
import static org.junit.Assert.assertNull;


/**
 * Class to test the NotificationsManager
 *
 * @author Pierre-Yves Lapersonne
 * @version 1.0.0
 * @since 21/03/2016
 * @see pylapp.smoothclicker.android.AbstractTest
 */
public class UtNotificationsManager extends AbstractTest {


    /***
     * Tests the singleton init
     */
    @Test
    public void getInstance(){

        l(this, "@Test getInstance");

        Context nullContext = null;
        NotificationsManager instance = NotificationsManager.getInstance(nullContext);
        assertNull("The instance of NotificationsManager must be null", instance);

    }

}
