public class Main {
    //Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
    public static void main(String[] args) {
        String string = "";
        String[] arr = {"111", "222", "333", "111", "444", "333", "555"};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1 ; j < arr.length; j++) {
                if(arr[i] != null && arr[i].equals(arr[j])){
                    arr[j] = null;
                }

            }
            System.out.println(arr[i]);
            if(arr[i] != null)
                string = string +arr[i];

        }

        System.out.println(string);
    }
}