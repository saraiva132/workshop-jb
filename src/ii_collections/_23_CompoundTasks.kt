package ii_collections

// Return the set of customers who ordered the specified product
fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> = customers.filter {
        it.orderedProducts.contains(product)
    }.toSet()

// Return the most expensive product among all delivered products
fun Customer.getMostExpensiveDeliveredProduct(): Product? = orders?.filter {
    it.isDelivered
}.flatMap { it.products }.maxBy { it.price }

// Return the number of times the given product was ordered.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int = customers.flatMap {
    it.orders
}.flatMap {
    it.products
}.count { it == product }
