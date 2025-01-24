package ru.netology.unit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Assert;

public class CashBackServiceTest1 {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashBackService service = new CashBackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashBackService service = new CashBackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        CashBackService service = new CashBackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(expected, actual);
    }
}