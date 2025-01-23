package ru.netology.unit;

import static org.testng.Assert.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashBackServiceTest {
    @Test
    public void shouldReturn100IfAmountIs900() {
        CashBackService service = new CashBackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {
        CashBackService service = new CashBackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn500IfAmountIs1500() {
        CashBackService service = new CashBackService();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }
}