

Doc for the answer of test 3.
1. Just give a simple framework as an application.
2. The file operation of the luns info table don¡¯t implement.

  (Generated setup: java1.8 axis2-1.7.4 tomcat8.5.11 eclipse 4.5.2)
4. The ¡°concurrent request ¡° function was not tested.
5. The item ¡°unit test¡± are not implemented.


Doc for main files
1.  webarrayop.wsdl is the web service result.
2.  my_service.aar is the deploy file to the axis2 under tomcat.
3. src.7z is the source java files.


Doc for the main java classes .
1. Test.java could test every request function as an application
2. ArrayLunOp.java is the class which manage the lun operations such as create or remove.
3. OpEngine.java will deal with the lun operations .
4. FileOp.java will handle the luns info table.



Doc for the lun info table.

The lun info table format is like below.
	//contents format like below of luntable file
	//luns_max_num=100
	//total_size=1000M
	//max_size=1000M 
	//
	//lun_no=1 lun_name=lun1 lun_size=100M  
	//lun_no=2 lun_name=lun2 lun_size=100M  
	//



Doc for the test example result


Output after Test.java run:
done
open luntable file 
Processing op:createlun---100
close luntable file
lun info: ok
open luntable file 
Processing op:getinfo---lun1
close luntable file
done
open luntable file 
Processing op:createmullun---2---100
close luntable file
lun info: ok
open luntable file 
Processing op:getinfo---lun2
close luntable file
done
open luntable file 
Processing op:resizelun---lun1---200
close luntable file
done
open luntable file 
Processing op:removelun---lun2
close luntable file

