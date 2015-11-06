package ii_collections

fun example2(list: List<Int>) {

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)

    val allZeros: Boolean = list.all(isZero)

    val numberOfZeros: Int = list.count(isZero)

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
}

//is customer from city
fun Customer.isFrom(city: City): Boolean = this.city.equals(city)

//All customers are from given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all { it.city.equals(city) }

//At least one customer from city
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any { it.city.equals(city) }

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int = customers.count { it.city.equals(city) }

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers?.find { it.city.equals(city) }
//or
//fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.firstOrNull { it.city.equals(city) }