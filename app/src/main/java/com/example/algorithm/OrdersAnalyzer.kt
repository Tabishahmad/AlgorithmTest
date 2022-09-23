package com.example.algorithm

import android.os.Build
import androidx.annotation.RequiresApi
import java.math.BigDecimal
import java.time.DayOfWeek
import java.time.LocalDateTime

class OrdersAnalyzer {

    data class Order(val orderId: Int, val creationDate: LocalDateTime, val orderLines: List<OrderLine>)

    data class OrderLine(val productId: Int, val name: String, val quantity: Int, val unitPrice: BigDecimal)

    @RequiresApi(Build.VERSION_CODES.O)
    fun averageDailySales(orders: List<Order>): Map<DayOfWeek, Int> {
        var numOfOrdersPerDayOfWeek: HashMap<DayOfWeek, Int> = HashMap();

        for (order in orders) {
            var dayOfWeek: DayOfWeek = order.creationDate.dayOfWeek;
            for (orderLine in order.orderLines) {
                addOrderQuantityToDay(orderLine, numOfOrdersPerDayOfWeek, dayOfWeek)
            }
        }

        return numOfOrdersPerDayOfWeek.toSortedMap();
    }
    private fun addOrderQuantityToDay(orderLine: OrderLine, numOfOrdersPerDayOfWeek: HashMap<DayOfWeek, Int>, dayOfWeek: DayOfWeek) {
        var quantity = orderLine.quantity;
        if (quantity > 0) {
            if (!numOfOrdersPerDayOfWeek.containsKey(dayOfWeek)) {
                numOfOrdersPerDayOfWeek.put(dayOfWeek, 0);
            }
            var updateOrderSum: Int = numOfOrdersPerDayOfWeek.get(dayOfWeek)!! + quantity;
            numOfOrdersPerDayOfWeek.put(dayOfWeek, updateOrderSum);
        }
    }
    fun maxPower(s: String): Int {
        var count = 0
        var maxCount = 0
        var previous = ' '
        var sb = StringBuffer()
        for (i in 0 until s.length) {
            val c = s[i]
            if (c == previous) {
                // if same as previous one, increase the count
                count++
            } else {
                // else, reset the count
                count = 1
                previous = c
            }
            maxCount = Math.max(maxCount, count)
        }
        return maxCount
    }

}