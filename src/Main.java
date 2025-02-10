public class Main {
    public static void main(String[] args) {
        // Начальная сумма на счету клиента
        int initialBalance = 100;

        // Сумма пополнения
        int depositAmount = 1100; // Можно изменить на любое значение

        // Порог для начисления бонусов
        int bonusThreshold = 1000;

        // Размер бонуса за каждые полные 100 рублей
        int bonusPerHundred = 1;

        // Рассчитываем бонусные рубли
        int bonus = (depositAmount > bonusThreshold) ? (depositAmount / 100) * bonusPerHundred : 0;

        // Итоговый баланс
        int finalBalance = initialBalance + depositAmount + bonus;

        // Выводим результат
        System.out.println("Бонусные рубли: " + bonus);
        System.out.println("Итоговый баланс: " + finalBalance);
    }
}
