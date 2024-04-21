
public class LostAndFoundOffice {
    Object[] things = new Object[6];
    int index = 0;


    public void put(Object item) {
        if (item != null) {
            things[index] = item;
            index++;
        } else {
            System.out.println("Бюро(массив) заполнен");
        }
    }

    public boolean check(Object target) {
        if (target == null) {
            System.out.println("Не указан предмет для поиска в бюро находок");
            return false;
        }
        for (Object object : things) {
            if (object != null && object.equals(target)) {
                return true;
            }
        }
        return false;
    }
}

