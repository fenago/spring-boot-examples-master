# package com.fenago.springboot.microservice.example.forex;
package com.fenago.springboot.microservice.example.forex.springbootmicroserviceforexservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);
}
