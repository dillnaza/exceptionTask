## Задание

Создайте класс Person, содержащий информацию о человеке (например, имя и возраст). Затем создайте список объектов этого класса. Если список пуст, выбросите исключение EmptyListException, созданное вами. Обработайте это исключение, выводя пользователю сообщение, что список пуст.

Используйте стримы для фильтрации списка объектов Person, оставив только тех, кто старше определенного возраста. Если после фильтрации список оказывается пустым, выбросите исключение NoMatchingDataException, созданное вами. Обработайте это исключение, выводя пользователю сообщение, что нет данных, соответствующих условию.

Отсортируйте список объектов Person по имени. Если во время сортировки происходит ошибка (например, из-за null-значений), выбросите исключение SortingException, созданное вами. Обработайте это исключение, выводя пользователю сообщение, что сортировка не удалась.

Используйте метод collect для агрегации данных, например, для создания строки со всеми именами объектов Person, разделенными запятой. Если во время агрегации происходит ошибка (например, из-за null-значений), выбросите исключение AggregationException, созданное вами. Обработайте это исключение, выводя пользователю сообщение, что агрегация данных не удалась.

## Инструкции по запуску

Чтобы выполнить задания, выполните следующие шаги:

1. Клонируйте репозиторий на свой компьютер.
```bash
git clone https://github.com/yourusername/exceptionTask.git
```
3. Откройте проект в вашей IDE (например, IntelliJ IDEA).
4. Запустите приложение и следуйте инструкциям для каждого задания.
