package io.github.tuguzd.simple_calc_template

import org.junit.Test
import org.junit.Assert.*

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun all() {
        assertEquals(calculator.add(2, 2), 4)
        assertEquals(calculator.subtract(4, 2), 2)
        assertEquals(calculator.multiply(2, 2), 4)
        assertEquals(calculator.divide(2, 2), 1)
    }

    @Test
    fun add() {
        assertEquals(calculator.add(3, 2), 5)
        assertEquals(calculator.add(-3, 8), 5)
        assertEquals(calculator.add(7, -3), 4)
        assertEquals(calculator.add(-5, -6), -11)
    }

    @Test
    fun subtract() {
        assertEquals(calculator.subtract(4, 3), 1)
        assertEquals(calculator.subtract(7, 7), 0)
        assertEquals(calculator.subtract(2, 5), -3)
        assertEquals(calculator.subtract(7, -3), 10)
        assertEquals(calculator.subtract(-3, 8), -11)
        assertEquals(calculator.subtract(-5, -1), -4)
    }

    @Test
    fun multiply() {
        assertEquals(calculator.multiply(3, 2), 6)
        assertEquals(calculator.multiply(7, -2), -14)
        assertEquals(calculator.multiply(-6, -1), 6)
        assertEquals(calculator.multiply(-3, 8), -24)
        assertEquals(calculator.multiply(-52, 0), 0)
        assertEquals(calculator.multiply(0, -8), 0)
    }

    @Test
    fun divide() {
        assertEquals(calculator.divide(4, 4), 1)
        assertEquals(calculator.divide(-6, -1), 6)
        assertEquals(calculator.divide(-1, 0), 0)
        assertEquals(calculator.divide(-6, 14), 0)
        assertEquals(calculator.divide(7, -2), -3)
        assertEquals(calculator.divide(0, -99), 0)
        assertEquals(calculator.divide(0, 0), 0)
    }
}
