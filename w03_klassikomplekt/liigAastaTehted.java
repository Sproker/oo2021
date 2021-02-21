public class liigAastaTehted {
    
    public static boolean Arvutused(int aasta) {
    boolean liigAasta = false;

    // Kui aastaarv on jagatav 4ga, on liigaasta
    if (aasta % 4 == 0) {

      // kui aasta on jagatav 100ga,..
      if (aasta % 100 == 0) {

        // kui aasta on jagatav 400ga,..
        if (aasta % 400 == 0)
          liigAasta = true;
          // kui aasta ei ole jagatav 400ga, on ta tavaline aasta 
          else
            liigAasta = false;
    }

      // kui aasta ei ole jagatav sajaga, siis on liigaasta
      else
        liigAasta = true;
    }
    //kõigil muudel juhtudel on tegu tavalise aastaga
    else
      liigAasta = false;

    if (liigAasta){
        return true;
    }
    return false;
   
   }   

}
