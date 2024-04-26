package com.cricket.iplinfo;
import java.util.*;
import com.cricket.iplinfo.entity.Match;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

@SpringBootApplication
public class IplinfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IplinfoApplication.class, args);
	}

}
