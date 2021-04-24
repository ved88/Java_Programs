// *************Recursive Digit Sum*************

// Hecker Rank problem  : https://www.hackerrank.com/challenges/recursive-digit-sum/problem

// solution using java8 feature stream

// please use varaible name apporiprate
 
static int sum(StringBuilder stringBuilder) {

        return stringBuilder.chars()
                            .map(c -> Character.getNumericValue(c))
                            .reduce(0, (a,b) -> a+b);
}

static int superDigit(String n, int k) {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n);

        if (n.length() > 1) {

            int temp = sum(stringBuilder);
            stringBuilder.setLength(0);
            stringBuilder.append(temp);
            while(temp > 9) {
                temp = sum(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append(temp);
                }
        // As above and below code are doing same thing better to create new function and call that function 2 times
        // if we append k times string in first call then with stringBuilder then errow we get
        // java.lang.OutOfMemoryError: Java heap space


            temp *= k;
            stringBuilder.setLength(0);
            stringBuilder.append(temp);
            temp = sum(stringBuilder);
            stringBuilder.setLength(0);
            stringBuilder.append(temp);
            while(temp > 9) {
                temp = sum(stringBuilder);
                stringBuilder.setLength(0);
                stringBuilder.append(temp);
                }
                return temp;
        } else {
            return Character.getNumericValue(n.charAt(0));
        }
}
