import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Введите сумму трат")
    val expensesUser = scanner.nextInt()
    println("Совершал ли покупки в прошлом месяце? 1. Да; 2. Нет")
    val yesOrNo = scanner.nextInt()

    var discount: Double
    val discountForMusicFan = 0.01  //1% скидка для метоманов
    val discountForMusicFanInMoney: Double

    discount = if (expensesUser > 10000) {
        expensesUser * 0.05
    } else if (expensesUser <= 1000) {
        0.0
    } else {
        100.0
    }

    var totalPrice = expensesUser - discount

    if (yesOrNo == 1) {
        discountForMusicFanInMoney = totalPrice * discountForMusicFan
        totalPrice = totalPrice * (1 - discountForMusicFan)
        discount = discount + discountForMusicFanInMoney
    }

    val totalMessage = "Ваша скидка $discount рублей. Cумма к оплате: $totalPrice рублей"
    println(totalMessage)
}