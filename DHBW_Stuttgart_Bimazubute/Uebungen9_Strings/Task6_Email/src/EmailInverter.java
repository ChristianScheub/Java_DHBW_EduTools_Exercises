public class EmailInverter {

    public String invertDomain(String email) {

        StringBuilder newString = new StringBuilder();

        if(email.contains("@")){
            String[] splitToGetDomain = email.split("@");
            String domain = splitToGetDomain[1];

            String [] splitDomain = domain.split("\\.");

            newString.append(splitToGetDomain[0]+"@");

            for(int i = splitDomain.length-1; i >= 0; i--){
                newString.append(splitDomain[i]);
                if (i != 0){
                    newString.append(".");
                }
            }
        }

        return newString.toString();
    }
}
