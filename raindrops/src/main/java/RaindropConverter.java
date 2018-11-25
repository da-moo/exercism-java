class RaindropConverter {

    String convert(int number) {
        StringBuilder retVal = new StringBuilder();

        if (number % 3 == 0)
            retVal.append("Pling");
        if (number % 5 == 0)
            retVal.append("Plang");
        if (number % 7 == 0)
            retVal.append("Plong");
        if (retVal.length() == 0)
            retVal.append(number);

        return retVal.toString();
    }

}
