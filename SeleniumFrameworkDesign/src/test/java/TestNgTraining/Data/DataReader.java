package TestNgTraining.Data;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataReader {

	public List<HashMap<String,String>> getJsonDataToMap() throws IOException {
		
	String jsonContent = FileUtils.readFileToString(new File(System.getProperty("user.dir")+"\\src\\test\\java\\TestNgTraining\\Data\\PurchaseOrder.json"),
			StandardCharsets.UTF_8);

	//convert string to hashmap   //dependency--jackson databind
		ObjectMapper mapper = new ObjectMapper();
	List<HashMap<String,String>>data=mapper.readValue(jsonContent, new TypeReference<List<HashMap<String,String>>>(){
	});
	return data;
	}			
	}
