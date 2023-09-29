/*
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.
   Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь,
   что все они сохранились во множество.
3. Создайте метод public boolean equals(Object o)
   Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true,
   только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.
 */
public class Cat {
    private String name;
    private String ownerName;
    private String color;

    public Cat(String name, String ownerName, String color){
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;

    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name ='" + name + '\'' +
                ", ownerName ='" + ownerName + '\'' +
                ", color ='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && ownerName.equals(cat.ownerName) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * ownerName.hashCode() + 31 *color.hashCode();
    }
}





















