package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.CardsDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

// eureka에 등록된 msa의 이름과 동일해야한다.
@FeignClient(value = "cards",fallback = CardsFallback.class)
public interface CardsFeignClient {

	//valid 관련 파라미터는 필요없다.
	//메소드 이름이 같으면 된다.
	//carddto처럼 다른 패키지에 있는 경우 그대로 복사하여 새로 만든다.
	@GetMapping(value = "/api/fetch", consumes = "application/json")
	public ResponseEntity<CardsDto> fetchCardDetails(@RequestHeader("eazybank-correlation-id")
		String correlationId, @RequestParam	String mobileNumber);
}
