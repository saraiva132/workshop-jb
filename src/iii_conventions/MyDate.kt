package iii_conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate>{
    override operator fun compareTo(date : MyDate) : Int {
        if (year != date.year) return year - date.year;
        if (month != date.month) return month - date.month;
        return dayOfMonth - date.dayOfMonth
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class DateRange(public val start: MyDate, public val end: MyDate)
