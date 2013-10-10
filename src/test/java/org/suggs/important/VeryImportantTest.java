package org.suggs.important;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class VeryImportantTest{

    @Test
    public void doesSomeReallyImportantThingsAndTheWorldIsSafeAsAResult(){
        assertThat(VeryImportant.checkTheWorld(), is(VeryImportant.SAFE));
    }

}
