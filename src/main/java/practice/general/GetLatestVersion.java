package practice.general;


import java.util.Optional;

/*
Among the given 2 versions, find the latest one
1.0.1 & 1.0.2  => 1.0.2
1.4 & 3.0 => 3.0
1.1.2 & 2  => 2
1.0.0 & 1.0.0 => 1.0.0
 */
public class GetLatestVersion {

    public static void main(String[] args) {
        try{
            String result = new GetLatestVersion().getLatestVer("3.1", "3");
            System.out.println(result);

        }catch (Exception e){

        }

    }

    public String getLatestVer(String str1, String str2) throws Exception {

        String ver1 = Optional.ofNullable(str1).orElseThrow(() -> new IllegalArgumentException("Version 1 can not be null or empty"));
        String ver2 = Optional.ofNullable(str2).orElseThrow(() -> new IllegalArgumentException("Version 1 can not be null or empty"));

        String[] strArrVer1;
        String[] strArrVer2;

        String result = null;

        try {
            if(!ver1.contains(".") && !ver2.contains(".")){
               result= Integer.parseInt(ver1) - Integer.parseInt(ver2) >0? str1 : str2;
            }
            else if(!ver1.contains(".") && ver2.contains(".")){
                strArrVer2 = ver2.split("\\.");
                result= Integer.parseInt(ver1) - Integer.parseInt(strArrVer2[0]) >0? str1 : str2;

            }else if (ver1.contains(".") && !ver2.contains(".")){
                strArrVer1 = ver1.split("\\.");
                result= Integer.parseInt(strArrVer1[0]) - Integer.parseInt(ver2) >0? str1 : str2;
            }else{
                strArrVer1 = ver1.split("\\.");
                strArrVer2 = ver2.split("\\.");
                int num = Math.min(strArrVer1.length, strArrVer2.length);

                for(int i =0; i<num; i++){
                    int verOne = Integer.parseInt(strArrVer1[i]);
                    int verTwo = Integer.parseInt(strArrVer2[i]);

                    if(verOne - verTwo >0 ){
                        result = str1;
                        break;
                    }else if(verOne - verTwo < 0){
                        result = str2;
                        break;
                    }
                }
            }

            if( result == null){
                result = str1.length()>str2.length()? str1 : str2;
            }

            return  result;
        }
        catch(Exception e){
            throw new Exception("Exception in program!");
        }
    }
}
