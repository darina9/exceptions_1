/* Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? */
		// 1 - Выход за пределы массива, массив не равный
		// 2 - вместо цифр буквы
		// 3 - Возврат значения не Integer

        public static int sum2d(String[][] arr){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < 5; j++){
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
            return sum;
        }
